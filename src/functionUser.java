import java.util.List;

public class functionUser {
	functionComment functionComment = new functionComment();

	public List<User> createUser(List<User> users) {
		users.add(new User(users.size() + 1, functionComment.getComments(users.size() + 1)));
		return users;
	}
}
