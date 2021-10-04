package ObjectOriented.Abstraction;

public class Dog extends Animals{
    @Override
    public void Speak() {
    System.out.println("Bhao Bhao Bhao");
    }
    public static void main(String[] args){
        Dog d=new Dog();
        d.Speak();
        d.Eat();
        d.Walk();
    }
}
