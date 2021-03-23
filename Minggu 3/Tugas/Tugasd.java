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
public class Tugasd {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("              Barokah Store");
        System.out.println("         Promo Belanja Berhadiah");
        System.out.println("     Khusus Pembelian 5 Barang Pertama");
        System.out.println("     Dengan Harga minimum Rp 100000,00");
        System.out.println("-----------------------------------------");    
     
        System.out.print("Masukkan nama pembeli : ");
        String nama = scan.nextLine();
        System.out.println("");
        
        int[] harga = new int[6];
        int total = 0;
        for (int i=1; i<harga.length; i++){
            System.out.print("Masukkan harga barang ke-"+i+"      : ");
            harga[i] = scan.nextInt();
            total += harga[i];
        }
        System.out.println("Total harga pembelian atas nama "+ nama + " adalah Rp " + total );
        System.out.println("");
        
        if (total>= 100000){
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("               Terima Kasih");
        System.out.println("  Anda sudah berbelanja di Barokah Store");   
    }
}
