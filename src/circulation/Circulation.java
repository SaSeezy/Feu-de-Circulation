package circulation;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Circulation{ 

    private Feux feu;
    
    public Circulation() {
        // TODO Auto-generated constructor stub
        
    }

    public void setFeux(Feux feu) {
        this.feu = feu;
    }
    
    public void service() {
        this.feu.handle();
    }
}
