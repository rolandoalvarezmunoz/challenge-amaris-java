import java.util.ArrayList;
import java.util.List;

public class functionComment {
	
 public List<Comment> getComments (Integer id){
	 
	 List <Comment> comments = new ArrayList <Comment>();
	 comments.add(new Comment(comments.size()+1, id, "comentario " + comments.size()+1));
	 comments.add(new Comment(comments.size()+1, id, "comentario " + comments.size()+1));
	 comments.add(new Comment(comments.size()+1, id, "comentario " + comments.size()+1));
	 comments.add(new Comment(comments.size()+1, id, "comentario " + comments.size()+1));
	 comments.add(new Comment(comments.size()+1, id, "comentario " + comments.size()+1));
	 return comments;
	 }
 
 
 
}
