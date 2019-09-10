/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0273898
 */
public class Ch4Assign {
    public static void main(String[] args) {
        boolean goForever = true;
        
        int counter = 0;
        
        while (goForever) {
            counter++;
            System.out.println(counter);
            goForever = false;
        }
        
        System.out.println("Loop is done");
    }
}
