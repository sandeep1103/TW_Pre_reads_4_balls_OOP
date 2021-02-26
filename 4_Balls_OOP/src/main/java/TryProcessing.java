import processing.core.PApplet;

public class TryProcessing extends  PApplet{


    public static final int WINDOW_HEIGHT = 480;
    public static final int WINDOW_WIDTH = 620;
    public static final int BALL_DIAMETER = 15;
    public  static final float delX = 1f;

    public float x1 = 0, x2 = 0, x3 = 0, x4 = 0;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawBalls();
        changeXCoordinateOfBalls();
    }

    private void changeXCoordinateOfBalls() {

        x1 += delX;
        x2 += 2 * delX;
        x3 += 3 * delX;
        x4 += 4 * delX;
    }

    private void drawBalls() {

        ellipse(x1, WINDOW_HEIGHT / 5, BALL_DIAMETER, BALL_DIAMETER);
        ellipse(x2, 2 * WINDOW_HEIGHT / 5, BALL_DIAMETER, BALL_DIAMETER);
        ellipse(x3, 3 * WINDOW_HEIGHT / 5, BALL_DIAMETER, BALL_DIAMETER);
        ellipse(x4, 4 * WINDOW_HEIGHT / 5, BALL_DIAMETER, BALL_DIAMETER);
    }
}
