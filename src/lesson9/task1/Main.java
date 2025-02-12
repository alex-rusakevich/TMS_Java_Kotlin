package lesson9.task1;

import lesson9.task1.armor.HeavyArmor;
import lesson9.task1.armor.LightArmor;
import lesson9.task1.armor.MediumArmor;
import lesson9.task1.hero.Hero;

import java.util.Random;
import java.util.Scanner;
import lesson9.task1.hero.Paladin;
import lesson9.task1.hero.Rogue;
import lesson9.task1.hero.Archer;
import lesson9.task1.weapon.Arch;
import lesson9.task1.weapon.Dagger;
import lesson9.task1.weapon.Sword;

public class Main {
    static Hero hero1;
    static Hero hero2;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static Dice dice = new Dice(random);

    private static Hero chooseHero(){
        scanner = new Scanner(System.in);

        System.out.print("Имя: ");
        String name = scanner.nextLine();

        System.out.print("Paladin, rogue or archer? ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                return new Paladin(name, 20, new HeavyArmor(15, 6), new Sword(5, random));
            case 2:
                return new Rogue(name, 15, new MediumArmor(10, 4), new Dagger(10, random));
            case 3:
                return new Archer(name, 10, new LightArmor(5, 2), new Arch(15, random));
        }

        return null;
    }

    private static void fight(){
        if(dice.roll() % 2 == 1) {
            Hero swap = hero1;
            hero1 = hero2;
            hero2 = swap;
        }

        int round = 1;

        while(true) {
            System.out.printf("=== Round %d. Fight! ===\n", round);

            System.out.printf("-> %s attacks %s\n", hero1.name, hero2.name);

            hero2.recieveDamage(hero1.attack(dice.roll()));

            if(!hero2.isAlive()) {
                System.out.printf("%s dies, %s wins!\n", hero2.name, hero1.name);
                break;
            }

            System.out.printf("-> %s attacks %s\n", hero2.name, hero1.name);

            hero1.recieveDamage(hero2.attack(dice.roll()));

            if(!hero1.isAlive()) {
                System.out.printf("%s dies, %s wins!\n", hero1.name, hero2.name);
                break;
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
