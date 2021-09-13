package Students;

public class Student {

    private String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "[name='" + name + '\'' +
                "; id=" + id +
                "]";
    }
}
