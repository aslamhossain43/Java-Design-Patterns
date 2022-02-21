package memento;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 21, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		// Original
		Article article = new Article(1L, "Java", "OOP");
		System.out.println(article);

		// Create immutable memento
		ArticleMemento articleMemento = article.createArticleMemento();

		// Changed
		article.setId(2L);
		article.setTitle("JavaScript");
		article.setContent("Script");
		System.out.println(article);

		// Undo
		article.restore(articleMemento);
		System.out.println(article);

	}

}
