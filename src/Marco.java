import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco extends JFrame{

    private Lamina lamina;
    
    

    public Marco(){
        setBounds(600, 300, 400, 350);
        setTitle("Hilos");
        lamina = new Lamina();
        add(lamina, BorderLayout.CENTER);

        JPanel botones = new JPanel();
        
        crearBotones(botones, "GO!", new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                startGame();
            }
        });

        crearBotones(botones, "GO2!", new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                startGame2();
            }
        });

        crearBotones(botones, "OUT", new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                System.exit(0);
            }
        });

        add(botones, BorderLayout.SOUTH);

    }

    public void crearBotones(JPanel c, String titulo, ActionListener listener ){
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(listener);
    }

    public void startGame(){
        Ball ball = new Ball();
        lamina.add(ball);

        Runnable run = new Hilos(ball, lamina);

        Thread hilo = new Thread(run);
        hilo.setPriority(8);
        hilo.start();
        
    }


    public void startGame2(){
        
        Ball ball = new Ball();
        lamina.addRect(ball);

        Runnable run = new Hilos(ball, lamina);

        Thread ps = new Thread(run);
        ps.setPriority(5);
        ps.start();
        
    }
    
}
