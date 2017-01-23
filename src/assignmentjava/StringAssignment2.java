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
public class StringAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s;
        int i,c=0;
        s = sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        StringBuffer s2= new StringBuffer(s1.reverse());
       if(s.equals(s2.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    
}
