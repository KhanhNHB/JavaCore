package com.khanhnhb.design_pattern.abstract_factory.animal;

import com.khanhnhb.design_pattern.abstract_factory.type.AnimalType;

public interface Animal {
    AnimalType getType();
    String makeSound();
}
