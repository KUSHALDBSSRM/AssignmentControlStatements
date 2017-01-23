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
public class StringAssignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
   String s="",s1="",re="";
   int i,j,l=0,m=0,p=0;
   s = sc.nextLine();
   s= s+" ";
   l= s.length();
   while(m<l)
   {
       p = s.indexOf(' ',m);
       s1= s.substring(m,p);
       re = s1+re;
       m = p+1;
   }
   
    System.out.println("New Sentence is " + re+" ");
    
    }
    
}
