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
public class Assignment2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,t,r,c=0,s=0;
        a = sc.nextInt();
        t=a;
        while(t!=0)
        {
            r = t%10;
            c++;
            t=t/10;
        }
        t=a;
        while(t!=0)
        {
            r = t%10;
            s = s + (int)(Math.pow(r, 3));
            t = t/10;
            
        }
        if(s==a)
            System.out.println(a+" is Armstrong number");
        else
            System.out.println(a+" is not Armstrong number");
    }
    
}
