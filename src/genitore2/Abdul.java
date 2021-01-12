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
public class Abdul {
    public boolean kebab;
    
    public synchronized boolean sfornakebab(){
        kebab = false;
        prepara();
        return kebab;
    }
    
    public void prepara(){
        try {
            Thread.sleep(3000);
            kebab = true;
        }catch(InterruptedException ex){}
    }
    
}
