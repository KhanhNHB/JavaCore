package com.khanhnhb.design_pattern.abstract_factory.animal;

import com.khanhnhb.design_pattern.abstract_factory.type.AnimalType;

public class Cat implements Animal {
    @Override
    public AnimalType getType() {
        return AnimalType.CAT;
    }

    @Override
    public String makeSound() {
        return "meow meow";
    }
}
