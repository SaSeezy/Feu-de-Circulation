package test;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Feux m = new Feux();
        
        JFrame fn = new JFrame();
        fn.setLocationRelativeTo(null);
        fn.setSize(400, 300);
        fn.add(m);
        fn.setVisible(true);

    }

}
