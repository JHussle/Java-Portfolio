/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;
import animal.Dogs;

/**
 *
 * @author Joey
 */
public class Cats {
    Dogs cat;

    public Cats() {
        this.cat = new Dogs();
    }

    public Dogs getCat() {
        return cat;
    }

    public void setCat(Dogs cat) {
        this.cat = cat;
    }
    
}
