package music;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicReference;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
//import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
*/

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;

public class gamegui {
	static int name1_score = 0;
	static int name2_score = 0;
	static int turn = 0;

	private static Game game = maingui.game;
	//private final static AtomicReference<Browser> browserReference = new AtomicReference<>();

	public static void startGame() {
		JFrame frame = new JFrame("Music Contest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);

		JButton add_button1 = new JButton("+1");
		JButton add_button2 = new JButton("+1");
		JButton add_button3 = new JButton("+2");
		JButton add_button4 = new JButton("+2");
		JButton next = new JButton("Next");
		JButton finish = new JButton("Finish");

		JLabel scoreboard = new JLabel(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));

		JLabel name1 = new JLabel(game.getName1());
		JLabel name2 = new JLabel(game.getName2());
		JLabel title_answer = new JLabel("Anime name: ");
		JLabel song_answer = new JLabel("Song name: ");
		JLabel author_answer = new JLabel("Author: ");

		JPanel mainscreen = new JPanel();
		mainscreen.setLayout(null);

		mainscreen.add(next);
		next.setSize(100, 40);
	    next.setLocation(350, 500);

		mainscreen.add(finish);
		finish.setSize(100, 40);
		finish.setLocation(350, 500);
		finish.setVisible(false);

		mainscreen.add(title_answer);
		title_answer.setSize(400, 200);
		title_answer.setLocation(50, 300);

		mainscreen.add(song_answer);
		song_answer.setSize(400, 200);
		song_answer.setLocation(50, 340);

		mainscreen.add(author_answer);
		author_answer.setSize(400, 200);
		author_answer.setLocation(50, 380);

		mainscreen.add(add_button1);
		add_button1.setSize(100, 40);
		add_button1.setLocation(50, 150);

		mainscreen.add(add_button2);
		add_button2.setSize(100, 40);
		add_button2.setLocation(650, 150);

		mainscreen.add(add_button3);
		add_button3.setSize(100, 40);
		add_button3.setLocation(50, 200);

		mainscreen.add(add_button4);
		add_button4.setSize(100, 40);
		add_button4.setLocation(650, 200);

		mainscreen.add(name1);
		name1.setSize(100, 40);
		name1.setLocation(70, 50);

		mainscreen.add(name2);
		name2.setSize(100, 40);
		name2.setLocation(680, 50);

		mainscreen.add(scoreboard);
		scoreboard.setFont(new Font(scoreboard.getFont().getFontName(), Font.PLAIN, 60));
		scoreboard.setSize(400, 100);
		scoreboard.setLocation(310, 20);

	///	SimpleSwingBrowser view = new SimpleSwingBrowser();
	///	view.setVisible(false);
		
		JFXPanel jfxPanel = new JFXPanel();
		frame.add(jfxPanel);
		jfxPanel.setSize(400,250);
		jfxPanel.setLocation(200,120);
		

		
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				title_answer.setText("Anime Name: " + game.getList().get(turn).getTitle());
				song_answer.setText("Song Name: " + game.getList().get(turn).getName());
				author_answer.setText("Author: " + game.getList().get(turn).getAuthor());
		
				Platform.runLater(() -> {
					final WebView webView = new WebView();
					final Scene video = new Scene(webView);
				    jfxPanel.setScene(video);

				    webView.getEngine().load(game.getList().get(turn-1).getUrl() + "?autoplay=1");
				});
				
				///view.setVisible(true);
				///view.loadURL(game.getList().get(turn).getUrl().replace("/watch?v=", "/embed/") + "?autoplay=1");
				turn++;
				if (turn == game.getN()) {
					next.setVisible(false);
					finish.setVisible(true);
				}
			}
			
		});
		
		
		

		finish.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

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
				name1_score += 2;
				scoreboard.setText(Integer.toString(name1_score) + " VS " + Integer.toString(name2_score));

			}

		});

		add_button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				name2_score += 2;
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
