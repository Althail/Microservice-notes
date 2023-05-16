package epsi_b3_g2_rating.RatingSystem.Repo;

import epsi_b3_g2_rating.RatingSystem.Entity.Note;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note,Long> {
    Iterable<Note> findAll(Sort id);
}
