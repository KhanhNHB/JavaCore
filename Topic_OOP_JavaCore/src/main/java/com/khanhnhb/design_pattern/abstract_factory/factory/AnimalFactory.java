package com.khanhnhb.design_pattern.abstract_factory.factory;

import com.khanhnhb.design_pattern.abstract_factory.animal.Animal;
import com.khanhnhb.design_pattern.abstract_factory.animal.Cat;
import com.khanhnhb.design_pattern.abstract_factory.animal.Dog;
import com.khanhnhb.design_pattern.abstract_factory.type.AnimalType;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(AnimalType type) {
        switch (type) {
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
            default:
                return null;
        }
    }
}
