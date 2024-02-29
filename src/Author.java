import java.util.Objects;

public class Author {
    private String name;
    private String middleName;
    private String familyName;

    //метод-конструктор для объекта Author
    public Author(String name, String middleName, String familyName){
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }
    // Метод toString() преобразовывает данные сложного объекта в одну строку
    @Override
    public String toString() {
        return name + " " + middleName + " " + familyName;
    }
    // веренем в метод main() значения параметров
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getFamilyName() {
        return familyName;
    }
    //сгенерировала методы equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(middleName, author.middleName) && Objects.equals(familyName, author.familyName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, familyName);
    }
}