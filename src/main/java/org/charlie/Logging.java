package org.charlie;

public class Logging {
    public static void print(String message, Boolean debug) {
        if (debug) {
            System.out.println(message);
        }
    }
}
