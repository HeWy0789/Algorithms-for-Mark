package org.example;

public class Calculator {
    public static void main(String[] args) {

        ReaderFromConsole reader = new ReaderFromConsole();
        Matematika matematika = new Matematika();

        try {
            Calculator.runCalculator(reader, matematika);
        } catch (Exception e) {
            System.out.println("Сбой программы, ошибка: " + e.getMessage());
            Calculator.main(args);
        }
    }

    private static void runCalculator(ReaderFromConsole reader, Matematika matematika) {
        while (true) {
            System.out.println("Введите число от 1 до 10");
            String op = "";
            int arabInt;
            int arab2Int;
            String arab = "";
            String arab2 = "";
            int result;
            try {
                String[] array = reader.parseText();
                if (array.length != 3) {
                    throw new RuntimeException("строка не является математической операцией");
                }
                arab = array[0];
                op = array[1];
                arab2 = array[2];

                arabInt = Integer.parseInt(arab);

                try {
                    arab2Int = Integer.parseInt(arab2);
                } catch (Exception e) {
                    throw new RuntimeException("используются одновременно разные системы счисления");
                }

                matematika.writeInConsoleArabicValue(arabInt, arab2Int, op);

            } catch (NumberFormatException nmfe) {
                arabInt = matematika.returnRimskoeValue(arab);
                arab2Int = matematika.returnRimskoeValue(arab2);
                result = matematika.returnResult(op, arabInt,arab2Int);

                matematika.writeInConsoleRimValue(result);

            }
        }
    }
}
