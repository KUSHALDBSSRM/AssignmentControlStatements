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
public class Assignment3c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int k,n,i,f,j,c=0;
        n = sc.nextInt();
        j=n;
        for(i=1;i<=n;i++)
        {
           k=1;f=j;c=0;
            while(c<i){
              if(k==f)
              {
                  System.out.print("*");
                  f=f+2;
                  c++;
              }
              else
                  System.out.print(" ");
              k++;
              
           }
            j--;
            System.out.println();
        }
    }
    
}
