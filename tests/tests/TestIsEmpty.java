package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import oop1.StringUtils;

class TestIsEmpty {

	 @Test
	    void testIsEmpty() {
	        assertFalse("Non empty string claimed to be empty", StringUtils.isEmpty("TEST"));
	        assertTrue("Empty string not recognized", StringUtils.isEmpty(""));
	        assertTrue("Whitespaces not recognized",StringUtils.isEmpty(" "));
	        /*����������� ����������������� ���������:  ������ � ��������� �� �����, 
	         * ������ ��� �����-���� �������� � ��� � ����� 
	         * ������ � ���������� ��������� ��������� ������
	         */
	    }
	}
