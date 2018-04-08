import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Zhuang on 2018/4/8.
 */
public class AlgoVisHelper {
    //工具类不允许实例化
    private AlgoVisHelper() {
    }


    public static void setStrokeWidth(Graphics2D g2d, int w) {
        int strokeWidth = w;
        g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
    }

    public static void setColor(Graphics2D g2d, Color color) {
        g2d.setColor(color);
    }

    public static void strokeCircle(Graphics2D g2d, int x, int y, int r) {
        Ellipse2D circle = new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);
        g2d.draw(circle);
    }

    public static void fillCircle(Graphics2D g2d, int x, int y, int r) {
        Ellipse2D circle = new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);
        g2d.fill(circle);
    }

    public static void pause(int t) {
        try{
            Thread.sleep(t);
        }catch (InterruptedException e){
            System.out.println("Error in sleeping");
        }
    }
}
