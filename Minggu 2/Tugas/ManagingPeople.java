/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Asus
 */

public class ManagingPeople {
    
    
    public static void main(String[] args){
        Person p1 = new Person("Bambang", 42);
        Person p2 = new Person("Udin", 35);
        
        if(p1.getAge() == p2.getAge()){
            System.out.println(p1.getName() + " seumuran dengan " + p2.getName());
        } else {
            System.out.println(p1.getName() + " tidak seumuran dengan " + p2.getName());
        }
    }
}
