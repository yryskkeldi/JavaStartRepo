import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    String symbol = scan.next();
    int y = scan.nextInt();
    if(symbol.equals("+")){
        System.out.println(x+y);
    }
    if(symbol.equals("-")){
        System.out.println(x-y);
    }
    if(symbol.equals("*")){
        System.out.println(x*y);
    }
    if(symbol.equals("/")){
        System.out.println(x/y);
    }
    }

}
