
public class Comment {
	private Integer userId;
	private Integer id;
	private String text;

	public Comment(Integer userId, Integer id, String text) {
		super();
		this.userId = userId;
		this.id = id;
		this.text = text;
	}

	public Comment() {

	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
