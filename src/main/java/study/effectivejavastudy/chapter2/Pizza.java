package study.effectivejavastudy.chapter2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping{ HAM,MUSHROOM,ONION,PEPPER,SAUSAGE}

    // 그냥 Set보다 EnumSet이 빠른 이유 찾아보기!


    // 재귀적인 타입 제한
    //
    abstract static class Builder<T extends Builder<T>>
    {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping)
        {

            return self();
        }

        abstract Pizza build();
        protected  abstract T self();

        
    }
}
