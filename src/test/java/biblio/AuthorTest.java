package biblio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void AuthorCanCountBooks() {
        Author author = new Author();
        Book book = new Book("titol", author);
        assertEquals(1, author.countBooks());
    }
    @Test
    void authorCanAddABook () {
        var author = new Author();
        Book book = new Book("titol", author);

        assertEquals(1, author.countBooks());

    }
}