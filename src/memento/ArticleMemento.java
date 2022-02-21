package memento;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public final class ArticleMemento {
	private Long id;
	private String title;
	private String content;

	public ArticleMemento(Long id, String title, String content) {
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

}
