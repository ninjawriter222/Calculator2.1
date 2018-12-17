/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator2;

/**
 *
 * @author Poozer
 */
public class SquareRoot implements HandleMath{
    public void execute(Integer num1, Integer num2){
        Integer sqr = num1 * num1;
        System.out.println(sqr);
    }
}
