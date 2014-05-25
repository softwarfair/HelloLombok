package org.softwarfair.lombok;

import lombok.extern.slf4j.Slf4j;
import org.softwarfair.lombok.Vehicle;
import org.softwarfair.lombok.Wheel;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.Arrays;

@Slf4j
public class VehicleTest {

    @Test
    public void testBuilder() throws Exception {
        Wheel michellin = Wheel.of(22, "Michellin");
        Vehicle bike = Vehicle.builder()
                .color(Color.RED)
                .type(Vehicle.Type.BIKE)
                .year(2013)
                .wheels(Arrays.asList(michellin, michellin))
                .build();
        log.debug("Bike created with lombok: {}", bike);
        Assert.assertEquals("Vehicle([Wheel(22), Wheel(22)], java.awt.Color[r=255,g=0,b=0], BIKE)",
                bike.toString());
    }
}