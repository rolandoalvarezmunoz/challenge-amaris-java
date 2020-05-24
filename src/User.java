import java.util.List;

public class User {
	private Integer id;
	private List<Comment> comments;
	
	public User() {
		
	}
	public User(Integer id, List<Comment> comments) {
		super();
		this.id = id;
		this.comments = comments;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
}
