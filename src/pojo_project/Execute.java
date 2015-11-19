package pojo_project;

public class Execute {
    public static void main(String[] args) {
        Print print = new Print(new Circle("circle", 2));
        print.showSquare();
    }
}
