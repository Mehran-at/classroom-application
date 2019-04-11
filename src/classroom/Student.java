package classroom;

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    void paint(Marker marker) {
        System.out.println(name + " paints");
        marker.paint();
    }
}
