package music;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AnimeList {
	public static ArrayList<Anime> getAnimeList() throws IOException {
		
		ArrayList<Anime> res = new ArrayList<Anime>();
		FileInputStream input = new FileInputStream(new File("src/music/AnimeList.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		
		XSSFSheet sheet = wb.getSheetAt(wb.getSheetIndex("Sheet1"));
		for(Row c: sheet) {
			Anime a = new Anime();
			a.setTitle(c.getCell(0).getStringCellValue());
			a.setUrl(c.getCell(1).getStringCellValue());
			if(c.getCell(2).getStringCellValue().equals("0")) {
				a.setDifficult(false);
			}else{
				a.setDifficult(true);
			}
			res.add(a);
			
		}
		
		return res;
	}
	public static ArrayList<Anime> getEasy(int n) throws IOException {
		ArrayList<Anime> all = getAnimeList();
		ArrayList<Anime> res = new ArrayList<Anime>();
		ArrayList<Integer> used = new ArrayList<Integer>();
		while(res.size() != n) {
			int rand = (int) (Math.random() * all.size());
			if(used.contains(rand)) {
				continue;
			}
			if(all.get(rand).isDifficult()) {
				continue;
			}
			used.add(rand);
			res.add(all.get(rand));
			
		}
		return res;
	}
	public static ArrayList<Anime> getMedium(int n) throws IOException {
		ArrayList<Anime> all = getAnimeList();
		ArrayList<Anime> res = new ArrayList<Anime>();
		ArrayList<Integer> used = new ArrayList<Integer>();
		while(res.size() != n) {
			int rand = (int) (Math.random() * all.size());
			if(used.contains(rand)) {
				continue;
			}
			used.add(rand);
			res.add(all.get(rand));
			
		}
		return res;
	}
	public static ArrayList<Anime> getHard(int n) throws IOException {
		ArrayList<Anime> all = getAnimeList();
		ArrayList<Anime> res = new ArrayList<Anime>();
		ArrayList<Integer> used = new ArrayList<Integer>();
		while(res.size() != n) {
			int rand = (int) (Math.random() * all.size());
			if(used.contains(rand)) {
				continue;
			}
			if(!all.get(rand).isDifficult()) {
				continue;
			}
			used.add(rand);
			res.add(all.get(rand));
			
		}
		return res;
	}
	public static ArrayList<Anime> getExtreme(int n) throws IOException {
		ArrayList<Anime> all = getAnimeList();
		ArrayList<Anime> res = new ArrayList<Anime>();
		ArrayList<Integer> used = new ArrayList<Integer>();
		while(res.size() != n) {
			int rand = (int) (Math.random() * all.size());
			if(used.contains(rand)) {
				continue;
			}
			if(!all.get(rand).isDifficult()) {
				continue;
			}
			used.add(rand);
			all.get(rand).setUrl(all.get(rand).getUrl() + "?t=" + ((int)(Math.random() * 60)));
			res.add(all.get(rand));
			
			
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		ArrayList<Anime> res = getAnimeList();
		for(Anime a: res) {
			System.out.println("Title: " + a.getTitle() + "\n" + "URL: " + a.getUrl() + "\n" + "Diff: ");
		}
	}
}
