/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etkinlik;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Etkinlik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sıcaklık değeri giriniz : ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5 ) {
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (sicaklik>=5 && sicaklik<=15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (sicaklik>=15 && sicaklik <=25) {
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else if (sicaklik>25) {
            System.out.println("Yüzmeye gidebilirsiniz");

        }
    }
    
}
