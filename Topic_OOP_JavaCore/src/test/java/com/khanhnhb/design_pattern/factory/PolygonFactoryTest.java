package com.khanhnhb.design_pattern.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class PolygonFactoryTest {

    private final PolygonFactory polygonFactory = new PolygonFactory();

    @Test
    public void given_numberOfSidesPolygon_when_numberOfSidesArgumentGetPolygon_then_produceTriangle() {
        Polygon polygon = polygonFactory.getPolygon(3);
        assertEquals("Init Triangle", polygon.getType());
    }

    @Test
    public void given_numberOfSidesPolygon_when_numberOfSidesArgumentGetPolygon_then_produceSquare() {
        Polygon polygon = polygonFactory.getPolygon(4);
        assertEquals("Init Square", polygon.getType());
    }

    @Test
    public void given_numberOfSidesPolygon_when_numberOfSidesArgumentGetPolygon_then_produceHeptagon() {
        Polygon polygon = polygonFactory.getPolygon(7);
        assertEquals("Init Heptagon", polygon.getType());
    }

    @Test
    public void given_numberOfSidesPolygon_when_numberOfSidesArgumentGetPolygon_then_produceOctagon() {
        Polygon polygon = polygonFactory.getPolygon(8);
        assertEquals("Init Octagon", polygon.getType());
    }

    @Test
    public void given_numberOfSidesPolygon_when_numberOfSidesArgumentGetPolygon_then_producePentagon() {
        Polygon polygon = polygonFactory.getPolygon(5);
        assertEquals("Init Pentagon", polygon.getType());
    }

}