package bootcamp.controller;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="books")
public class BookEntity {

    @Id
    Integer id;

    String name;

    public BookEntity(Integer id,
                      String name) {
        this.id = id;
        this.name = name;
    }

    public BookEntity() {
    }
}
