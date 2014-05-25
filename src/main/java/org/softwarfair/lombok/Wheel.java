package org.softwarfair.lombok;

import lombok.ToString;
import lombok.Value;

@Value(staticConstructor = "of")
@ToString(includeFieldNames = false, of = "size")
public class Wheel {
    private int size;
    private String tyreBrand;
}
