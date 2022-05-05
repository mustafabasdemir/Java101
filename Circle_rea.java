/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_rea;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Circle_rea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yarıçap değerini giriniz: ");
        int r = scan.nextInt();
        System.out.println("Lütfen açı değerini giriniz: ");
        int a = scan.nextInt();

        double alan = ((3.14)*r*r*a)/360;
        System.out.println("Daire diliminin alanı: "+alan);
    }
    
}
