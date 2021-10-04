package ObjectOriented.Abstraction;

public class Cow extends Animals{
    @Override
    public void Speak() {
        System.out.println("Maoo Maoo Maooo");
    }

    public static void main(String[] args) {
        Cow c=new Cow();
        c.Speak();
        c.Eat();
        c.Walk();
    }
}
