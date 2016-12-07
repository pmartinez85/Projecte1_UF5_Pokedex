package entitats;
/**
 *
 * @author Pedro Martínez Segura
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Pokemon implements Serializable{

    private String _1nom;
    private int _2pes;
    private String _3tipus;
    private String _4mailEntre;
    private ArrayList<Moviment> _5atacs = new ArrayList<>();
    

    public Pokemon(String _1nom, int _2pes, String _3tipus, String _4mailEntre) {
        this._1nom = _1nom;
        this._2pes = _2pes;
        this._3tipus = _3tipus;
        this._4mailEntre = _4mailEntre;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "_1nom=" + _1nom + ", _2pes=" + _2pes + ", _3tipus=" + _3tipus + ", _4mailEntre=" + _4mailEntre + '}';
    }

    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }

    public int get2pes() {
        return _2pes;
    }

    public void set2pes(int _2pes) {
        this._2pes = _2pes;
    }

    public String get3tipus() {
        return _3tipus;
    }

    public void set3tipus(String _3tipus) {
        this._3tipus = _3tipus;
    }

    public String get4mailEntre() {
        return _4mailEntre;
    }

    public void set4mailEntre(String _4mailEntre) {
        this._4mailEntre = _4mailEntre;
    }
    
    public ArrayList<Moviment> get5atacs() {
        return _5atacs;
    }

    public void set5atacs(ArrayList<Moviment> _5atacs) {
        this._5atacs = _5atacs;
    }
    
}
