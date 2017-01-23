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
public class StringAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s,s1;
        int i,c=0;
        s = sc.nextLine();
        s1 = s.toUpperCase();
        for(i=0;i<s.length();i++)
        {
            
            if(s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U')
            {
                c++;
            }
        }
        System.out.println("No. of vowels = "+ c );
    }
    
}
