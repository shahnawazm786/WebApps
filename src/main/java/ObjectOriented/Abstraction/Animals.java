package ObjectOriented.Abstraction;
/*
    Abstraction is way of hiding details
    Here in the example - All animals can eat, walk and speak.
    But Each Animals have different sounds.
    Here we can achieves by using the abstract method and abstract class.
 */
public abstract  class Animals {
    public void Eat(){
        System.out.println("Animal can eat");
    }
    public void Walk(){
        System.out.println("Animal can walk");
    }
    public abstract void Speak();
}
