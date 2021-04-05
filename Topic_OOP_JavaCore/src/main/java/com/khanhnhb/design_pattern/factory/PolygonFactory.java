package com.khanhnhb.design_pattern.factory;

public class PolygonFactory {

    public Polygon getPolygon(int numberOfSides) {
        switch (numberOfSides) {
            case 3:
                return new Triangle();
            case 4:
                return new Square();
            case 5:
                return new Pentagon();
            case 7:
                return new Heptagon();
            case 8:
                return new Octagon();
            default:
                return null;
        }
    }
}
