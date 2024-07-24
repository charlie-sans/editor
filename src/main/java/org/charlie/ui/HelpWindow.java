package org.charlie.ui;

import org.charlie.*;
import org.charlie.Logging;

import javax.swing.*;
public class HelpWindow {
    public String helptext = """
            Welcome to the official ish STI Code Editor Version %n .
            This is a simple code editor that allows you to write and run code in various languages.
            The supported languages are:
            1. Python
            2. Java
            3. C
            4. C++
             
        """;
    public HelpWindow() {
        System.out.println("HelpWindow created");

    }
    public void init(JFrame parentFrame) {
        Logging.print("HelpWindow init",Main.DEBUG);
        JFrame frame = new JFrame("Help Window");

        JTextArea textArea = new JTextArea();
        textArea.setText(String.format(helptext, Main.VERSION));
        // set the text area to be not editable
        textArea.setEditable(false);
        frame.setSize(400, 400);
        frame.add(textArea);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);





    }
}
