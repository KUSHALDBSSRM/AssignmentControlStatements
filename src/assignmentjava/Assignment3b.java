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
public class Assignment3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int r,a,t,s=0;
        a = sc.nextInt();
        t=a;
        while(t!=0)
        {
            r = t%10;
            s = s*10+r;
            t=t/10;
            
        }
        if(s==a)
            System.out.println(a + "is Palindrome");
        else
            System.out.println(a + " is not palindrome");
    }
    
}
