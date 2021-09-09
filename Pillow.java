public abstract class Pillow {
    private PillowMaterialFactory pillowMaterialFactory;
    private String name;
    private Stuffing stuffing;
    private Cover cover;

    public Pillow(PillowMaterialFactory pillowMaterialFactory, String name) {
        this.pillowMaterialFactory = pillowMaterialFactory;
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        stuffing = pillowMaterialFactory.getStuffing();
        cover = pillowMaterialFactory.getCover();
    }

    public void stuffMaterial() {
        System.out.println("Stuffing " + stuffing + " into pillow cover.");
    }

    public void stitchCover() {
        System.out.println("Stitching " + cover + " pillow cover.");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " with " + stuffing + " stuffing in " + cover + " pillow cover";
    }
}
