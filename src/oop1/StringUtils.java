package oop1;

/*Разделение строки на подстроки
Слияние строк из массива
Проверка строк на пустоту
Преобразование в число и обратно*/

public final class StringUtils {
	 
    private StringUtils() { }
 
    /*
     Объединяет массив строки с одной строкой, вставляя разделители между элементами массива.
     * параметр source для соединения массива строки.
     * @параметр del для разделения записей массива.
     * @возвращает значение NULL, если массив имеет значение NULL или присоединились элементы массива.
     */
    public static String joinArray(final String[] source, final char del) {
        if (source == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < source.length - 1; i++) {
            result.append(source[i]);
            result.append(del);
        }
 
        result.append(source[source.length - 1]);
 
        return result.toString();
    }
 
    /*
     * Разделяет прилагаемые строки массивом строк. Разделяет поставленные строки на массив строк
     * параметр String source для разделения
     * параметр delimiter - раздилитель. Символ, используемый в качестве границы маркера.
     * вернуть пустой массив, если источник имеет значение null или разделить массив подстрок,  на символ разделителя.
     */
    public static String[] toArray(final String source, final char delimiter) {
        if (source == null) {
            return new String[]{};
        }
        return source.split(Character.toString(delimiter));
    }
 
    /*
     * Проверяет, содержит ли строка любой контент (любые непустые символы)
     * Параметр String subject для проверки.
     * Возвращает true, если строка не содержит ничего или имеет только пробелы, в противном случае false.
     */
    public static boolean isEmpty(final String subject) {
        return subject == null || subject.replaceAll("\\s", "").isEmpty();
    }
 
    /*
      * Пытается извлечь двойное значение из String.
      * Параметр String source для обработки.
      * return - возвращает извлеченное двойное значение или NaN, если источник имеет значение null..
     */
    public static double toDouble(final String source) {
        if (source == null) {
            return Double.NaN;
        }
        return Double.valueOf(source);
    }
    
    	 /*
          * Преобразует double в строку.
          * параметр source для преобразования значения.
          * @return возвращает текстовое представление double.
          */
 
    public static String fromDouble(final double source) {
        return String.valueOf(source);
    }
}