package it.ifoa.progettoblog.models;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="authors")
public class Author {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname", nullable = true)
    private String firstName;
    @Column(name = "lastname", nullable = true)
    private String lastName;
    @Column(name = "email", nullable = true, unique = true)
    private String email;   

    @OneToMany(mappedBy = "author")
    private List<Post> posts = new ArrayList<Post>();

    public Author() {
    }

    public String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
