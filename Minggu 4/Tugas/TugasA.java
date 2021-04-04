/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TugasA {
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan nilai terkecil : ");
        int min = scn.nextInt();
        System.out.print("Masukkan nilai terbesar : ");
        int max = scn.nextInt();
        
        for (int i = min; i <= max; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
