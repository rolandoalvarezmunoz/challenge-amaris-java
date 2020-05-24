import java.util.List;

public class User {
	private Integer id;
	private List<Comment> comments;

	public User(Integer id, List<Comment> comments) {
		this.id = id;
		this.comments = comments;
	}

	public List<Comment> getComments() {
		return this.comments;
	}
}
