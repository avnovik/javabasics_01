public class TheRealWorld {

    public static void main(String[] args) {

        Objects.Animals cat = new Objects.Animals();
        cat.type = "Tiger";
        cat.price = 10000;
        cat.weight = 150;

        Objects.Machines car = new Objects.Machines();
        car.type = "Zaporozec";
        car.price = 500;
        car.weight = 300;

        Methods.whoIsMoreExpensive(cat.type, car.type, cat.price, car.price);
        Methods.whoIsHeavier(cat.type, car.type, cat.weight, car.weight);
    }
}
