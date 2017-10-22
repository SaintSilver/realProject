package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class Clock implements Runnable {
    private Thread thread;
    private SimpleDateFormat sf;
    private JLabel label;
    
    public Clock(JLabel label) {
    	this.label = label;
        sf = new SimpleDateFormat("yyyy≥‚MMø˘dd¿œ a hh:mm:ss");
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public static void main(String[] args){
    	
    }

    public void run() {
        while (true) {
           String time = sf.format(new Date());
           label.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        }
        
    }
}

