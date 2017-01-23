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
public class StringAssignment10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
   String s="",s1="",re="";
   
   int i,j,l=0,m=0,p=0,f=0;
   s = sc.nextLine();
   char c[] = s.toCharArray();
   for(i=1;i<s.length();i++)
   {
       for(j=0;j< s.length()-i;j++)
       {
           if(c[j]> c[j+1])
           {
              char t =c[j];
              c[j] = c[j+1];
              c[j+1] =t;
               
               
               
           }
           
               
       }
   }
    s1 = new String(c);
    System.out.println("Sorted String is "+s1);
    }
    
}
