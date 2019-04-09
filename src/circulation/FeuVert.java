package circulation;

import java.awt.Color;
import java.awt.Graphics;

public class FeuVert extends Feux{

    public FeuVert(Circulation circulation) {
        // TODO Auto-generated constructor stub
        super(circulation);
    }

    @Override
    void handle() {
        // TODO Auto-generated method stub
        this.changeEtat();
        
    }

    @Override
    void changeEtat() {
        // TODO Auto-generated method stub
        System.out.println("Feu vert");
        
        try {
            Thread.sleep(110000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        super.getCirculation().setFeux(new FeuRouge(getCirculation()));
        
    }

    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.red);
        g.fillOval(100, 20, 30, 30);
        //this.changeEtat();
        
    }

}
