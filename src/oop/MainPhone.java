package oop;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {

        Android samsung = new Android("samsung", "S22", 256.01f);

        System.out.println( samsung.call("+996557200100"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("а. Ответить на звонок\nб. Отклонить вызов\nс. Отправить сообщение");

        String button = scanner.next();

        if(button.equals("а")){
            System.out.println(samsung.answer());
        }
        if(button.equals("б")){
            System.out.println(samsung.decline());
        }
        if(button.equals("с")){
            System.out.println("Выберите сообщение: \n1)" + samsung.bla[0] + "\n2)" + samsung.bla[1]);
            String button2 = scanner.next();
            if(button2.equals("1")){
                System.out.println(samsung.bla[0]+samsung.sendMessage());
            }
            if(button2.equals("2")){
                System.out.println(samsung.bla[1]+samsung.sendMessage());
            }
        }
    }
}
