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
public class AssignmentJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b=  sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("New a "+ a + "\n New b " + b);

    }
    
}
