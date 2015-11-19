package pojo_project;

public class Print {
    private Figure figure;

    public Print(Figure figure) {
        this.figure = figure;
    }

    public void showSquare() {
        System.out.println("Square " + figure.getName() + " = " + figure.square());
    }
}
