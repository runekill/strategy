/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author kos
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MallardDuck mallard = new MallardDuck();
        
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.setQuackBehavior(new Mute());
        mallard.performQuack();
    }
    
}
