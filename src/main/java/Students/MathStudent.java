package Students;

public class MathStudent extends Students {
    private String name;
    private int id;

    public MathStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "[ " + name +
                "; id=" + id +
                " ]";
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
        return 1.1;
    }
}
