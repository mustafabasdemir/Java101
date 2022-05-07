import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int i=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("n1 sayısını giriniz:");
        int n1=inp.nextInt();

        System.out.println("n2 sayısını giriniz:");
        int n2=inp.nextInt();
        int ebob=1;
        int ekok=1;

        while(i<=n1){
            if((n1%i == 0) && (n2%i==0)){
                System.out.println(i);
                ebob=i;
            }
                i++;
        }
         ekok=(n1*n2) / ebob;
        System.out.println("ekok:"+ekok);
        System.out.println("ebob:"+ebob);

    }
}