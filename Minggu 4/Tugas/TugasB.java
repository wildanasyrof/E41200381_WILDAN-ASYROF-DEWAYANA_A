/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Asus
 */
public class TugasB {
    
    public static void main(String[] args){
        //kelipatan
        System.out.println("          Do_While");
        System.out.println("Bilangan kelipatan 2 (0 - 100)");
        System.out.println("==============================");
        int kelipatan = 0;
        
        do {
            System.out.print(kelipatan + " ");
            kelipatan = kelipatan + 2;
        }
        while(kelipatan <= 100);
        
        System.out.println("");
        System.out.println("");
        //perkalian
        System.out.println("          Do_While");
        System.out.println("Bilangan Perkalian 2 (0 - 100)");
        System.out.println("==============================");
        int perkalian = 1;
        
        do {
            System.out.print(perkalian + " ");
            perkalian = perkalian*2;
        }
        while(perkalian <= 100);
        System.out.println("");
    }
}
