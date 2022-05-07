package methods;

import java.util.Scanner;

public class RecursivePower {

    static int power(int sayi, int us) {
        if (us == 0) return 1;
        if (us == 1) return sayi;

        return power(sayi, (us - 1)) * power(sayi, 1);
    }

    public static void main(String[] args) {

        int tabanDeger, usDeger;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz: ");
        tabanDeger = scanner.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        usDeger = scanner.nextInt();
        int result = power(tabanDeger, usDeger);
        System.out.println("Sonuç" + " : " + result);

    }
}