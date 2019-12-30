package music;

public class Anime {
	private String title;
	private String url;
	private String name;
	private String author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private boolean difficult;
	public Anime() {
		this.url = url;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isDifficult() {
		return difficult;
	}
	public void setDifficult(boolean difficulty) {
		this.difficult = difficulty;
	}
}
