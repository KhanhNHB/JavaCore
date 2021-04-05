package com.khanhnhb.design_pattern.abstract_factory.factory;

import com.khanhnhb.design_pattern.abstract_factory.type.AnimalType;

public interface AbstractFactory<T> {
    T create(AnimalType type);
}
