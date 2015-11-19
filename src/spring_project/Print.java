package spring_project;

public class Print {

    private Figure figure;

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void showSquare() {
        System.out.println("Square " + figure.getName() + " = " + figure.square());
    }

    public void showPerimeter() {
        System.out.println("Perimeter " + figure.getName() + " = " + figure.perimeter());
    }
}
