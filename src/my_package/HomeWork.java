package my_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num = scan.nextInt();
        int num2 = scan.nextInt();

        int [][] n = new int[num][num2];
        ArrayList<Integer> smth = new ArrayList<>();
        smth.add(76);                                                            //   {76, 21, 45} {123, 148, 154}
        smth.add(21);
        smth.add(45);
        smth.add(123);
        smth.add(148);
        smth.add(154);
        if (num == 2) {
            if (num2 == 3) {
                for (int i = 0; i < smth.size()/3; i++) {
                    for (int j = 0; j < smth.size(); j++) {
                        System.out.println(n[i][j] = smth.get(1));
                    }
                }
            }
        }
    }
}
/*
________________________________________________________________________________________________________________________
        int two   = 2;
        int three = 3;
        int four  = 4;
        int five  = 5;
        int six   = 6;
        int seven = 7;
        int eight = 8;
        int nine  = 9;
        int ten   = 10;

        int factor1 = 0;
        while (factor1 < 10){
            factor1++;
            System.out.print(factor1 + "\t");
        }
        System.out.println("");

        int factor2 = 0;
        while (factor2 < 10){
            factor2++;
            System.out.print(two * factor2 + "\t");
        }
        System.out.println("");

        int factor3 = 0;
        while (factor3 < 10){
            factor3++;
            System.out.print(three * factor3 + "\t");
        }
        System.out.println("");

        int factor4 = 0;
        while (factor4 < 10){
            factor4++;
            System.out.print(four * factor4 + "\t");
        }
        System.out.println("");

        int factor5 = 0;
        while (factor5 < 10){
            factor5++;
            System.out.print(five * factor5 + "\t");
        }
        System.out.println("");

        int factor6 = 0;
        while (factor6 < 10){
            factor6++;
            System.out.print(six * factor6 + "\t");
        }
        System.out.println("");

        int factor7 = 0;
        while (factor7 < 10){
            factor7++;
            System.out.print(seven * factor7 + "\t");
        }
        System.out.println("");

        int factor8 = 0;
        while (factor8 < 10){
            factor8++;
            System.out.print(eight * factor8 + "\t");
        }
        System.out.println("");

        int factor9 = 0;
        while (factor9 < 10){
            factor9++;
            System.out.print(nine * factor9 + "\t");
        }
        System.out.println("");

        int factor10 = 0;
        while (factor10 < 10){
            factor10++;
            System.out.print(ten * factor10 + "\t");
        }
________________________________________________________________________________________________________________________
улучшеная версия кода ↑
        for (int i = 1; i <= 10; i++){

            int f = 0;
            while (f < 10){
                f++;
                System.out.print(i * f + "\t");
            }
            System.out.println("");
        }
    }
}
________________________________________________________________________________________________________________________
 Scanner scan = new Scanner(System.in);

        int score1 = 0;
        int score2 = 0;
        int attempt1 = 2;
        int attempt2 = 3;

        while (score1 <= 2) {
            System.out.println("Введите ваш логин: ");
            String login = scan.nextLine();

            if (login.equals("Yryskeldi")){

                while (score2 <= 3){
                    System.out.println("Введите ваш пароль: ");
                    String password = scan.nextLine();

                    if (password.equals("qwerty")){
                        System.out.println("Верно!");
                        break;
                    }
                    System.err.println("Неверный пароль! Повторите попытку.\n(Кол-во попыток: " + attempt2-- + ")");
                    score2++;
                }
                break;
            }
            System.err.println("Неверный логин! Повторите попытку.\n(Кол-во попыток: " + attempt1-- + ")");
            score1++;
        }
________________________________________________________________________________________________________________________
 */