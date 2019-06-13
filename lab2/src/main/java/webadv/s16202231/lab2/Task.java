package webadv.s16202231.lab2;

public class Task {
	private int id;
	private String article;
	
	
	public Task(int id, String article) {
		super();
		this.id = id;
		this.article = article;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	
}
