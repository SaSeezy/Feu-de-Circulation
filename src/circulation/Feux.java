package circulation;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

abstract class Feux extends JComponent{

    private Circulation circulation;
    
    public Feux(Circulation circulation) {
        // TODO Auto-generated constructor stub
        this.circulation = circulation;
    }
    
    public Circulation getCirculation() {
        return this.circulation;
    }
    
    public void set(Circulation circulation) {
        this.circulation = circulation;
    }
    
    abstract void handle();
    abstract void changeEtat();
    public abstract void paintComponent(Graphics g);

}
