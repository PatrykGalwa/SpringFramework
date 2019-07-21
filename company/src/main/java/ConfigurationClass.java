import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {

    @Bean
    public BeanTemplate beanTemplate() {
        return new BeanTemplate();
    }

    @Bean
    @Scope("singleton")
    public Computer computer() {
        return new Computer();
    }

    @Bean(value = "4")
    @Scope("singleton")
    public GraphicCard graphicCard() {
        return new GraphicCard();
    }

    @Bean
    @Scope("singleton")
    public BeanForTemplate beanForTemplate() {
        return new BeanForTemplate();
    }

    @Bean(value = "4")
    @Scope("singleton")
    public HardDrive hardDrive() {
        return new HardDrive();
    }

    @Bean
    @Scope("singleton")
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    @Scope("singleton")
    public IntegerClass integerClass() {
        return new IntegerClass();
    }

    @Bean
    @Scope("singleton")
    public Ram ram() {
        return new Ram();
    }

    @Bean
    @Scope("singleton")
    public ValidationClass validationClass() {
        return new ValidationClass();
    }

    @Bean
    public CRefreshEventHandler cRefreshEventHandler() {
        return new CRefreshEventHandler();
    }

    @Bean
    public CustomEventHandler customEventHandler() {
        return new CustomEventHandler();
    }

    @Bean
    public CustomEventPublisher customEventPublisher() {
        return new CustomEventPublisher();
    }

    @Bean
    public CStartEventHandler cStartEventHandler() {
        return new CStartEventHandler();
    }

    @Bean
    public CStopEventHandler cStopEventHandler() {
        return new CStopEventHandler();
    }
}
