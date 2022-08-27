import processing.core.PApplet;

public class TryProcessing extends PApplet{
    int x = 0;
    public static final int DIAMETER = 10;
    public static final int HEIGHT = 480;
    public static void main(String args[]){
        PApplet.main("TryProcessing",args);
        //PApplet.main("Try Processing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(640, HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(50, 50, 100, 100);
    }

    @Override
    public void draw() {
//        background(456);
        float first = (float) (HEIGHT/5.0);
        float second = first*2;
        float third = first*3;
        float fourth = first*4;
        ellipse(x, first, DIAMETER, DIAMETER);
        ellipse(x*2, second, DIAMETER, DIAMETER);
        ellipse(x*3, third, DIAMETER, DIAMETER);
        ellipse(x*4, fourth, DIAMETER, DIAMETER);
        x++;
        //System.out.println("Run from draw method.");
    }
}
