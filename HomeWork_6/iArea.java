

// 3) Переписать код в соответствии с Interface Segregation Principle:

// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().
public interface iArea {
    double area();
}

interface iVolume {
    double volume();
}

class Cube implements iArea, iVolume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    public double volume() {
        return edge * edge * edge;
    }
}

class Circle implements iArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}