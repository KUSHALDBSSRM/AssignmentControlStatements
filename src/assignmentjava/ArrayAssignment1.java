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
public class ArrayAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n,i,lar=0,small=0;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(i=0;i<a.length;i++)
            a[i] = sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(i==0)
                lar=small=a[i];
            else
            {
                if(lar<a[i])
                    lar = a[i];
                if(small>a[i])
                    small= a[i];
                    
            }
        }
        System.out.println("Largest no."+lar+"\nSmallest no"+small);
    }
    
}
