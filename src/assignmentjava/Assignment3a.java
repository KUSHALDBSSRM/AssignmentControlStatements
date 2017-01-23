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
public class Assignment3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,b,c,result=0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        result = ((a>b)?((a>c)?a:c):((b>c)?b:c));
        System.out.println("Largest of 3 no.s "+result);
    }
    
}
