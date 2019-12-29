package music;

import java.io.IOException;
import java.util.ArrayList;

public class Game {
	private ArrayList<Anime> list;
	private int n;
	public Game(String diff, int n) {
		if(diff.equals("Easy")) {
			
		}else if(diff.equals("Medium")){
			
		}else if(diff.equals("Hard")){
			
		}else {
			
		}
	}
	public void setEasy() throws IOException {
		list = AnimeList.getEasy(n);
	}
	public void setMedium() throws IOException {
		list = AnimeList.getMedium(n);
	}
	public void setHard() throws IOException {
		list = AnimeList.getHard(n);
	}
	public void setExtreme() throws IOException {
		list = AnimeList.getExtreme(n);
	}
}
