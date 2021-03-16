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
public class Person {
    
    String name;
    int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    

    public static void main(String[] args){
        String fName, lName, stuStatus;
        int stuId;
        
        fName = "Madun";
        lName = "Junior";
        stuStatus = "Active";
        stuId = 14022;
        
        System.out.println("Student Name : " + fName + " " + lName);
        System.out.println("Student Status : " + stuStatus);
        System.out.println("Student ID : " + stuId);
    }
}
