/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;
import java.util.Scanner;

        
/**
 *
 * @author SPC
 */
public class Bai4_PhepTinhCoBan 
{
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh co ban");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = sc.nextInt();
        
        System.out.println(a + " + " + b + " = " + tinhtong(a,b));
        System.out.println(a + " - " + b + " = " + tinhhieu(a,b));
        System.out.println(a + " * " + b + " = " + tinhtich(a,b));
        System.out.println(a + " / " + b + " = " + tinhthuong(a,b));
    }
    public static int tinhtong(int a, int b)
    {
        return a+b;
    }
     public static int tinhhieu(int a, int b)
    {
        return a-b;
    }
      public static int tinhtich(int a, int b)
    {
        return a*b;
    }
       public static double tinhthuong(int a, int b)
    {
        if(b == 0)
        {
            return 0.000;
        }
        else
        {
            return (double)a/b;
        }
    }
}
