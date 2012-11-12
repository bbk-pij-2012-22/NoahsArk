
package noahsark;


public class NoahsArk {

   
    public static void main(String[] args) {
       
        
        System.out.println("Let's create a new animal.... an Antelope");
        Animal Antelope1 = new Antelope();
        try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("and let's call her Skippy");
        Antelope1.name = "Skippy";
        try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Now let's make a Lion and call him Leo");
        try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        Lion Lion1 = new Lion();
        Lion1.name = "Leo";
        System.out.println("Now let's make a Kitten called Tom");
        Animal Kitten1 = new Kitten();
        Kitten1.name = "Tom";
          try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Now let's ask Leo to make a noise....");
          try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        Lion1.makeSound();
          try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Now let's ask Tom to make a noise....");
           try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        Kitten1.makeSound();
           try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        System.out.println("Now let's ask Skippy to run away....");
          try{
        Thread.currentThread().sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        Antelope1.move();
          try{
        Thread.currentThread().sleep(2500);
        }
        catch(InterruptedException ex) {
        }
          System.out.println("Now let's get Leo to stalk Skippy");
            try{
        Thread.currentThread().sleep(4000);
        }
        catch(InterruptedException ex) {
        }
        Lion1.move();
          try{
        Thread.currentThread().sleep(2500);
        }
        catch(InterruptedException ex) {
        }
          System.out.println("Now let's send him in for the kill....");
            try{
        Thread.currentThread().sleep(2500);
        }
        catch(InterruptedException ex) {
        }
        Lion1.makeSound();
          try{
        Thread.currentThread().sleep(2500);
        }
        catch(InterruptedException ex) {
        }
          Lion1.kill(Antelope1);
    }
}
