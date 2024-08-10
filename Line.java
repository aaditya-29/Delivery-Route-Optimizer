import java.awt.*;

public class Line {
    private Point startPoint;
    private Point endPoint;
    Color color;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        Color c = Color.decode("#0099cc");
        this.color = c;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }
}
