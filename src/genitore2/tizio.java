/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genitore2;

/**
 *
 * @author galimberti.riccardoe
 */
public class tizio implements Runnable{
    
    private boolean soddisfatto = false;
    private boolean stop = false;
    private Abdul ab = new Abdul();
    private int numero;

    public tizio(Abdul k, int numero) {
        this.numero = numero;
        this.ab = k;
    }
    
    @Override
    public void run() {
        while(!stop){
            while(!soddisfatto){
                soddisfatto = ab.sfornakebab();
                if (soddisfatto){
                    System.out.println("Thread soddisfatto : " + numero);
                    notifyAll();
                }else{
                    try {
                        wait();
                    } catch (InterruptedException ex) {}
                }
            }
        }
    }
    
    public void termina(){
        stop = true;
    }
    
}
