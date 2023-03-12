
public class Laptop {
    private String brand;
    private String processor;
    private double screenDiagonal;
    private int amountRAM;
    private String operatingSystem;

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public Laptop(String brand, String processor, double screenDiagonal, int amountRAM, String operatingSystem) {
        this.brand = brand;
        this.processor = processor;
        this.screenDiagonal = screenDiagonal;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
    }

    public static void printName(Laptop name) {
        System.out.printf(
                "\nБренд - %s,\nПроцессор - %s,\nДиагональ экрана - %.1f,\nОбъем оперативной памяти - %d,\nОперационная система - %s\n",
                name.getBrand(), name.getProcessor(), name.getScreenDiagonal(), name.getAmountRAM(),
                name.getOperatingSystem());
    }
}