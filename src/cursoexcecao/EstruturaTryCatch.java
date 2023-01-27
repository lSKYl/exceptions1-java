/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class EstruturaTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        method1();
        System.out.println("End of Program");
    }
    
    public static void method1() {
        System.out.println("METHOD1 Start");
        method2();
        System.out.println("METHOD1 End");
    }
    
    public static void method2() {
        System.out.println("METHOD2 START");
        Scanner sc = new Scanner(System.in);
        try {
            

            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("METHOD2 END");
    }
}
