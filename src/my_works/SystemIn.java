package my_works;

import java.util.*;

class LoginRealize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Объявление сканнера

        SystemIn log = new SystemIn("Ырыс", "yrys", "123456789");      // Объявлние конструктора с готовой базой данных

        System.out.println("1 - Создать новый аккаунт \n2 - Войти в существующий");
        int choice = scan.nextInt();

        String names = null;
        String logins = null;
        String passwords = null;
        boolean bool = true;       //двигатель цикла while на 28 строке

        if (choice == 1) {
            System.out.print("Введите ваше имя: ");
            names = scan.next();
            System.out.println("------------------------------");

            System.out.print("Придумайте логин: ");
            logins = scan.next();
            System.out.println("------------------------------");

            while (bool) {
                if (logins.equalsIgnoreCase(log.login)) {
                    System.out.println("Такой логин уже существует. Придумайте другой: ");
                    logins = scan.next();
                } else if(!logins.equals(log.login)){
                    bool = false;
                    scan.nextLine(); //Пустой сканнер, чтобы запустился следующий сканнер
                    System.out.print("Придумайте пароль: ");
                    passwords = scan.nextLine();
                    System.out.println("------------------------------");
                }
            }

            System.out.println("Ваше имя: " + names + "\n" + "Ваш логин: " + logins + "\n" + "Ваш пароль: " + passwords);

        }
        Set<String> dbn = new HashSet<>();     // Set, куда будут сохраняться вводимые имена  (dbs - data base names)
        dbn.add(names);
        dbn.add(log.name);

        Set<String> dbl = new HashSet<>();     // Set, куда будут сохраняться вводимые логины  (dbl - data base logins)
        dbl.add(logins);
        dbl.add(log.login);

        Set<String> dbp = new HashSet<>();     // Set, куда будут сохраняться вводимые пароли  (dbp - data base passwords)
        dbp.add(passwords);
        dbp.add(log.getPassword());


        String loginStr;
        String passwStr;

        if(choice == 2){
            System.out.println("Введите ваш логин: ");
            loginStr = scan.next();
            if(!dbl.contains(loginStr)){
                while(!dbl.contains(loginStr)){
                    System.out.println("Такого логина не сущесвтует. Попробуйте заново.");
                    loginStr = scan.next();
                }
            }
            System.out.println("Введите ваш пароль: ");
            scan.nextLine(); //Пустой сканнер, чтобы запустился следующий сканнер
            passwStr = scan.nextLine();
            if(!dbp.contains(passwStr)){
                while (!dbp.contains(passwStr)){
                    System.out.println("Вы ввели неверный пароль. Повторите попытку.");
                    passwStr = scan.nextLine();
                }
            }
            System.out.println("Вход успешен. Здравствуйте " + log.name);
        }
    }
}

/*--------------------------------------------------------------------------------------------------------------------*/

public class SystemIn {
    protected String name;
    public String login;
    private String password;

    public SystemIn(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public SystemIn() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
