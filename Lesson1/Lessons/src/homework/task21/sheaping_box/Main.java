package homework.task21.sheaping_box;

public class Main {
    public static void main(String[] args) {

        Crate<String> carCrate = new Crate<>();
        carCrate.pack("Lada");
        System.out.println(carCrate.unpack());

        Crate<String> fruitCrate = new Crate<>();
        fruitCrate.pack("Orang");
        System.out.println(fruitCrate.unpack());

        Crate<Integer> numberCrate = new Crate<>();
        numberCrate.pack(123);
        System.out.println(numberCrate.unpack());
    }
}
