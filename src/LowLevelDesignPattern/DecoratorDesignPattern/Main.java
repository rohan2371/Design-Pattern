package LowLevelDesignPattern.DecoratorDesignPattern;

import LowLevelDesignPattern.DecoratorDesignPattern.Basepizza.BasePizza;
import LowLevelDesignPattern.DecoratorDesignPattern.Basepizza.Margherita;
import LowLevelDesignPattern.DecoratorDesignPattern.Topping.ExtraCheese;
import LowLevelDesignPattern.DecoratorDesignPattern.Topping.Mushroom;

public class Main {
    public static void main(String[] args) {

        // Create a Margherita pizza with extra cheese
        BasePizza pizza1 = new ExtraCheese(new Margherita());
        System.out.println("Cost of pizza with extra cheese: " + pizza1.cost());

        // Create a Margherita pizza with extra cheese and mushrooms
        BasePizza pizza2 = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Cost of pizza with extra cheese and Mushroom: " + pizza2.cost());
    }
}
