/*
javac Array.java
java Array
*/

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("請輸入有幾位學生:");
        Scanner stu=new Scanner(System.in);
        int st=stu.nextInt();
        int[] grades=new int[st];

        for(int i=0;i<=st-1;i++){
            System.out.println("請輸入學生成績:");
            Scanner s=new Scanner(System.in);
            int ss=s.nextInt();
            grades[i]=ss;
        }

        for(int i=0;i<grades.length;i=i+1){
            System.out.println(grades[i]);
        }

        int tot=0;
        for(int i=0;i<grades.length;i++){
            tot=tot+grades[i];
        }
        int avg=tot/grades.length;
        System.out.println("平均成績為:"+avg);
    }
}
