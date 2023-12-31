package com.conversor.model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;

public class ImagemPainel extends JComponent{

	private static final long serialVersionUID = 1L;
	private Image image;
	
    public ImagemPainel(Image image) {
        this.image = image;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

}
