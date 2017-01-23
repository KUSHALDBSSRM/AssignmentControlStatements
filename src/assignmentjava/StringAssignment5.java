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
public class StringAssignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc = new Scanner(System.in);
   String s,s1,re="";
   int i,j,f=0;
   System.out.println("Enter 1st string");
   s = sc.nextLine();
   System.out.println("Enter 2nd String");
   s1 = sc.nextLine();
   for(i=0;i<s.length();i++)
   {
       f=1;
       for(j=0;j<s1.length();j++)
       {
         if(s.charAt(i)==s1.charAt(j))
             f=0;
       }
      if(f==1)
          re = re+s.charAt(i);
   }
    
    System.out.println("New 1st String is"+ re);
    }
    
}
