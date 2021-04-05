package com.khanhnhb.design_pattern.abstract_factory.factory;

import com.khanhnhb.design_pattern.abstract_factory.type.FactoryType;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case ANIMAL:
                return new AnimalFactory();
            default:
                return null;
        }
    }
}
