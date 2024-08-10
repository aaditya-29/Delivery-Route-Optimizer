import java.awt.*;

public class Circle {
    private Point center;
    private int radius;
    Color color;

    public Circle(Point center) {
        this.center = center;
        this.radius = 10;
        Color c = Color.decode("#0099cc");
        this.color = c;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        int diameter = radius * 2;
        g.fillOval(center.x - radius, center.y - radius, diameter, diameter);
    }
    public Point getPoint(){
        return center;
    }
}