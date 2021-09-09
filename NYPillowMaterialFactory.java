public class NYPillowMaterialFactory implements PillowMaterialFactory {
    private String stuffing;
    private String cover;

    public NYPillowMaterialFactory(String stuffing, String cover) {
        this.stuffing = stuffing;
        this.cover = cover;
    }

    public Stuffing getStuffing() {
        Stuffing stuff = null;

        if (stuffing.equals("cotton")) {
            stuff = new Cotton();
        } else if (stuffing.equals("polyester")) {
            stuff = new Polyester();
        }

        return stuff;
    }

    public Cover getCover() {
        Cover pillowCover = null;

        if (cover.equals("multicolor")) {
            pillowCover = new MultiColor();
        } else if (cover.equals("white")) {
            pillowCover = new White();
        }

        return pillowCover;
    }
}
