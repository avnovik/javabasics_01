public class Methods {

    public static void whoIsMoreExpensive(String nameA, String nameB, int priceA, int priceB) {
        if (priceA > priceB) System.out.println(nameA + " подороже будет чем " + nameB);
        else if (priceA < priceB) System.out.println(nameB + " подороже будет чем " + nameA);
        else System.out.println("Очень странно, но они одинаковые.");

    }

    public static void whoIsHeavier(String nameA, String nameB, int weightA, int weightB) {
        if (weightA > weightB) System.out.println(nameA + " потяжелее будет чем " + nameB);
        else if (weightB > weightA) System.out.println(nameB + " потяжелее будет чем " + nameA);
        else System.out.println("Standoff");
    }
}
