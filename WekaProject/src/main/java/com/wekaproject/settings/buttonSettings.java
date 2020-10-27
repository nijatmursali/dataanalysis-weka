package com.wekaproject.settings;

import java.awt.Color;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nijat
 */
public class buttonSettings {
    private static Color originalColor;
    
    public static void setBg(JButton button, Color bgColor) {
        originalColor = button.getBackground();
        button.setBackground(bgColor);
    }
    
    public static void setOriginalBg(JButton button) {
        button.setBackground(originalColor);
    }
    
}
