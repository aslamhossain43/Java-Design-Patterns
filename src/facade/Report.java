package facade;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Feb 6, 2022
 *
 */
public class Report {
	private Header header;
	private Body body;
	private Footer footer;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		System.out.println("Setting report header");
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		System.out.println("Setting report body");
		this.body = body;
	}

	public Footer getFooter() {
		return footer;
	}

	public void setFooter(Footer footer) {
		System.out.println("Setting report footer");
		this.footer = footer;
	}

}
