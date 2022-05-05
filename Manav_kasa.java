/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manav_kasa;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Manav_kasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç kilogram armut aldınız? Giriniz: ");
        int a = scan.nextInt();
        System.out.println("Kaç kilogram elma aldınız? Giriniz: ");
        int e = scan.nextInt();
        System.out.println("Kaç kilogram domates aldınız? Giriniz: ");
        int d = scan.nextInt();
        System.out.println("Kaç kilogram muz aldınız? Giriniz: ");
        int m = scan.nextInt();
        System.out.println("Kaç kilogram patlıcan aldınız? Giriniz: ");
        int p = scan.nextInt();

        double totalPrice = ((a*2.14) +(e*3.67)+(d*1.11)+(m*0.95)+(p*5));
        System.out.println("Ödeyeceğiniz toplam ücret: "+totalPrice);
    }
    
}
