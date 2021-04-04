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
public class TugasC {
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya data nilai = ");
        int x = scn.nextInt();
        int[] data = new int[x];
        
        for(int i = 0; i < data.length; i++){
            System.out.print("Masukkan data nilai ke-"+ (i + 1) +"= ");
            data[i] = scn.nextInt();
        }
        
        int min = data[0], max = min;
        int sum = 0, avg = 0;
        
        for(int i : data){
            sum += i;
            avg = sum/x;
            if (i < min){ 
                min = i;
            }
            if (i > max){ 
                max = i;
            }
        }
        System.out.println("");
        System.out.println("Nilai minimum = "+ min);
        System.out.println("Nilai Maksimum = "+ max);
        System.out.println("Nilai rata ratanya adalah = "+ avg);
    }
}
