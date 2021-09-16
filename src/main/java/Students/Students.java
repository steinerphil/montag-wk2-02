package Students;

public abstract class Students {

   private String uniName = "MIT";
    public String getUniName() {
        return uniName;
    }

    public abstract String toString();
   public abstract String getName();
   public abstract int getId();
    public abstract double getNc();
}
