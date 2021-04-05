package com.khanhnhb.design_pattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectorTest {

    @Test
    public void given_connectorClass_when_getInstance_then_returnOnlyOneInstance() {
        assertEquals("Init connector", Connector.getInstance().showMessage());
    }
}