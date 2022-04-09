package study.effectivejavastudy.chapter2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping{ HAM,MUSHROOM,ONION,PEPPER,SAUSAGE}

    // 그냥 Set보다 EnumSet이 빠른 이유 찾아보기!
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>
    {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping)
        {
            topping.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();
        protected  abstract T self();

        
    }
}
