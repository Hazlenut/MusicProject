package music;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class maingui{
    public static void main(String args[]){

        JFrame frame = new JFrame("Music Contest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
		//create buttons
        
        JPanel mainscreen = new JPanel();
        
        
       
        mainscreen.setLayout(null);
        JButton easybutton = new JButton("Easy");
        JButton mediumbutton = new JButton("Medium");
        JButton hardbutton = new JButton("Hard");
        JButton extremebutton = new JButton("Extreme");
        JTextField number = new JTextField(3);
        JLabel title = new JLabel("Opening Contest"); 
        JLabel numblabel = new JLabel("Number of Songs? ");
        
        title.setFont(new Font(title.getFont().getFontName(),Font.PLAIN,40));
		mainscreen.add(title);
		title.setSize(400,60);
		title.setLocation(250,50);
        
		mainscreen.add(easybutton);
		easybutton.setSize(100,40);
		easybutton.setLocation(50,400);
		
		mainscreen.add(mediumbutton);
		mediumbutton.setSize(100,40);
		mediumbutton.setLocation(250,400);
		
		mainscreen.add(hardbutton);
		hardbutton.setSize(100,40);
		hardbutton.setLocation(450,400);
		
		mainscreen.add(extremebutton);
		extremebutton.setSize(100,40);
		extremebutton.setLocation(650,400);
		
		mainscreen.add(number);
		number.setSize(100,20);
		number.setLocation(350,230);
		
		mainscreen.add(numblabel);
		numblabel.setSize(200,40);
		numblabel.setLocation(350,200);
		
		
		
		
		//easy button action
				easybutton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// do action when easy is pressed
						
					}
					
				});
				
				//medium button action
						mediumbutton.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								// do action when easy is pressed
								
							}
							
						});
	
		
		
		
		frame.getContentPane().add(mainscreen);

    }
}