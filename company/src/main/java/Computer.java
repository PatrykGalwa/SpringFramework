import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Computer {
    private HardDrive hardDrive;
    private Ram ram;
    private GraphicCard graphicCard;
    private String aaaa;

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getAaaa() {
        return aaaa;
    }

    public void setAaaa(String aaaa) {
        this.aaaa = aaaa;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = (Computer) configurableApplicationContext.getBean("computer");
        System.out.println(computer.getHardDrive());
        System.out.println(computer.getRam());
        System.out.println(computer.getGraphicCard());
        System.out.println(computer.getAaaa());
        computer.setAaaa("kiki");
        System.out.println(computer.getAaaa());
    }
}
