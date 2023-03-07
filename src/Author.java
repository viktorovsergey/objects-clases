import java.util.Objects;

public class Author {
    private String family;
    private String name;

    public Author(String family, String name) {
        this.family = family;
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public String toStringName() {
        return "Фамилия " + family + " Имя " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(family, author.family) && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name);
    }
}
