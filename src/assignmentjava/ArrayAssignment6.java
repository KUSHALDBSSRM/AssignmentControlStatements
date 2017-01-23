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
public class ArrayAssignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int i,n,se,j,f=0;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(i=0;i<a.length;i++)
            a[i] = sc.nextInt();
        for(i=0;i<a.length;i++)
            
        {
            f=0;
            for(j=0;j<i;j++)
            {
                if(a[i]==a[j])
                    f=1;
            }
            if(f==0)
            {
                for(j=i;j<a.length;j++)
                {
                    if(a[j]==a[i])
                        f++;
                }
                if(f>1){
                    System.out.println(a[i]+" is the duplicate element ");
                }
                }
        }

    }
    
}
