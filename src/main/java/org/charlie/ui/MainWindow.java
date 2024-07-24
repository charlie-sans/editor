package org.charlie.ui;
// swing imports
import javax.swing.*;
public class MainWindow {
    public MainWindow() {
        System.out.println("MainWindow created");

    }
    public void init() {
        JFrame frame = new JFrame("Main Window");
        JButton button = new JButton("Help");
        button.addActionListener(e -> {
            HelpWindow helpWindow = new HelpWindow();
            helpWindow.init(frame);
        });
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
