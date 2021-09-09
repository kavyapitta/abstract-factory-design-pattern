public abstract class PillowStore {

    protected abstract Pillow createPillow(String type, String stuffing, String cover);

    public Pillow orderPillow(String type, String stuffing, String cover) {
        Pillow pillow = createPillow(type, stuffing, cover);
        System.out.println("---- Making a " + pillow.getName() + " ----");
        pillow.prepare();
        pillow.stuffMaterial();
        pillow.stitchCover();
        return pillow;
    }
}