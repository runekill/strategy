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
public abstract class Duck {
    
    Flybehavior flybehavior;
    Quackbehavior quackbehavior;
    
    public Duck() {
        
    }
    public void setFlyBehavior (Flybehavior flybehavior) {
        this.flybehavior = flybehavior;
    }
    public void setQuackBehavior (Quackbehavior quackbehavior) {
        this.quackbehavior=quackbehavior;
    }
    abstract void display();
    
    public void performFly(){
        flybehavior.fly();
    }
    public void performQuack(){
        quackbehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks swim");
    }
}
