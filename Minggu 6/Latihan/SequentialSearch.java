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
public class SequentialSearch{
    
    public static void main(String[] args){
        
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 9;
        sequentialSearch(exampleVariableOne, target);
    }
    
    public static void sequentialSearch(int[] parameterOne, int parameterTwo){
        int index = -1;
        
        for(int i = 0; i < parameterOne.length; i++){
            if(parameterOne[i] == parameterTwo){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Your tarher integer does not exist in the arrat");
        } else {
            System.out.println("Your target integer is in index " + index + " of the array");
        }
    }
}
