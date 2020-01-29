package oefening_4;
import javax.swing.*;

import java.awt.event.*;

public class NaamGenerator {

private static JLabel label;
public static void main (String[] args){

    JFrame frame = new JFrame("Naam generator");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,100);
    JPanel panel = new JPanel ();
    frame.add(panel);
    JButton button = new JButton("Naam kiezen");
    panel.add(button);
    label = new JLabel();
    panel.add(label);
    button.addActionListener(new Action());

}
    static class Action implements ActionListener{

        public void actionPerformed (ActionEvent e){
            String[] naam = {"Ahmed", "Roald", "Kevin", "Jan", "Hans"};

            int random = (int) (Math.random()*naam.length);

            label.setText("De willekerurig gekozen naam is: "  + naam[random]);

        }
    }
}
