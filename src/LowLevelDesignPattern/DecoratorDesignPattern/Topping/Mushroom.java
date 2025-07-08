package LowLevelDesignPattern.DecoratorDesignPattern.Topping;

import LowLevelDesignPattern.DecoratorDesignPattern.Basepizza.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+ 10;
    }
}
