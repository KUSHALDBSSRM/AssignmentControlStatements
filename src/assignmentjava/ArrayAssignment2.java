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
public class ArrayAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i,n,se;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(i=0;i<a.length;i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the element to be searched");
        se = sc.nextInt();
        Arrays.sort(a);
        if(Arrays.binarySearch(a, se)>=0)
            System.out.println("Found at position "+ Arrays.binarySearch(a, se));
        else
            System.out.println("Not Found"); 
    }
    
}
