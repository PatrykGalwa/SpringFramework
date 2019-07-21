import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleValidationClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ValidationClass validationClass = (ValidationClass) context.getBean("validationClass");
        validationClass.checkCorrect();

        ValidationClass validationClass1 = (ValidationClass) context.getBean("validationClass");
        validationClass1.setName("naan");
        validationClass1.setName2("naan");
        validationClass1.checkCorrect();
        context.close();
    }
}