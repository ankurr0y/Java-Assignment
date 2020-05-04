/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Ankur
 */
class sample{
    int a=5;
    int geta(){
        return a;
    }
}
public class Q5 {
    public static void main(String[] args) {
        sample s=new sample();
        System.out.println(s.geta());
    }
}
