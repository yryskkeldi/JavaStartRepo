package my_works;

import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String chinese = "Китайская";
        String dungan = "Дунганская";
        String kyrgyz = "Кыргызская";

        String chineseFood1 = "Утка по-пекински";
        String chineseFood2 = "Курица Гунбао";
        String chineseFood3 = "Тофу Ма По";

        String dunganFood1 = "Ашлянфу";
        String dunganFood2 = "Мампар";
        String dunganFood3 = "Хошан";

        String kyrgyzFood1 = "Беш-Бармак";
        String kyrgyzFood2 = "Плов";
        String kyrgyzFood3 = "Манты";


        System.out.println("Какую кухню предпочитате?");
        System.out.println("1. " + chinese + "\n" + "2. " + dungan + "\n" +  "3. " +  kyrgyz);

        int input = scan.nextInt();
        if (input == 1){
            System.out.println("Добро пожаловать в \"Пекинскую утку\"! \nВыберите одно блюдо:");
            System.out.println("1. " + chineseFood1 + "\n" + "2. " + chineseFood2 + "\n" +  "3. " +  chineseFood3);

            int inputChina = scan.nextInt();
            if (inputChina == 1){
                System.out.println("Ваш заказ " + "\"" + chineseFood1 + "\"" + " оформлен!");
            }
            else if (inputChina == 2){
                System.out.println("Ваш заказ " + "\"" + chineseFood2 + "\"" + " оформлен!");
            }
            else if (inputChina == 3){
                System.out.println("Ваш заказ " + "\"" + chineseFood3 + "\"" + " оформлен!");
            }
        }


        else if (input == 2){
            System.out.println("Добро пожаловать в \"Дапанджи\"! \nВыберите одно блюдо:");
            System.out.println("1. " + dunganFood1 + "\n" + "2. " + dunganFood2 + "\n" +  "3. " +  dunganFood3);

            int inputDungan = scan.nextInt();
            if (inputDungan == 1){
                System.out.println("Ваш заказ " + "\"" + dunganFood1 + "\"" + " оформлен!");
            }
            else if (inputDungan == 2){
                System.out.println("Ваш заказ " + "\"" + dunganFood2 + "\"" + " оформлен!");
            }
            else if (inputDungan == 3){
                System.out.println("Ваш заказ " + "\"" + dunganFood3 + "\"" + " оформлен!");
            }
        }


        else if (input == 3){
            System.out.println("Добро пожаловать в \"Супара\"! \nВыберите одно блюдо:");
            System.out.println("1. " + kyrgyzFood1 + "\n" + "2. " + kyrgyzFood2 + "\n" +  "3. " +  kyrgyzFood3);

            int inputKyrgyz = scan.nextInt();
            if (inputKyrgyz == 1){
                System.out.println("Ваш заказ " + "\"" + kyrgyzFood1 + "\"" + " оформлен!");
            }
            else if (inputKyrgyz == 2){
                System.out.println("Ваш заказ " + "\"" + kyrgyzFood2 + "\"" + " оформлен!");
            }
            else if (inputKyrgyz == 3){
                System.out.println("Ваш заказ " + "\"" + kyrgyzFood3 + "\"" + " оформлен!");
            }
        }


        else {
            System.out.println("Пожалуйста, выберите одно из трёх");
        }
    }
}
// optional cod --> код, который необязателен
// reduntant cod --> ненужный код