import java.awt.geom.*;





public class Ball {
    private double x=0;
    private double y=0;
    private double dx=1;
    private double dy=1;
    private static final int LONX = 15;
    private static final int LONY = 15;
    
    
    public void moveBall(Rectangle2D rectangle2D){
        x+=dx;
        y+=dy;

        if(x<rectangle2D.getMinX()){
            x=rectangle2D.getMinX();
            dx=-dx;
        }

        if(LONX + x >= rectangle2D.getMaxX()){
            x=rectangle2D.getMaxX() - LONX;
            dx = -dx;    
        }

        if(y<rectangle2D.getMinY()){
            y = rectangle2D.getMinY();
            dy = -dy;
        }

        if(LONY + y >= rectangle2D.getMaxY()){
            x=rectangle2D.getMaxY() - LONY;
            dy = - dy;
        }

    }

    public Ellipse2D crearBall(){
        return new Ellipse2D.Double(x,y,LONX,LONY);
    }

    public Rectangle2D crearRectangle(){
        return new Rectangle2D.Double(x,y,LONX,LONY);
    }

}
