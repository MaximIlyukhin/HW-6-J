import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Laptop name1 = new Laptop("Dell", "Intel", 14, 8, "Windows 10");
        Laptop name2 = new Laptop("Dell", "Intel", 15.6, 16, "Windows 11");
        Laptop name3 = new Laptop("Dell", "AMD", 16, 32, null);
        Laptop name4 = new Laptop("Acer", "AMD", 14, 8, "Windows 11");
        Laptop name5 = new Laptop("Acer", "Intel", 15.6, 16, "Windows 10");
        Laptop name6 = new Laptop("Acer", "Intel", 16, 32, null);
        Laptop name7 = new Laptop("Asus", "Intel", 14, 8, null);
        Laptop name8 = new Laptop("Asus", "AMD", 15.6, 16, "Windows 10");
        Laptop name9 = new Laptop("Asus", "Intel", 16, 32, "Windows 11");
 
        Scanner sc = new Scanner(System.in);

        System.out.printf("Список брендов: \n1 - %s, \n2 - %s, \n3 - %s.\n",
                name1.getBrand(), name4.getBrand(), name7.getBrand());
        System.out.print("Введите номер бренда из списка: ");
        int numberBrand = sc.nextInt();
        filterBrand(numberBrand, name1, name2, name3, name4, name5, name6, name7, name8, name9);

        System.out.printf("\nВозможные варианты объема оперативной памяти: \n1 - %s, \n2 - %s, \n3 - %s.\n",
                name1.getAmountRAM(), name2.getAmountRAM(), name3.getAmountRAM());
        System.out.print("Введите номер объема оперативной памяти из списка: ");
        int numberAmountRAM = sc.nextInt();
        filterAmoutRAM(numberAmountRAM, name1, name2, name3, name4, name5, name6, name7, name8, name9);
                
        sc.close();
    }

    public static void filterBrand(int number, Laptop name1, Laptop name2, Laptop name3, Laptop name4, Laptop name5,
            Laptop name6, Laptop name7, Laptop name8, Laptop name9) {
        switch (number) {
            case 1:
                Laptop.printName(name1);
                Laptop.printName(name2);
                Laptop.printName(name3);
                break;
            case 2:
                Laptop.printName(name4);
                Laptop.printName(name5);
                Laptop.printName(name6);
                break;
            case 3:
                Laptop.printName(name7);
                Laptop.printName(name8);
                Laptop.printName(name9);
                break;
            default:
                System.out.println("Нет такого бренда");
        }
    }
    public static void filterAmoutRAM(int number, Laptop name1, Laptop name2, Laptop name3, Laptop name4, Laptop name5,
            Laptop name6, Laptop name7, Laptop name8, Laptop name9) {
        switch (number) {
            case 1:
                Laptop.printName(name1);
                Laptop.printName(name4);
                Laptop.printName(name7);
                break;
            case 2:
                Laptop.printName(name2);
                Laptop.printName(name5);
                Laptop.printName(name8);
                break;
            case 3:
                Laptop.printName(name3);
                Laptop.printName(name6);
                Laptop.printName(name9);
                break;
            default:
                System.out.println("Нет такого");
        }
    }

}
