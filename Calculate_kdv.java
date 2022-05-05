/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate_kdv;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Calculate_kdv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double kdvRate = 0, kdvAmount = 0, kdvTotalAmount = 0;

        System.out.print("hesaplamak istediğiniz tutarı giriniz : ");
        double amount = scan.nextDouble();

        kdvRate = (amount > 1000) ? 0.08 : 0.18;

        kdvAmount = kdvRate*amount;
        kdvTotalAmount = amount+kdvAmount;

        System.out.println("KDV oranı : " + kdvRate);
        System.out.println("KDV tutarı : " + kdvAmount + " TL");
        System.out.println("Girilen tutar : " + amount + " TL");
        System.out.println("KDV'li toplam tutar : " + kdvTotalAmount + " TL");
    }
    
}
