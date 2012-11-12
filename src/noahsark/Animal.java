/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package noahsark;

/**
 *
 * @author marshall_gj
 */
public abstract class Animal {
    
    String name = "unspecified";
    
    public void makeSound() {
        
        System.out.println("Animal is making a sound");
        
        
    }
    
    public void move() {
        System.out.println("This animal is moving");
    }
    
    public void sleep() {
        System.out.println("Zzzzz... Zzzzzz ... Zzzzzz");
    }
    
    public void eat() {
        
        System.out.println("This animal is eating");
    }
    
}
