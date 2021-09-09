public class PillowTestDriver {
    public static void main(String[] args) {
        PillowStore store = new NYPillowStore();

        Pillow pillow = store.orderPillow("back", "cotton", "white");
        System.out.println(pillow + " ready.\n");

        pillow = store.orderPillow("back", "cotton", "multicolor");
        System.out.println(pillow + " ready.\n");

        pillow = store.orderPillow("back", "polyester", "white");
        System.out.println(pillow + " ready.\n");

        pillow = store.orderPillow("side", "polyester", "multicolor");
        System.out.println(pillow + " ready.\n");

        pillow = store.orderPillow("stomach", "cotton", "white");
        System.out.println(pillow + " ready.\n");
    }
}
