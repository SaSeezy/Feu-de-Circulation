package circulation;

import java.awt.Color;
import java.awt.Graphics;

public class FeuOrange extends Feux {

    public FeuOrange(Circulation circulation) {
        super(circulation);
        // TODO Auto-generated constructor stub
    }

   @Override
    void handle() {
        // TODO Auto-generated method stub
        this.changeEtat();
        
    }

    @Override
    void changeEtat() {
        // TODO Auto-generated method stub
        System.out.println("Feu Orange");
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        super.getCirculation().setFeux(new FeuVert(getCirculation()));
        
    }

    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.yellow);
        g.fillOval(100, 20, 30, 30);
        this.changeEtat();
        
    }

}
