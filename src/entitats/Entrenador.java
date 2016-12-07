package entitats;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author Pedro Martínez Segura
 */
public class Entrenador implements Serializable, Comparable{
    
    private String _1nom;
    private String _2ciutat;
    private int _3edat;
    private int _4medalla;
    
    
    
    static final Comparator<Entrenador> CAL_ORDER =
            (Entrenador e1, Entrenador e2) -> (e1.get4medalla() < e2.get4medalla() ? -1 :
                    (e1.get4medalla() == e2.get4medalla() ? 0 : 1));
    
    
    static final Comparator<Entrenador> TYPE_ORDER =
            (Entrenador e1, Entrenador e2) -> e1.get2ciutat().compareTo(e2.get2ciutat());
    
    
    public Entrenador(String nom, String ciutat, int edat, int medalla) {
     
        this._1nom = nom;
        this._2ciutat = ciutat;
        this._3edat = edat;
        this._4medalla = medalla;
        
    }
    
    @Override
    public int compareTo(Object o) {
        Entrenador e = (Entrenador)o;
        return _1nom.compareTo(e.get1nom());
    }

    @Override
    public String toString() {
        return "Entrenador{" + "_1nom=" + _1nom + ", _2ciutat=" + _2ciutat + ", _3edat=" + _3edat + ", _4medalla=" + _4medalla + '}';
    }

    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }

    public String get2ciutat() {
        return _2ciutat;
    }

    public void set2ciutat(String _2ciutat) {
        this._2ciutat = _2ciutat;
    }

    public int get3edat() {
        return _3edat;
    }

    public void set3edat(int _3edat) {
        this._3edat = _3edat;
    }

    public int get4medalla() {
        return _4medalla;
    }

    public void set4medalla(int _4medalla) {
        this._4medalla = _4medalla;
    }

    public void setBorrat(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isBorrat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
