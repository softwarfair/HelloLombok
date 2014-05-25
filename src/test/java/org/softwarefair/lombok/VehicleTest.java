package org.softwarefair.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

@Slf4j
public class VehicleTest {

    @Test
    public void testBuilder() throws Exception {
        Vehicle bike = Vehicle.builder().color(Color.RED).numberOfWheels(2).type(Vehicle.Type.BIKE).year(2013).build();
        log.debug("Bike created with lombok: {}", bike);
        Assert.assertEquals("Vehicle(2, java.awt.Color[r=255,g=0,b=0], BIKE)", bike.toString());
    }
}