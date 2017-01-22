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
public class AssignmentJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
    int a,i;
    boolean flag = true;
    a = sc.nextInt();
    for(i=2;i<=Math.sqrt(a);i++)
    {
        if(a%i==0)
            flag=false;
    }
    if(flag)
        System.out.println(a+" is a prime number");
    else
        System.out.println(a+" is not a prime number");
   
        
    }
    
}
