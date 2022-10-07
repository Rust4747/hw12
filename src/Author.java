import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author that = (Author) obj;
        return  this.name.equals(that.name) && this.surname.equals(that.surname);

    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}