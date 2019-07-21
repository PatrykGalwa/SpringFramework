import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleBeanTemplate {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanForTemplate beanForTemplate = (BeanForTemplate)configurableApplicationContext.getBean("beanForTemplate");
        System.out.println(beanForTemplate.getMessage3());
    }
}
