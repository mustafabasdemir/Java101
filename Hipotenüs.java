/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenüs;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Hipotenüs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.println("1. kenarı giriniz: ");
        int x= scan.nextInt();
        System.out.println("2. kenarı giriniz:");
        int y= scan.nextInt();
        System.out.println("3. kenarı giriniz:");
        int z= scan.nextInt();

        double u = (x+y+z) /2;
        double cevre = 2*u;

        double alan = Math.sqrt(u * ((u-x)*(u-y)*(u-z)) );
        System.out.println("Alan: "+alan);
    }
    
}
