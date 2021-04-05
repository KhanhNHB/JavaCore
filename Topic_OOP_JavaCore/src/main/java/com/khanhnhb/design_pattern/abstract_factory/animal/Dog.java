package com.khanhnhb.design_pattern.abstract_factory.animal;

import com.khanhnhb.design_pattern.abstract_factory.type.AnimalType;

public class Dog implements Animal {
    @Override
    public AnimalType getType() {
        return AnimalType.DOG;
    }

    @Override
    public String makeSound() {
        return "Gâu gâu";
    }
}
