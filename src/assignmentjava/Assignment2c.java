/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentjava;
import java.util.*;
/**
 *
 * @author kushal
 */
public class Assignment2c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,c=0;
        System.out.println("Enter the last no. till which you want to print thefibonacci series");
        n = sc.nextInt();
        System.out.print("\n"+a+"\t"+b+"\t");
        while(c<n)
        {
            c=a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
    }
    
}
