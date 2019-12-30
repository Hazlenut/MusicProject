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
	
	private static Game game = maingui.game;
	

	
    public static void startGame(){
    	  JFrame frame = new JFrame("Music Contest");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(800, 600);
          frame.setVisible(true);
    	
          
          JButton add_button1 = new JButton("+1");
          JButton add_button2 = new JButton("+1");

          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          JLabel scoreboard = new JLabel(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));
          
          
          JLabel name1 = new JLabel(game.getName1());
          JLabel name2 = new JLabel(game.getName2());
          JPanel mainscreen = new JPanel();
          
          name1.setSize(200,25);
          name1.setLocation(100,100);
         
          name2.setSize(200,25);
          name2.setLocation(300,300);
          
          mainscreen.add(add_button1);
          mainscreen.add(add_button2);
          mainscreen.add(name1);
          mainscreen.add(name2);
          
          frame.getContentPane().add(mainscreen);
          
          
          
          
          
          
          
    }
    	

    public static String nextUrl(int n) {
    	String url = game.getList().get(n).getUrl();
    	return url;
    }
}

