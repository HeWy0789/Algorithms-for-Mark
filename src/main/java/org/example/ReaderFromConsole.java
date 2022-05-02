package org.example;

import java.util.Scanner;

public class ReaderFromConsole {

    private final Scanner scanner = new Scanner(System.in);

    public String[] parseText() {
        String stroka = scanner.nextLine();
        return stroka.split(" ");
    }

    public boolean hasNext() {
        return scanner.hasNext();
    }

}
