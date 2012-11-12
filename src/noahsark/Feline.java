
package noahsark;


public abstract class Feline extends Animal{
    
    @Override
    public void move() {
        System.out.println("Pad pad pad....");
    }
    
    public void kill(Animal animal) {
        
        System.out.println(this.name + " attacked and " + animal.name + " is dead!");
        
    }
}
