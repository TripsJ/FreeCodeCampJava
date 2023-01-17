package works.trips.javacourse.lesson2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
// needs to be added to the classpath
// Look into classpath

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld(){

        Person jerome = new Person();
        assertEquals("Hello World", jerome.helloWorld());
    }
}
