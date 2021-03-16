/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author Asus
 */
    class book {
    int price, pages;
            
            public void set(int price, int pages){
                this.price = price;
                this.pages = pages;
            }
            
            public void show(){
                System.out.println("Books Information");
                System.out.println("Books price : " + price);
                System.out.println("Number of pages : " + pages);
            }
        }
    public class latihan1c{
            public static void main(String[] args){
                book javabook = new book();
                javabook.set(60_000, 100);
                javabook.show();
            }
    
}
