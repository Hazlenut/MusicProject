package music;

import java.io.IOException;
import java.util.ArrayList;

public class Game {
	private ArrayList<Anime> list;
	private int n;
	private String name1;
	private String name2;
	public Game(String diff, int n, String name1, String name2) throws IOException {
		this.n = n;
		this.name1 = name1;
		this.name2 = name2;
		if(diff.equals("Easy")) {
			setEasy();
		}else if(diff.equals("Medium")){
			setMedium();
		}else if(diff.equals("Hard")){
			setHard();
		}else {
			setExtreme();
		}
	}
	public ArrayList<Anime> getList() {
		return list;
	}
	public void setList(ArrayList<Anime> list) {
		this.list = list;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
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
