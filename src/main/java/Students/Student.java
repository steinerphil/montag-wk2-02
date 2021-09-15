package Students;

public abstract class Student {

   private String uniName = "MIT";

    public String getUniName() {
        return uniName;
    }

    public abstract String toString();
   public abstract String getName();
   public abstract int getId();
    public abstract double getNc();
}
