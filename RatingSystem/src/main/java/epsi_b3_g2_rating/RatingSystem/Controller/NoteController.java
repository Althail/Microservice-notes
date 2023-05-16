package epsi_b3_g2_rating.RatingSystem.Controller;

import epsi_b3_g2_rating.RatingSystem.Entity.Comment;
import epsi_b3_g2_rating.RatingSystem.Entity.Note;
import epsi_b3_g2_rating.RatingSystem.Repo.CommentRepository;
import epsi_b3_g2_rating.RatingSystem.Repo.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/notes")
public class NoteController {

    @Autowired
    NoteRepository noteRepository;
    @RequestMapping(path="", method= RequestMethod.GET)
    public List<Note> getAllNotes() {
        return (List<Note>) noteRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @RequestMapping(path="/{note_id}", method= RequestMethod.GET)
    public Note getNote(@PathVariable("note_id") Long note_id) {
        return noteRepository.findById(note_id).orElse(null);
    }

    @RequestMapping(path="create", method= RequestMethod.POST)
    public Note createNote(Note note){
        return noteRepository.save(note);
    }

    @RequestMapping(path="update", method = RequestMethod.PUT)
    public Note updateNote(Note note, Long note_id){
        Note existedNote = noteRepository.findById(note_id).orElse(null);
        if (existedNote != null){
            existedNote.setNote(note.getNote());
            return noteRepository.save(existedNote);
        }
        return null;
    }

    @RequestMapping(path="delete", method = RequestMethod.DELETE)
    public void deleteNote(Long note_id){
        noteRepository.deleteById(note_id);
    }

}
