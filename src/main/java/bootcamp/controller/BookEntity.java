package bootcamp.controller;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {

    @Id
    Integer bookId;

    String name;

    public BookEntity(Integer bookId,
                      String name) {
        this.bookId = bookId;
        this.name = name;
    }

    public BookEntity() {
    }
}
