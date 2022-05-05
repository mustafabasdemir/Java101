/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vki;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Vki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner vkiScan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz(metre cinsinden): ");
        double boy = vkiScan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        int kilo = vkiScan.nextInt();

        double vki = (kilo / (boy*boy));
        System.out.println("Vücut Kitle İndeksiniz: "+vki);
    }
    
}
