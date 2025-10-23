package com.example;

public class App {
    public static final String VERSION = "1.1.0"; // было 1.0.0 → MINOR

    public static void main(String[] args) {
        System.out.println("Hello, SemVer!");
        System.out.println("Version: " + VERSION);

        // Новая фича: печатаем количество аргументов (без имени класса/файла)
        System.out.println("Args count: " + args.length);
    }
}
