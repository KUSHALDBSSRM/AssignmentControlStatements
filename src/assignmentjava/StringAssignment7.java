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
public class StringAssignment7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
   String s,s1,re="";
   char mrch='d';
   int i,j,l=0,f=0;
   s = sc.nextLine();
   for(i=0;i<s.length();i++)
   {   
       f=0;
       for(j=0;j<i;j++)
       {
           if(s.charAt(i)== s.charAt(j))
            f=1;     
       }
       if(f==0)
       {
           for(j=i;j<s.length();j++)
           {
               if(s.charAt(i)== s.charAt(j))
                   f++;
           }
           if(l<f)
           {
               l=f;
               mrch = s.charAt(i);
           }
               
       }
   }
   
    
    System.out.println(mrch+" is most repeated character");
    }
    
}
