package org.example;

public class Matematika {

    private final int[] arabic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 90, 100};
    private final String[] rimskie = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XL", "L", "XC", "C"};

    public void writeInConsoleArabicValue(int first, int second, String operation) {
        // Выводит значение в консоль
        if (first >= 1 && first <= 10 && second >= 1 && second <= 10) {
            int result = 0;
            System.out.println(returnOperation(first, second, operation));
        }
    }

    public int returnRimskoeValue(String rim) {
        // сравниваем массивы и находим арабские
        int arabInt = 0;
        for (int i = 0; i < rimskie.length; i++) {
            if (rim.compareTo(rimskie[i]) == 0) {
                arabInt = arabic[i];
            }
        }

        if (arabInt == 0) {
            throw new RuntimeException("используются одновременно разные системы счисления");
        }
        return arabInt;
    }

    public int returnOperation( int arabInt, int arab2Int, String op) {
        int result = 0;
        switch (op) {
            case ("+"): {
                result = arabInt + arab2Int;
            }
            case ("-"): {
                result = arabInt - arab2Int;
            }
            case ("*"): {
                result = arabInt * arab2Int;
            }
            case ("/"): {
                result = arabInt / arab2Int;
            }
        }
        return  result;
    }

    public void writeInConsoleRimValue(int result) {
        StringBuilder rome = new StringBuilder();
        for (int i = arabic.length - 1; i >= 0; i--) {
            if (result >= arabic[i]) {
                result = result - arabic[i];
                rome.append(rimskie[i]);
                i = i + 1;
            }
        }
        System.out.println(rome);
    }
}
