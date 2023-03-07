import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Гайдар", "Аркадий");
        Book book1 = new Book("Чук и Гек", author1, 1939);
        Author author2 = new Author("Успенский", "Эдуард");
        Book book2 = new Book("Дядя Федор, пес и кот", author2, 1972);
        System.out.println("Название = " + book1.getBookName() + ". Автор= " + author1.getName() + " " + author1.getFamily() + ". Год издания=" + book1.getPublicYear());
        System.out.println("Название = " + book2.getBookName() + ". Автор= " + book2.getAuthor().getName() + " " + book2.getAuthor().getFamily() + ". Год издания=" + book2.getPublicYear());
        System.out.println( author1.toStringName());
        System.out.println( book1.toStingBook());



    }
}