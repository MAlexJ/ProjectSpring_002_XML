package pojo_project;

public class Rectangle extends Figure {
    private int width;
    private int heigth;

    public Rectangle(String name, int width, int heigth) {
        super(name);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double square() {
        return this.width * this.heigth;
    }
}
