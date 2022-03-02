package model;

public class ColorProduct {
    private int colorId;
    private String colorName;

    public ColorProduct(int colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }

    public ColorProduct() {
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
