import java.util.Scanner;

public class loopstatement {
    public static void main(String[] args) {
        while (true) {
            Scanner s=new Scanner(System.in);
            System.out.println("請輸入一個正整數:");
            int num=s.nextInt();
            if(num>0){
                System.out.println("正確");
                break;
            }else{
                System.out.println("錯誤");
                continue;
            }
        }
    }
}
