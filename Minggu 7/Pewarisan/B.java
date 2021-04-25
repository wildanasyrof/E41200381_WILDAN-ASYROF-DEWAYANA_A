/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author Asus
 */
public class B extends A { //deklarasikan B yang diturunkan dari A
    int z;
    
    void TampilkanJumlah(){//subclass dapat mengakses dari superclass
        System.out.println("Jumlah :" + (x+y+z));
    }
}
