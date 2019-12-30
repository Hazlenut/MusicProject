package music;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class maingui {
	public static Game game;
	public static void main(String args[]) {

		JFrame frame = new JFrame("Music Contest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		// create buttons

		JPanel mainscreen = new JPanel();

		mainscreen.setLayout(null);
		JButton easybutton = new JButton("Easy");
		JButton mediumbutton = new JButton("Medium");
		JButton hardbutton = new JButton("Hard");
		JButton extremebutton = new JButton("Extreme");
		JTextField number = new JTextField(3);
		JTextField name1 = new JTextField(5);
		JTextField name2 = new JTextField(5);
		JLabel title = new JLabel("Opening Contest");
		JLabel numblabel = new JLabel("Number of Songs? ");
		

		title.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 40));
		mainscreen.add(title);
		title.setSize(400, 60);
		title.setLocation(250, 50);

		mainscreen.add(easybutton);
		easybutton.setSize(100, 40);
		easybutton.setLocation(50, 400);

		mainscreen.add(mediumbutton);
		mediumbutton.setSize(100, 40);
		mediumbutton.setLocation(250, 400);

		mainscreen.add(hardbutton);
		hardbutton.setSize(100, 40);
		hardbutton.setLocation(450, 400);

		mainscreen.add(extremebutton);
		extremebutton.setSize(100, 40);
		extremebutton.setLocation(650, 400);

		mainscreen.add(number);
		number.setSize(100, 20);
		number.setLocation(350, 230);

		mainscreen.add(numblabel);
<<<<<<< HEAD
=======
		numblabel.setSize(200,40);
		numblabel.setLocation(350,200);
		
		mainscreen.add(name1);
		name1.setSize(100,20);
		name1.setLocation(100,230);
		
		mainscreen.add(name2);
		name2.setSize(100,20);
		name2.setLocation(500,230);
		
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
>>>>>>> 7419e6dda49fe9a3622b6fe7c02f3a4813e15810

		numblabel.setSize(200, 40);
		numblabel.setLocation(350, 200);

		// easy button action
		easybutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// do action when easy is pressed
				int n = Integer.parseInt(number.getText());
				String p1 = name1.getText();
				String p2 = name2.getText();
				try {
					game = new Game("Easy", n,p1,p2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		// medium button action
		mediumbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// do action when easy is pressed
				int n = Integer.parseInt(number.getText());
				String p1 = name1.getText();
				String p2 = name2.getText();
				try {
					game = new Game("Medium", n,p1,p2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
<<<<<<< HEAD
//>>>>>>> 3e626042c0bb89cf5c72484d11528e7a1c09fb1f
=======

>>>>>>> 7419e6dda49fe9a3622b6fe7c02f3a4813e15810
		
		hardbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// do action when easy is pressed
				int n = Integer.parseInt(number.getText());
				String p1 = name1.getText();
				String p2 = name2.getText();
				try {
					game = new Game("Hard", n,p1,p2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.dispose();
				gamegui.startGame();
			}

		});
		
		extremebutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// do action when easy is pressed
				int n = Integer.parseInt(number.getText());
				String p1 = name1.getText();
				String p2 = name2.getText();
				try {
					game = new Game("Extreme", n,p1,p2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		
		// mainscreen.setLayout(new GridBagLayout());
		// GridBagConstraints layout = new GridBagConstraints();

		frame.getContentPane().add(mainscreen);

	}
}