package it.ifoa.progettoblog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import it.ifoa.progettoblog.Repositories.AuthorRepository;
import it.ifoa.progettoblog.models.Author;
import static org.assertj.core.api.Assertions.*;

// @SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class ProgettoblogApplicationTests {
	@Autowired
	 AuthorRepository authorRepository;

	@BeforeEach
	//prima di lanciare qualsiasi test, fai partire questa funzione sotto
	void load() {
		Author a1 = new Author();
		a1.setFirstName("Mario");
		a1.setLastName("Rossi");
		a1.setEmail("miofna@gmail.com");
		authorRepository.save(a1);
	}

	@Test
	void findByNameTest() {
		assertThat(authorRepository.findByFirstName("Mario")).extracting("firstName").containsOnly("Mario");
	}

	@Test
	void findByLastNameTest() {
		assertThat(authorRepository.findByLastName("Rossi")).extracting("lastName").containsOnly("Rossi");
	}

}
