/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugasb {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Array : ");
        int x = scanner.nextInt();
        
        int[] array = new int[x];
        
        for (int i : array){
            int number = (int)(Math.random()*9+1);
            i = number;
            
            System.out.print(i+" ");
        }
        
    }
    
}
