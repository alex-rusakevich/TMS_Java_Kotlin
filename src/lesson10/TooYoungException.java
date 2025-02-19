package lesson10;

public class TooYoungException extends Exception {
    TooYoungException(){
        super("Данная функция недоступна лицам младше 18");
    }
}
