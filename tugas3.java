/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class tugas3 {
    public static void main(String[] args){
        
        int[] array = new int[15];
        int kuadrat,i;
        
        for (i=0;i<array.length;i++){
            array [i] = i + 1;
        }
        for (i=0;i<array.length;i++){
            if((array[i] % 2) != 0){
            kuadrat = array[i] * array[i];
            System.out.println(array[i] + " kuadrat = " + kuadrat);
            }
        }
    }
    
}
