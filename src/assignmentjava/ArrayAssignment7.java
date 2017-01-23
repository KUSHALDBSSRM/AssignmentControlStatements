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
public class ArrayAssignment7 {

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
      for( i=0; i<a.length/2; i++){
  int temp = a[i];
  a[i] = a[a.length -i -1];
  a[a.length -i -1] = temp;

      }
for(int x:a){
    System.out.print(x+"\t");
}
       
    }
    
}
