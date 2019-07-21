import java.time.LocalDate;

public class IntegerClass {

    private Integer integer;
    private Integer integer2;

    public IntegerClass() {
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Integer getInteger2() {
        return integer2;
    }

    public void setInteger2(Integer integer2) {
        this.integer2 = integer2;
    }

    public void sumIntegers() {
        System.out.println(integer + integer2);
    }

    public void created() {
        System.out.println(LocalDate.now() + " " + getClass() + " created");
    }

    public void destroyed() {
        System.out.println(LocalDate.now() + " " + getClass() + " destroyed");
    }
}
