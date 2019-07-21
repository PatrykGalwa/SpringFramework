import java.time.LocalDate;

public class HelloWorld {

    private String message;
    private String message2;

    public HelloWorld() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        System.out.println("Your Message2 : " + message2);
    }

    public void created() {
        System.out.println(LocalDate.now() + " " + getClass() + " created");
    }

    public void destroyed() {
        System.out.println(LocalDate.now() + " " + getClass() + " destroyed");
    }
}