package my_works;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan.nextLine();

        System.out.println("Сколько вам лет?");
        int age = scan.nextInt();

        if (age >= 12){

            System.out.println("Введите ваш email: ");
            String gmail = scan.next();

            System.out.println("Укажите ваш пароль: ");
            String password = scan.next();

            System.out.println("Повторите ваш пароль: ");
            String password2 = scan.next();

            if (password.equals(password2)) {
                System.out.println("Ваше имя: " + name + "\nВаш возраст: " + age + "\nВаш email: " + gmail + "\nВаш пароль: " + password2);
            }

                else {
                System.out.println("Ошибка, неверный пароль.");
            }
        }
        else {
            System.out.println("Нет доступа");
        }
    }
}
