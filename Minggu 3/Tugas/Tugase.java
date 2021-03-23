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
public class Tugase {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String[] menu = {"Soft Drinks", "Mix juice", "Nescafe", "Soda Milk", "Tea"};
        System.out.println("      CAFE  HARTO");
        System.out.println("     ANEKA MINUMAN");
        System.out.println("-----------------------");
        System.out.println("     SPECIAL MENU");
        
        for (int i = 1; i<= menu.length; i++){
            System.out.println("    "+i+". "+ menu[i-1]);
        }
        
        System.out.println("-----------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama = scan.nextLine();
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        int nMenu = scan.nextInt();
        
        switch (nMenu){
            case 1:
                System.out.println("Minuman yang anda pesan adalah "+menu[0]);
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah "+menu[1]);
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah "+menu[2]);
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah "+menu[3]);
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah "+menu[4]);
                break;
          }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih "+ nama + " telah berkunjung ke cafe Harto");
    }
    
}
