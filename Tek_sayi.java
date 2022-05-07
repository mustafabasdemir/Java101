/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tek_sayi;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Tek_sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.print("Sayi giriniz: ");
            sayi = scan.nextInt();
            if (sayi%4==0) {
                toplam += sayi;
            }
        }while(sayi%2==0);
        System.out.print("Dordun  katlarinin toplami : " + toplam);


    }
    
}
