import processing.core.PApplet;

public class TryProcessing extends PApplet{
    int x = 0, y = 0;
    public static final int DIAMETER = 10;
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static void main(String args[]){
        PApplet.main("TryProcessing",args);
        //PApplet.main("Try Processing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(50, 50, 100, 100);
    }

    @Override
    public void draw() {
        draw_N_cricles(4);
//        background(456);
//        System.out.println("Run from draw method.");
    }
    public void draw_N_cricles(int n){
        float first = (float) (HEIGHT/(n+1))+y;
        for(int i = 1; i <= n; i++){
            ellipse(x*i, first*i, DIAMETER, DIAMETER);
        }
        x++;
        x = x%640;
        //System.out.println(x);
       // if(x==0)
         //   y+=5;

    }
}
