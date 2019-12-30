package music;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class gamegui {
	static int name1_score = 0;
	static int name2_score = 0;
	

    public static void main(String args[]){
    	  JFrame frame = new JFrame("Music Contest");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(800, 600);
          frame.setVisible(true);
    	
          
          JButton add_button1 = new JButton("+1");
          JButton add_button2 = new JButton("+1");
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          JLabel scoreboard = new JLabel(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));
          
          
          JPanel mainscreen = new JPanel();
          
          
          
          frame.getContentPane().add(mainscreen);
          
          
          
          
          
          
          
    	
    	
    }
}
