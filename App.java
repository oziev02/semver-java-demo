package com.example;

// Минимальное приложение без Maven.
// Версию держим константой и меняем при каждом релизе.
public class App {
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        System.out.println("Hello, SemVer!");
        System.out.println("Version: " + VERSION);
    }
}
