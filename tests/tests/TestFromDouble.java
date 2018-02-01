package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import oop1.StringUtils;

class TestFromDouble {

	@Test
		void testFromDouble() {
	    double source = 3.1415; //������� ������, ������� �� ����� � ����������� �������
	    String expected="3.1415"; //��������� ������

	    String actual = StringUtils.fromDouble(source); //�������� ����������� ��� � ��������� ��������� ��� ������
	    assertEquals(expected, actual); //assertEquals ���������� ��������������� �������� expected � actual �, � ������ ����� ��� �� ������������, ����������� ����
	}

}
