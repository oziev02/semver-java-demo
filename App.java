package com.example;

public class App {
    public static final String VERSION = "1.2.0"; // готовим MINOR

    private static String greeting(String lang) {
        if (lang == null) return "Hello, SemVer!";
        switch (lang.toLowerCase()) {
            case "ru": return "Привет, SemVer!";
            case "es": return "¡Hola, SemVer!";
            default:   return "Hello, SemVer!";
        }
    }

    public static void main(String[] args) {
        String lang = (args.length > 0) ? args[0] : "en";

        System.out.println(greeting(lang));
        System.out.println("Version: " + VERSION);
        System.out.println("Number of CLI args: " + Math.max(args.length - 1, 0));
    }
}
