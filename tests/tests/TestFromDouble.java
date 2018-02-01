package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import oop1.StringUtils;

class TestFromDouble {

	@Test
		void testFromDouble() {
	    double source = 3.1415; //входные данные, которые мы отдаём в проверяемую функцию
	    String expected="3.1415"; //эталонные данные

	    String actual = StringUtils.fromDouble(source); //вызываем проверяемый код и сохраняем результат его работы
	    assertEquals(expected, actual); //assertEquals сравнивает эквивалентность объектов expected и actual и, в случае когда они не эквивалентны, проваливает тест
	}

}
