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
		JLabel name1label = new JLabel("Player 1");
		JTextField name2 = new JTextField(5);
		JLabel name2label = new JLabel("Player 2");
		JLabel title = new JLabel("Opening Contest");
		JLabel numblabel = new JLabel("Number of Songs? ");
		

		title.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 40));
		mainscreen.add(title);
		title.setSize(400, 60);
		title.setLocation(230, 50);

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

		numblabel.setSize(200,40);
		numblabel.setLocation(350,200);
		
		mainscreen.add(name1);
		name1.setSize(100,20);
		name1.setLocation(100,230);
		
		mainscreen.add(name1label);
		name1label.setSize(100,40);
		name1label.setLocation(125,200);
		
		mainscreen.add(name2);
		name2.setSize(100,20);
		name2.setLocation(600,230);
		
		mainscreen.add(name2label);
		name2label.setSize(100,40);
		name2label.setLocation(625,200);
	
		numblabel.setSize(200, 40);
		numblabel.setLocation(350, 200);

		// easy button action
		easybutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// do action when easy is pressed
				if(name1.getText().contentEquals("") || name2.getText().contentEquals("") || number.getText().contentEquals("")) {
					JLabel error = new JLabel("Fill in the empty boxes");
					error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
					mainscreen.add(error);
					error.setSize(400,50);
					error.setForeground(Color.RED);

					error.setLocation(260,475);

					
				}
				else {
					
					try {
				int n = Integer.parseInt(number.getText());
				String p1 = name1.getText();
				String p2 = name2.getText();
				try {
					game = new Game("Easy", n,p1,p2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.dispose();
				gamegui.startGame();
				}
					catch(NumberFormatException e)
					{
						JLabel error = new JLabel("Number must be an integer");
						error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
						mainscreen.add(error);
						error.setSize(400,50);
						error.setForeground(Color.RED);

						error.setLocation(240,475);
					}
				}
				
			}

		});

		// medium button action
		mediumbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(name1.getText().contentEquals("") || name2.getText().contentEquals("") || number.getText().contentEquals("")) {
					JLabel error = new JLabel("Fill in the empty boxes");
					error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
					mainscreen.add(error);
					error.setSize(400,50);
					error.setForeground(Color.RED);

					error.setLocation(260,475);

					
				}
				else {
					
				try {
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
				frame.dispose();
				gamegui.startGame();
			
				}
				catch(NumberFormatException e)
				{
					JLabel error = new JLabel("Number must be an integer");
					error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
					mainscreen.add(error);
					error.setSize(400,50);
					error.setForeground(Color.RED);

					error.setLocation(240,475);
				}
				
				
				
					
				}
			}

		});

		hardbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// do action when easy is pressed
				if(name1.getText().contentEquals("") || name2.getText().contentEquals("") || number.getText().contentEquals("")) {
					JLabel error = new JLabel("Fill in the empty boxes");
					error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
					mainscreen.add(error);
					error.setSize(400,50);
					error.setForeground(Color.RED);

					error.setLocation(260,475);

					
				}
				else {
					try {
						
					
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
				
				catch(NumberFormatException e)
				{
					JLabel error = new JLabel("Number must be an integer");
					error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
					mainscreen.add(error);
					error.setSize(400,50);
					error.setForeground(Color.RED);

					error.setLocation(240,475);
				}
			}
			}});
		
		extremebutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// do action when easy is pressed
				if(name1.getText().contentEquals("") || name2.getText().contentEquals("") || number.getText().contentEquals("")) {
					JLabel error = new JLabel("Fill in the empty boxes");
					error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
					mainscreen.add(error);
					error.setSize(400,50);
					error.setForeground(Color.RED);

					error.setLocation(260,475);

					
				}
				else {
					try {
				int n = Integer.parseInt(number.getText());
				String p1 = name1.getText();
				String p2 = name2.getText();
				try {
					game = new Game("Extreme", n,p1,p2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.dispose();
				gamegui.startGame();
			}
				
				catch(NumberFormatException e)
				{
					JLabel error = new JLabel("Number must be an integer");
					error.setFont(new Font(title.getFont().getFontName(), Font.PLAIN, 25));
					mainscreen.add(error);
					error.setSize(400,50);
					error.setForeground(Color.RED);

					error.setLocation(240,475);
				}
			}

		}});
		
		// mainscreen.setLayout(new GridBagLayout());
		// GridBagConstraints layout = new GridBagConstraints();

		frame.getContentPane().add(mainscreen);

	}
}