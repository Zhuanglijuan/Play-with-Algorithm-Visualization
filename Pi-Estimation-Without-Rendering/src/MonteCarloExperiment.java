import java.awt.*;

/**
 * Created by Zhuang on 2018/4/13.
 */
public class MonteCarloExperiment {
    private int squareSide;
    private int N;
    private int outputInterval = 100;//输出频率

    public MonteCarloExperiment(int squareSide, int N) {
        if (squareSide <= 0 || N <= 0)
            throw new IllegalArgumentException("squareSide and N must larger than zero");
        this.squareSide = squareSide;
        this.N = N;
    }

    public void setOutputInterval(int interval){
        if (interval <= 0)
            throw new IllegalArgumentException("interval must be larger than zero");
        this.outputInterval = interval;
    }

    public void run() {
        Circle circle = new Circle(squareSide / 2, squareSide / 2,squareSide / 2 );
        MonteCarloPIData data = new MonteCarloPIData(circle);
        for(int i = 0; i< N ; i++){
            if( i % outputInterval == 0){
                System.out.println(data.estimatePi());
            }
            int x = (int)(Math.random() * squareSide);
            int y = (int)(Math.random() * squareSide);
            data.addPoint(new Point(x,y));
        }
    }

    public static void main(String[] args) {
        int squareSide = 800;
        int N = 1000000;

        MonteCarloExperiment exp = new MonteCarloExperiment(squareSide,N);
        exp.setOutputInterval(10000);
        exp.run();
    }
}
