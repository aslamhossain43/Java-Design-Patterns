package memento;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class Article {
	private Long id;
	private String title;
	private String content;

	public Article(Long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArticleMemento createArticleMemento() {
		ArticleMemento articleMemento = new ArticleMemento(id, title, content);
		return articleMemento;
	}

	public void restore(ArticleMemento articleMemento) {
		this.id = articleMemento.getId();
		this.title = articleMemento.getTitle();
		this.content = articleMemento.getContent();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
}
