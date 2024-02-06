/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elemiprogtetelek;

import java.util.Scanner;

/**
 *
 * @author RichterBalázsKriszti
 */
public class ElemiProgtetelek {
    
    static Scanner sc = new Scanner(System.in);
            
    public static void main(String[] args) {
        int n = -1;
        while (n < 0){
            System.out.print("N= ");
            n = sc.nextInt();
        }
        // tétel
        int osszeg = 0;
        for(int i=0; i<n+1; i++) {
            osszeg += 1;
        }
        
        System.out.printf("Az első %d szám összege: %d\n",n,osszeg);
        
        // megszámlálás tétel
        int db = 0;
        for(int i=10; i<99; i++) {
            if(i % 2 == 0);
                db ++;
        }
        System.out.printf("Kétjegyű párosak száma: %d\n",db);
        
        Scanner sc = new Scanner(System.in);
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE; // 2147483647;
        int szam;
        System.out.print("0-ra kilép");
        while ((szam = sc.nextInt()) != VEGE) {
           if (szam < min){
                min = szam;
      }
        db += 1;
    }
        System.out.println(db + "számból a legkisebb: "+ min);
        
        System.out.print("\nszám: ");
        n = sc.nextInt();
        boolean prim;
        
        if(n < 2){
            prim = false;
        }else{
            int i = 2;
            while(i <= Math.sqrt(n) && n % 1 !=0){
                i += 1;
            }
            prim = i > Math.sqrt(i);
        }
        if(prim == true){
            System.out.print("prim");
        }else{
            System.out.print("Nem prím");
        }
        
        
    } // main vége
} // class vége
