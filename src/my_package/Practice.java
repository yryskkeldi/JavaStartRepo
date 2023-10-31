package my_package;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

//        System.out.println(xyzThere("abc.xyzxyz"));





        int x = 45;
        int y = 84;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println();

    }

    public static boolean xyzThere(String str) {
        if(str.contains(".xyz") && str.contains("xyz")){
            return true;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if(str.substring(i, i+4).equals("xyz.")){
                return true;
            }
            if(str.substring(i, i+4).equals(".xyz")){
                return false;
            }
//            if(str.substring(i, i+4).equals(".xyz") && str.substring(i, i+4).equals("xyz")){
//                return true;
//            }
        }
        for (int i = 0; i < str.length() - 6; i++) {
            if(str.substring(i, i+7).equals(".xyzxyz")){
                return true;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if(str.substring(i, i+3).equals("xyz")){
                return true;
            }
        }
        return false;
    }


    public static boolean method(String a, String b){
        if(a.toLowerCase().endsWith(b.toLowerCase())){
            return true;
        }
        if(b.toLowerCase().endsWith(a.toLowerCase())){
            return true;
        }
        return false;
    }
}

