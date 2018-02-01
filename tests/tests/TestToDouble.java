package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import oop1.StringUtils;

class TestToDouble {

    @Test
   void testToDouble() {
        assertEquals(3.1415, StringUtils.toDouble("3.1415"), 0.0001); //входное значение, эталонное значение и сравнение с результатом для чисел с плавающей точкой
        assertEquals("Not NaN for null", Double.NaN, StringUtils.toDouble(null), 0.00001); //проверяется что для переданного null возвращается NaN
    }
}
