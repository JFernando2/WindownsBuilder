package teste1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel{


    //cria imagem de fundo
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon fundo = new ImageIcon(getClass().getResource("/Images/unnamed.jpg"));
        Image img = fundo.getImage();
        g.drawImage(img,0,0,this);


    }
}