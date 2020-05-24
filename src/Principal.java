import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		functionUser functionUser = new functionUser();
		List<User> users = new ArrayList<User>();
		functionUser.createUser(users);
		System.out.println(users.get(0).getComments().get(0).getText());
	}

}
