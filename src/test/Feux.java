package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Feux extends JComponent{
    
    public void paint(Graphics g) {  
          
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
      
    }  

}
