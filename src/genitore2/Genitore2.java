
package genitore2;

public class Genitore2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //si sviluppi un applicativo ove dichiarato un array di 20 istanze di thread che tentino di accedere simultaneamente a una risorsa kebab condivisa, 
        //il kebabbaro potrà soddisfare solo una richiesta per volta ogni 3 secondi
        //visualizzare a schermo in che ordine vengono soddisfatti i 20 clienti
        
        Thread t[] = new Thread[20];
        Abdul Kebabbaro = new Abdul();
        
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new tizio(Kebabbaro,i));
        }
        for (int i = 0; i < 20; i++) {
            t[i].start();
        }
        
    }
    
}
