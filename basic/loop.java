public class loop {
    public static void main(String[] args) {
        // while迴圈------------------
        int x=0;
        while (x<=6) {
            System.out.println(x);
            x=x+1;
        }

        int tot=0;
        int n=1;
        while (n<=5) {
            tot=tot+n;
            n++;
        }
        System.out.println(tot);

        //for迴圈------------------
        for(int xx=2;xx<=6;xx=xx+2){
            System.out.println(x);
        }

        int tot1=0;
        for(int nn=1;nn<=5;nn++){
            tot1=tot1+n;
        }
        System.out.println(tot1);
    }
}
