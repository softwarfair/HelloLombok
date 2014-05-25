package org.softwarfair.lombok;

import lombok.ToString;
import lombok.Value;
import lombok.experimental.Builder;

import java.awt.*;
import java.util.List;

@Value
@Builder
@ToString(includeFieldNames = false, exclude = "year")
public class Vehicle {

    enum Type {
        CAR, BUS, BIKE;
    }
    List<Wheel> wheels;
    private int year;
    private Color color;
    private Type type;

}
