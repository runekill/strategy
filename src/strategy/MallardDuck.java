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
public class MallardDuck extends Duck{
     
    public MallardDuck (){
        quackbehavior = new Quack();
        flybehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am a Mallard Duck");
    }
    
}
