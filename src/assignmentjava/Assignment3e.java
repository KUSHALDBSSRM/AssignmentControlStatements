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
public class Assignment3e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        n = sc.nextInt();
        for(i=1;i<=5;i++)
        {
            for(j=5;j>i;j--)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print("*");
            for(j=1;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(i=1;i<n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(" ");
            for(j=n-i;j>=1;j--)
                System.out.print("*");
            for(j=1;j<n-i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
