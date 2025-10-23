package com.example;

public class App {
    public static final String VERSION = "1.1.1"; // PATCH

    public static void main(String[] args) {
        System.out.println("Hello, SemVer!");
        System.out.println("Version: " + VERSION);

        // Фикс: более точное сообщение
        System.out.println("Number of CLI args: " + args.length);
    }
}
