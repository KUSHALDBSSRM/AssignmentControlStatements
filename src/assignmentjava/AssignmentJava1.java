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
public class AssignmentJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%2==0)
            System.out.println(a+" is Even");
        else
            System.out.println(a+" is Odd ");
    
    }
    
}
