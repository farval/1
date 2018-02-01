package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import oop1.StringUtils;

class TestToArray {


    @Test
    void testToArray() {
        String[] expected = {"T", "E", "S", "T"};
        String source="T:E:S:T";
        assertArrayEquals(expected, StringUtils.toArray(source, ':')); 
        /*сравнивает эквивалентность каждого элемента обоих массивов.
        * сравниваются элементы одинаковой длины и массивы разной длины сразу признаются не эквивалентными */
        assertEquals(0,StringUtils.toArray(null, ':').length); 
	}

}
