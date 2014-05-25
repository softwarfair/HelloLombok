package org.softwarfair.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Setter
@Slf4j
public class Person {

    private String name;

    public String getCheers() {
        log.debug("executing the cheers method");
        return "Cheers for " + name;
    }

}
