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
public class Assignment2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long f=1,i;
        int a;
        a = sc.nextInt();
        for(i=1;i<=a;i++)
            f=f*i;
        System.out.println("Factorial of "+a+" is "+f);
        
    }
    
}
