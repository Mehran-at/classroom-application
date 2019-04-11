package classroom;

class Marker {
    private String color;

    Marker(String color) {
        this.color = color;
    }

    String paint() {
        System.out.println("Marker paints in color " + color);
        return color;
    }
}
