import java.time.LocalDate;
import java.util.Objects;

public class ValidationClass {
    private String name;
    private String name2;

    public ValidationClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void checkCorrect() {
        System.out.println(name.equals(name2));
    }

    public void created() {
        System.out.println(LocalDate.now() + " " + getClass() + " created");
    }

    public void destroyed() {
        System.out.println(LocalDate.now() + " " + getClass() + " destroyed");
    }

}
