package classroom;


public class ClassroomApplication {
    public static void main(String[] args) {
        Student student = new Student("Jason");
        Marker black_marker = new Marker("Black marker");
        student.paint(black_marker);

        Student student1 = new Student("Alexa");
        Marker green_marker = new Marker("Green marker");
        student1.paint(green_marker);
    }
}
