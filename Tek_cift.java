/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tek_cift;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Tek_cift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int k;
        Scanner inp = new Scanner (System.in);
        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();
        int i = 0;
        double sum = 0 , count = 0 ;

        while(i<=k){
            i++;
            if(i %3 == 0 || i%4 == 0 ){
                System.out.println(i);
                sum = sum + i ;
                count ++ ;
                }
            }
        double average = sum / count;
        if(count==0){
            System.out.println("3 ve 4'e bölünen sayıların ortalaması = 0");
        }else{
            System.out.println("3 ve 4'e bölünen sayıların ortalaması :"+average);

    }
    
}
}