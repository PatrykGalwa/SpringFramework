import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleIntegerClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IntegerClass integerClass = (IntegerClass) context.getBean("integerClass");
        integerClass.sumIntegers();
        integerClass.setInteger2(3);
        integerClass.sumIntegers();
        integerClass.setInteger(20);
        integerClass.sumIntegers();

        IntegerClass integerClass1 = (IntegerClass) context.getBean("integerClass");
        integerClass1.sumIntegers();
        context.close();
    }
}
