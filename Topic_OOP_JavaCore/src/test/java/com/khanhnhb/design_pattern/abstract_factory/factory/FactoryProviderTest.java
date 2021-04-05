package com.khanhnhb.design_pattern.abstract_factory.factory;

import com.khanhnhb.design_pattern.abstract_factory.animal.Dog;
import com.khanhnhb.design_pattern.abstract_factory.type.AnimalType;
import com.khanhnhb.design_pattern.abstract_factory.type.FactoryType;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryProviderTest {

    @Test
    public void given_animalFactoryType_when_getAnimalFactoryType_then_getDogWithAnimalType() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory(FactoryType.ANIMAL);
        Dog dog = (Dog) abstractFactory.create(AnimalType.DOG);
        assertEquals(AnimalType.DOG, dog.getType());
    }
}