public class HardDrive {
    private String type;

    public HardDrive() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "type='" + type + '\'' +
                '}';
    }
}
