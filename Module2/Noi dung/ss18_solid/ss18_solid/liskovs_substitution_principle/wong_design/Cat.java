package ss18_solid.liskovs_substitution_principle.wong_design;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }
}
