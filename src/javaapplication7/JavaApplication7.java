/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author agha
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a=2;
int b=6;
double d=2.5;
int z=sum(a,b);
double o=sum(d,a);
  
        System.out.println(z);
        System.out.println(o);
    }
    public static int sum(int x,int y ){
        int sum =x+y;
        return sum;
    }
    public static double sum(double x,int y ){
        double sum =x+y;
        return sum;
    }
    
}
