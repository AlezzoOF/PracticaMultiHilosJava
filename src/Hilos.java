public class Hilos implements Runnable{
    private Ball ball;
    private Lamina component;
    public Hilos(Ball oneBall, Lamina oneComponent) {
        ball = oneBall;
        component = oneComponent;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for(int i=0; i<3000; i++){
            ball.moveBall(component.getBounds());
            component.paint(component.getGraphics());
            try{
                Thread.sleep(4); 
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
        
    }
    
}
