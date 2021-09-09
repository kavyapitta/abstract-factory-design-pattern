public class NYPillowStore extends PillowStore {

    protected Pillow createPillow(String type, String stuffing, String cover) {
        Pillow pillow = null;
        PillowMaterialFactory pillowMaterialFactory = new NYPillowMaterialFactory(stuffing, cover);

        if (type.equals("back")) {
            pillow = new BackPillow(pillowMaterialFactory, "Back Pillow");
        } else if (type.equals("side")) {
            pillow = new SidePillow(pillowMaterialFactory, "Side Pillow");
        } else if (type.equals("stomach")) {
            pillow = new StomachPillow(pillowMaterialFactory, "Stomach Pillow");
        }

        return pillow;
    }
}
