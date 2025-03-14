package lesson9.fightingGame;

import lesson9.fightingGame.armor.HeavyArmor;
import lesson9.fightingGame.armor.LightArmor;
import lesson9.fightingGame.armor.MediumArmor;
import lesson9.fightingGame.hero.Hero;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import lesson9.fightingGame.hero.Paladin;
import lesson9.fightingGame.hero.Rogue;
import lesson9.fightingGame.hero.Archer;
import lesson9.fightingGame.weapon.Arch;
import lesson9.fightingGame.weapon.Dagger;
import lesson9.fightingGame.weapon.Sword;

/*
Задача 1: Игра дуэль
Напишите консольную игру, где игроки сражаются, по очереди бросая кубик. Всего в игре может быть 3
класса (паладин, разбойник и лучник). У каждого класса должно быть здоровье, броня и оружие. Оружие
должно иметь собственный параметр атаки. Броня имеет защиту, которая блокирует урон, но ее прочность
снижается после каждого блока. Игроки могут выбрать класс, за который они хотят играть. Проигрывает
тот, у кого первым кончилось здоровье.
• Паладин — много здоровья, слабая атака, тяжелая броня
• Разбойник — сильная атака, среднее кол-во здоровья, средняя броня
• Лучник — очень сильная атака, мало здоровья, легкая броня
*/

/*
Задание 1: Совершенствование игры*
Добавьте игровое поле, которое само будет содержать кубик и само регулировать ход игры.
Добавьте возможность нанести критический урон, критический промах и полное блокирование
урона (сделать это таким образом, чтобы пользователь мог сам выбирать критический урон, но
сделать ограниченное кол-во таких атак).
Добавьте механику сближения героев во время каждого хода перед броском кубика
(пользователь сам выбирает идти ли ему вперед, кол-во шагов за ход ограничено).
*/

public class Main {
    static Hero hero1;
    static Hero hero2;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static Dice dice = new Dice(random);

    private static Hero chooseHero(){
        scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Paladin, rogue or archer? ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                return new Paladin(name, 40, new HeavyArmor(15, 6), new Sword(5, random));
            case 2:
                return new Rogue(name, 30, new MediumArmor(10, 4), new Dagger(7, random));
            case 3:
                return new Archer(name, 20, new LightArmor(5, 2), new Arch(9, random));
        }

        return null;
    }

    private static void fight() {
        Scanner commandScanner = new Scanner(System.in);
        int distance = 5;
        List<Hero> heroOrder = List.of(hero1, hero2);

        if(dice.roll() % 2 == 1) { // Swap turns
            heroOrder = List.of(hero2, hero1);
        }

        int round = 1;

        gameLoop:
        while(true) {
            System.out.printf("=== Round %d. Fight! ===\n", round);
            System.out.printf("Distance between heroes: %d m\n", distance);

            for (Hero current_hero : heroOrder) {
                Hero current_enemy;

                if(current_hero == hero1) {
                    current_enemy = hero2;
                } else {
                    current_enemy = hero1;
                }

                System.out.printf("Hero %s, what will you do? [attack, crit(%d), approach] ",
                        current_hero.name, current_hero.getCrits());
                String command = commandScanner.nextLine().trim().toLowerCase();

                switch (command) {
                    case "attack":
                        if(!current_hero.getWeapon().canAttackFromDistance(distance)) {
                            System.out.println("Congrats! You've just showed off and dealt no damage");
                            System.out.println("The distance is not suitable for your weapon");
                            continue;
                        }

                        System.out.printf("%s attacks %s\n", current_hero.name, current_enemy.name);
                        current_enemy.recieveDamage(current_hero.attack(dice.roll()), dice.roll());
                        break;
                    case "crit":
                        if(!current_hero.getWeapon().canAttackFromDistance(distance)) {
                            System.out.println("Congrats! You've just showed off and dealt no damage");
                            System.out.println("The distance is not suitable for your weapon");
                            continue;
                        }

                        System.out.printf("%s CRITICALLY attacks %s\n", current_hero.name, current_enemy.name);

                        if(!current_hero.hasCrits()) {
                            System.out.println("You strained your hands and... did nothing: you have no crits.");
                            System.out.println("Your turn is skipped. ");
                            System.out.println("Be more careful next time.");
                            continue;
                        } else {
                            current_enemy.recievePureDamage(current_hero.criticalAttack());
                        }
                        break;
                    case "approach":
                        if(distance <= 0) {
                            System.out.println("Are you trying to hug him or what? There is no place for approaching");
                            continue;
                        }

                        System.out.println("You approached 1 m");
                        distance--;
                }

                if (!current_enemy.isAlive()) {
                    System.out.printf("%s dies, %s wins!\n", current_enemy.name, current_hero.name);
                    break gameLoop;
                }
            }

            round++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hero1 = chooseHero();
        hero2 = chooseHero();

        fight();
    }
}
