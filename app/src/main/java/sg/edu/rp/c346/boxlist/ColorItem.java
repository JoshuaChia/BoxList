package sg.edu.rp.c346.boxlist;



public class ColorItem {
    private String color;

    public ColorItem(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorItem{" +
                "color='" + color + '\'' +
                '}';
    }
}
