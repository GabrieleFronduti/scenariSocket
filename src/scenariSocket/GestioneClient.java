/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenariSocket;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriele Fronduti
 */
public class GestioneClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try {
        Client cli = new Client(2000, InetAddress.getLocalHost());
        String messaggioletto = cli.leggi();
        System.out.println(messaggioletto);
        } catch (UnknownHostException ex) {
            System.out.println("Impossibile trovare local host");
            Logger.getLogger(GestioneClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}


    
    

