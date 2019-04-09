package circulation;

import javax.swing.JFrame;

import test.Feux;

public class Test {

 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circulation circul = new Circulation();
        
        JFrame fn = new JFrame();
        fn.setLocationRelativeTo(null);
        fn.setSize(400, 300);
        
        
        circul.setFeux(new FeuRouge(circul));
        for(int i = 0; i < 5; i++) {
            circul.service();
            /*fn.add(new FeuRouge(circul));
            fn.setVisible(true);*/
        }
        
    }

}
