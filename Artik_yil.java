/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artik_yil;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Artik_yil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        int year = scanner.nextInt();

        if (year%4==0 && year%100!=0)
        {
            System.out.println(+year+ " artık yıldır");
        }

        else if (year%100==0 && year%400==0)
        {
            System.out.println(+year+ " artık yıldır");
        }

        else
        {
            System.out.println(+year+ " artık yıl değildir.");
        }
    }
    
}
