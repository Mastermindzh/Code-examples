package com.mastermindzh;

/**
 * Created by mastermindzh on 3/9/16.
 */

import java.awt.Container;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DobbelsteenSwingView extends JFrame implements Observer {
    private int dobbelwaarde;

    public DobbelsteenSwingView() {
        setLocation(500, 500);
        setSize(100, 100);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDobbelwaarde(int waarde) {
        this.dobbelwaarde = waarde;
    }

    public void showMe() {
        Container ctr = this.getContentPane();
        URL fileLoc = ClassLoader.getSystemResource(dobbelwaarde + ".jpg");
        JLabel jl = new JLabel(new ImageIcon(fileLoc));
        ctr.add(jl);
        validate();
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof Integer) {
            this.setDobbelwaarde(((Integer) arg).intValue());
            this.showMe();
        }
    }
}

