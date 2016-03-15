package dbstructure;

import java.util.Iterator;

public interface Travel {
    // public double getQuota(); questo è meglio non qua.
    public int getDistance();
    public int getPeriod();
    public Iterator<String> getTour(); 
    /*
     * Aggiungere visitor per modalità di ritorno stringa?
     * oppure basta un iterator di ritorno?++
     * 
     */
    public Travel addStage(Travel stage);
}
