package org.softwarfair.lombok;

import org.softwarfair.lombok.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testGetName() throws Exception {
        Person john = new Person("John Q");
        assertEquals("Cheers for John Q", john.getCheers());
    }

    @Test
    public void testSetName() throws Exception {
        Person wrongName = new Person("Michael Yordan");
        wrongName.setName("Michael Jordan");
        assertEquals("Michael Jordan", wrongName.getName());
    }
}