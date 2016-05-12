/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimalui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import minimalui.contentPages.Departure;
import minimalui.mainFrame.Window;

/**
 *
 * @author Fau
 */
public class MinimalUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Window mainFrame = new Window();
        mainFrame.setVisible(true);
            DepartureRow travel = createTravel("Firenze - Roma. Alla scoperta della capitale con un dito in culo."),
            travel2 = createTravel("FANCULOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"),
            travel3 = createTravel("CHE PALLEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"),
            travel4 = createTravel("OIOIOIAAAAAAAAAAAAAAAAAAAAAAA lol"),
            travel5 = createTravel("non ho piu banane"),
            travel6 = createTravel("Da firenze a bananatown"),
            travel7 = createTravel("Bindi merda!");
            Departure departurePage = mainFrame.getPage();
            departurePage.addRow(travel);
            departurePage.addRow(travel2);
            departurePage.addRow(travel3);
            departurePage.addRow(travel4);
    }
    
    private static DepartureRow createTravel(String info){
        Calendar date = new GregorianCalendar(2016,02,28);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");	
        
        DepartureRow travel = new DepartureRow();
        travel.setDateFrom(sdf.format(date.getTime()));
        date = new GregorianCalendar(2016,03,07);
        travel.setDateTo(sdf.format(date.getTime()));
        travel.setInfoProduct(info);
        travel.setFreePlace("25/120");
        return travel;
    }
}
