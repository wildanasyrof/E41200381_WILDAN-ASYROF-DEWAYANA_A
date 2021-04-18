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
public class BinarySearch {
    
    public static void binarySearch(int arr[],int first, int last, int value){
        int mid = (first+last)/2;
        
        while( first <= last ){  
           if ( arr[mid] < value ){  
                first = mid + 1;     
           } else if ( arr[mid] == value ){  
                System.out.println("Element is found at index: " + mid);  
                break;  
           } else {  
                last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element is not found!");  
        }  
    }
    
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10, 12};
        int value = 6;
        int last = arr.length-1;
        binarySearch(arr, 0, last ,value);
    }
}
