package org.charlie;

// UI framework import
import org.charlie.ui.MainWindow;
import org.charlie.ui.HelpWindow;
import org.charlie.Logging;
import javax.swing.*;
public class Main {
    public static final String VERSION = "1.0";
    public static Boolean DEBUG = false;

    public static void main(String[] args) {
        // setup debug

        // setup args
        if (args.length > 0) {
            if (args[0].equals("-d")) {
                DEBUG = true;
            }
        }

        System.out.println("Hello World");
        MainWindow mainWindow = new MainWindow();
        mainWindow.init();
    }
}