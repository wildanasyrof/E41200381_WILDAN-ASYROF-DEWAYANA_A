/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6;

/**
 *
 * @author Asus
 */
public class SelectionSort {
    
    static void selectionsort(int arr[]){
        
        int n = arr.length;
        int smallest, temp;
        
        for(int i = 0; i < n; i++){
            smallest = i;
            for(int j = i+1; j < n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
        temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
        }
    
    }
    
    public static void main(String[] args){
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        
        System.out.println("Array before selection sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }        
        System.out.println("");
        
        selectionsort(arr);
        
        System.out.println("Array after selection sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
