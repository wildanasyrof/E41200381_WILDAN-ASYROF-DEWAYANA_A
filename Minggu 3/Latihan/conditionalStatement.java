/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class conditionalStatement {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //mengambil input 
        System.out.print("Masukkan Nilai: ");
        nilai = scan.nextInt();
        
        //gradenya
        if (nilai >=88){
            grade = "A";
        } else if (nilai >= 80){
            grade = "B+";
            
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60 ){
            grade = "C+";
        } else if (nilai >= 50){
            grade = "C";
        } else if (nilai >=40){
            grade = "D";
        } else {
            grade = "E";
       
        }
        
        //cetak hasil
        
        System.out.println("Grade: " + grade);
        
    }
}
