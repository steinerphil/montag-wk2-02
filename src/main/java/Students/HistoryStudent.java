package Students;

public class HistoryStudent implements Student{
    private String name;
    private final int id;

    public HistoryStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "[name='" + name + '\'' +
                "; id=" + id +
                "]";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public double getNc() {
        return 2.1;
    }
}
