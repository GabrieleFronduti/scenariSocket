/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenariSocket;

/**
 *
 * @author Gabriele Fronduti
 */
public class GestioneServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Server srv = new Server(2000);
        srv.inAscolto();
        srv.scrivi("Ciao Client");
    }
}

    
    

