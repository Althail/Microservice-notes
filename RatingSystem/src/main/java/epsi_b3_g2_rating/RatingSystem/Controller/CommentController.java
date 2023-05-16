package epsi_b3_g2_rating.RatingSystem.Controller;

import epsi_b3_g2_rating.RatingSystem.Entity.Comment;
import epsi_b3_g2_rating.RatingSystem.Entity.Note;
import epsi_b3_g2_rating.RatingSystem.Repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/comments")
public class CommentController {
    @Autowired
    CommentRepository commentRepository;
    @RequestMapping(path="", method= RequestMethod.GET)
    public List<Comment> getAllComments() {
        return (List<Comment>) commentRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @RequestMapping(path="/{comment_id}", method= RequestMethod.GET)
    public Comment getComment(@PathVariable("comment_id") Long comment_id) {
        return commentRepository.findById(comment_id).orElse(null);
    }

    @RequestMapping(path="create", method= RequestMethod.POST)
    public Comment createComment(Comment comment){
        return commentRepository.save(comment);
    }

    @RequestMapping(path="update", method = RequestMethod.PUT)
    public Comment updateComment(Comment comment, Long comment_id){
        Comment existedComment = commentRepository.findById(comment_id).orElse(null);
        if (existedComment != null){
            existedComment.setComment(comment.getComment());
            return commentRepository.save(existedComment);
        }
        return null;
    }

    @RequestMapping(path="delete", method = RequestMethod.DELETE)
    public void deleteComment(Long comment_id){
        commentRepository.deleteById(comment_id);
    }

}
