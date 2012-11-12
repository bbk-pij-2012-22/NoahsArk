/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package noahsark;

/**
 *
 * @author marshall_gj
 */
public class Lion extends Feline {
    
    @Override
    public void makeSound() {
        System.out.println("ROOOOOAAAR!");
    }
    
    @Override
    public void eat() {
        System.out.println("CHOMP CHOMP CHOMP");
    }
    
}
