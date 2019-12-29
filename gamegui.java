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
	String name1;
	String name2;
	
	public gamegui(String x, String y) {
		this.name1 = x;
		this.name2 = y;
	}
    public static void main(String args[]){
    	  JFrame frame = new JFrame("Music Contest");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(800, 600);
          frame.setVisible(true);
    	
          
          JButton add_button1 = new JButton("+1");
          JButton add_button2 = new JButton("+1");
          JLabel name1 = new JLabel(this.name1);
          
          JPanel mainscreen = new JPanel();
          
          
          
          frame.getContentPane().add(mainscreen);
          
          
          
          
          
          
          
    	
    	
    }
}
