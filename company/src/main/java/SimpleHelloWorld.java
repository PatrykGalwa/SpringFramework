import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleHelloWorld {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("first object");
        obj.getMessage();

        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        obj2.getMessage();
        context.close();
    }
}