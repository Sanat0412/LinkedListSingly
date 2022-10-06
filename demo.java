import java.io.*;
import java.util.*;

class UserMainCode {
    public static String toggleTheString(String input1, int input2) {
        StringBuilder res = new StringBuilder();
        String op = "";
        switch (input2) {
            case 0:
                for (int i = 0;i < input1.length();i++) {
                    if (i % 2 == 0) {
                        char c = input1.charAt(i);
                        res.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
                    }
                }
                break;
            case 1:
                for (int i = 0;i < input1.length();i++) {
                    if (i % 2 == 1) {
                        char c = input1.charAt(i);
                        res.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
                    }
                }
                break;
            case 2:
                res.append(input1);
                res.reverse();
                for (int i = 0;i < res.length();i++) {
                        char c = res.charAt(i);
                        op += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
                }
                        return op;
//                break;
        }
        return String.valueOf(res);
    }

    public static void main(String[] args){
        System.out.println(toggleTheString("CHEnnAi",2));
    }
}
