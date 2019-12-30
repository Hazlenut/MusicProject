package music;
import java.awt.*;
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
          JButton add_button3 = new JButton("+2");
          JButton add_button4 = new JButton("+2");
          JButton next = new JButton("Next");

          
          
          
          
          
          
          
          
          
          
          
          

          
          JLabel scoreboard = new JLabel(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));

        
          
          JLabel name1 = new JLabel(game.getName1());
          JLabel name2 = new JLabel(game.getName2());
          JLabel title_answer = new JLabel("Anime name: ");
          JLabel song_answer = new JLabel("Song name: ");
          
          JPanel mainscreen = new JPanel();
  			mainscreen.setLayout(null);

          
        mainscreen.add(next);
        next.setSize(100,40);
        next.setLocation(350, 500);
      
        mainscreen.add(title_answer);
        title_answer.setSize(400,200);
        title_answer.setLocation(50, 300);
        
        mainscreen.add(song_answer);
        song_answer.setSize(400,200);
        song_answer.setLocation(50, 340);
        
          mainscreen.add(add_button1);
          add_button1.setSize(100,40);
          add_button1.setLocation(80,150);
          
          mainscreen.add(add_button2);
          add_button2.setSize(100,40);
          add_button2.setLocation(600,150);
          
          mainscreen.add(add_button3);
          add_button3.setSize(100,40);
          add_button3.setLocation(80,200);
          
          mainscreen.add(add_button4);
          add_button4.setSize(100,40);
          add_button4.setLocation(600,200);
          
          mainscreen.add(name1);
          name1.setSize(100,40);
          name1.setLocation(100,50);
          
          mainscreen.add(name2);
          name2.setSize(100,40);
          name2.setLocation(630,50);
          
          
          mainscreen.add(scoreboard);
          scoreboard.setFont(new Font(scoreboard.getFont().getFontName(), Font.PLAIN, 60));
          scoreboard.setSize(400,100);
          scoreboard.setLocation(310,20);
          
          
          
          next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        	  
        	  
          });
          
          
  		add_button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				name1_score++;
				scoreboard.setText(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));
			}

  		});
  		add_button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				name2_score++;
				scoreboard.setText(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));

				
			}

  		});
  		
  		
  		add_button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				name1_score+= 2;
				scoreboard.setText(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));

				
			}

  		});
  		
  		add_button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				name2_score+=2;
				scoreboard.setText(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));

				
			}

  		});
  		
          frame.getContentPane().add(mainscreen);
          
          
          
          
          
          
          
    }
    	

    public static String nextUrl(int n) {
    	String url = game.getList().get(n).getUrl();
    	return url;
    }
}

