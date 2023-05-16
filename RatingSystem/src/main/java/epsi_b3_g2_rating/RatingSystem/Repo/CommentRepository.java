package epsi_b3_g2_rating.RatingSystem.Repo;

import epsi_b3_g2_rating.RatingSystem.Entity.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,Long> {

    Iterable<Comment> findAll(Sort id);
}
