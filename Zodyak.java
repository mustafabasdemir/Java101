/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zodyak;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Zodyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int yil;

        System.out.println("Doğum yılınızı giriniz: ");
        yil = inp.nextInt();

        String zodyak = "asd";


        if(yil % 12 == 0){
            zodyak = "Maymun";
        }
        if(yil % 12 == 1){
            zodyak = "Horoz";
        }
        if(yil % 12 == 2){
            zodyak = "Köpek";
        }
        if(yil % 12 == 3){
            zodyak = "Domuz";
        }
        if(yil % 12 == 4){
            zodyak = "Fare";
        }
        if(yil % 12 == 5){
            zodyak = "Öküz";
        }
        if(yil % 12 == 6){
            zodyak = "Kaplan";
        }
        if(yil % 12 == 7){
            zodyak = "Tavşan";
        }
        if(yil % 12 == 8){
            zodyak = "Ejderha";
        }
        if(yil % 12 == 9){
            zodyak = "Yılan";
        }
        if(yil % 12 == 10){
            zodyak = "At";
        }
        if(yil % 12 == 11){
            zodyak = "Koyun";
        }

        System.out.println("Zodyak Burcunuz: " + zodyak);

    }
    
}
