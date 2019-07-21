import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsClass {
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<Integer, String> stringMap;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<Integer, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<Integer, String> stringMap) {
        this.stringMap = stringMap;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        context.start();
        Computer computer = context.getBean(Computer.class);
        computer.setRam(context.getBean(Ram.class));
        System.out.println(computer.getRam());
        CustomEventPublisher customEventPublisher = context.getBean(CustomEventPublisher.class);
        customEventPublisher.publish();
        context.stop();
    }
}
