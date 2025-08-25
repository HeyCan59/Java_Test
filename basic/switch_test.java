/*
javac iftest.java
java iftest
*/

import java.util.Scanner;

public class switch_test {
    public static void main(String[] args){
        int n1=3;
        int n2=4;
        System.out.println("請輸入:");
        Scanner s=new Scanner(System.in);
        String op=s.next();
        switch(op){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
        }
    }
}