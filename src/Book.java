import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author authorTheFullName;
    private int yearOfPublication;

    // метод-конструктор
    public Book(String bookTitle, Author authorTheFullName, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.authorTheFullName = authorTheFullName;
        this.yearOfPublication = yearOfPublication;
    }
    // сеттеры и геттеры
    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthorTheFullName() {
        return authorTheFullName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    //// Метод toString() преобразовывает данные сложного объекта в одну строку
    @Override
    public String toString() {
        return  "Книга под названием " + bookTitle +
                ", автор " + authorTheFullName +
                ", издана в " + yearOfPublication + " году.";
    }
    // метод equals используется только совместо с hashCode и наоборот)  сравнение объектов через данный метод.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(authorTheFullName, book.authorTheFullName);
    }
    // метод hashCode Метод hashCode() в Java используется для получения уникального целочисленного значения, которое представляет объект. Это значение может быть использовано для оптимизации хэш-таблиц и других структур данных
    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, authorTheFullName, yearOfPublication);
    }
}