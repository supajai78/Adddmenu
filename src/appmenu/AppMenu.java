/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmenu;

import java.util.Scanner;

/**
 *
 * @author 344_10
 */
public class AppMenu {

    public static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            int choice = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("######################## ");
            System.out.println("######## menu ##########");
            System.out.println("(1) plus ");
            System.out.println("(2) minus ");
            System.out.println("(3) smultiply ");
            System.out.println("(4) exit ");
            System.out.print("Enter menu : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    smultiply();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Error");
            }
        }
    }

    public static void plus() {
        int num1, num2, result;
        System.out.print("Enter num1 : ");
        num1 = scan.nextInt();
        System.out.print("Enter num2 : ");
        num2 = scan.nextInt();
        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + " = " + result);
    }

    public static void minus() {
        int num1, num2, result;
        System.out.print("Enter num1 : ");
        num1 = scan.nextInt();
        System.out.print("Enter num2 : ");
        num2 = scan.nextInt();
        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + " = " + result);
    }

    public static void smultiply() {
        System.out.print("Enter mom : ");
        int mom = scan.nextInt();
        for (int x = 1; x <= 12; x++) {
            System.out.println(mom + " x " + x + " = " + (mom * x));

        }
    }
}
