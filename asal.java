import java.util.Scanner;

public class Asal {

    static boolean asal(int sayi, int i){

        if(sayi <= 2){
            return (sayi==2) ? true: false;
        }
        if(sayi % i == 0){
            return false;
        }
        if(i * i > sayi){
            return true;
        }

        return asal(sayi,i+1);
    }
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int sayi;

        System.out.println("Sayı giriniz: ");
        sayi = inp.nextInt();

        System.out.println(asal(sayi,2));
    }
}