/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class latihan2 {
    
    public static void main (String[]args){
        int input1,input2,hasil;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number =");
        input1 = input.nextInt();
        
        System.out.print("Enter number= ");
        input2 = input.nextInt();
        
        hasil = input1 + input2;
        System.out.println("hasil = " + hasil);
    }
}
