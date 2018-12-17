/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator2;

import java.util.HashMap;
/**
 *
 * @author Poozer
 */
public class ApplicationController {
    public static HashMap<String,HandleMath> hashMapOfCommands = new HashMap<String,HandleMath>();
    
    public void ApplicationControllerPattern(){
        
    }
    
    public static void handleCommand(String command, Integer num1, Integer num2){
        hashMapOfCommands.put("+", new Add());
        hashMapOfCommands.put("*", new Multiply());
        hashMapOfCommands.put("/", new Divide());
        hashMapOfCommands.put("-", new Subtract());
        hashMapOfCommands.put("^", new SquareRoot());
        
        HandleMath handler = hashMapOfCommands.get(command);
        
        handler.execute(num1, num2);
    }
}
