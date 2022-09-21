package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CitiesTest {

    @Test
    public void CitiesTest1(){
        Cities cities = new Cities();
        assertArrayEquals(new String[]{"Sevilla", "Segovia"}, cities.ReturnCity("Se"));
    }
    @Test
    public void CitiesTest2(){
        Cities cities = new Cities();
        assertArrayEquals(new String[]{"Malaga", "Madrid", "Mallorca"}, cities.ReturnCity("Ma"));
    }
    @Test
    public void CitiesTest3(){
        Cities cities = new Cities();
        assertArrayEquals(new String[]{"Madrid"}, cities.ReturnCity("mad"));
    }
    @Test
    public void CitiesTest4(){
        Cities cities = new Cities();
        assertArrayEquals(new String[]{"Nothing found"}, cities.ReturnCity("Yugoslavia"));
    }
    @Test
    public void CitiesTest5(){
        Cities cities = new Cities();
        assertArrayEquals(new String[]{"Madrid"}, cities.ReturnCity("Ma?r"));
    }
    @Test
    public void CitiesTest6(){
        Cities cities = new Cities();
        assertArrayEquals(new String[]{"Malaga", "Madrid", "Mallorca"}, cities.ReturnCity("Ma*"));
    }

}