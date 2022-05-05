/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade_average;

import java.util.Scanner;

/**
 *
 * @author basde
 */
public class Grade_average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int mat, fizik, kimya, turkce, tarih, muzik;


        Scanner input = new Scanner(System.in);

       
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

     
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

       
        System.out.println("Ortalamanız : "+sonuc);

        
        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);
    }
    
}
