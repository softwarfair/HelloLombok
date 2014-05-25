package org.softwarefair.lombok;

import lombok.ToString;
import lombok.Value;
import lombok.experimental.Builder;

import java.awt.*;

@Value
@Builder
@ToString(includeFieldNames = false, exclude = "year")
public class Vehicle {

    enum Type {
        CAR, BUS, BIKE;
    }
    private int numberOfWheels;
    private int year;
    private Color color;
    private Type type;

}
