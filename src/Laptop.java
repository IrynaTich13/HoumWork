import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Laptop {
    String name;
    String colour;
    int ram;
    int hdd;

    public static void main(String[] args) {
        System.out.println(baseLaptop());
    }


    public Laptop(String name, String colour, int ram, int hdd) {
        this.name = name;
        this.colour = colour;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String toString() {
        return "model = " +
                name + " colour = " +
                colour + " ram = " +
                ram + " hdd = " + hdd;
    }

    public boolean equals(Object laptop) {
        return this.name.equals(name)
                &&
                this.colour.equals(colour)
                &&
                this.ram == ram && this.hdd == hdd;
    }

    public int hashCode() {
        return (int) (this.name.hashCode() + this.colour.hashCode() + this.ram + this.hdd);
    }

    public static Set<Laptop> baseLaptop() {
        Laptop laptop1 = new Laptop("Lenovo", "Black", 8, 250);
        Laptop laptop2 = new Laptop("Hp", "Black", 8, 250);
        Laptop laptop3 = new Laptop("Sony", "Black", 16, 250);
        Laptop laptop4 = new Laptop("Lenovo", "Black", 16, 350);
        Laptop laptop5 = new Laptop("Lenovo", "Black", 8, 250);
        Laptop laptop6 = new Laptop("Lenovo", "Black", 8, 500);

        Set<Laptop> base = new HashSet<>(List.of(laptop4, laptop1, laptop2, laptop3, laptop5, laptop6));
        return base;
    }




}