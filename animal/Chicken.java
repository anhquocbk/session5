package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "chicken: oooooo...!";
    }

    @Override
    public String howToEat() {
        return "co the luoc cham voi muoi ot!";
    }
}
