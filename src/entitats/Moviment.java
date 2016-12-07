package entitats;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author Pedro Martínez Segura
 */
public class Moviment implements Comparable, Serializable{
    
    private String _1nom;
    private String _2tipus;
    private int _3poder;
    
    static final Comparator<Moviment> CAL_ORDER =
            (Moviment m1, Moviment m2) -> (m1.get3poder() < m2.get3poder() ? -1 :
                    (m1.get3poder() == m2.get3poder() ? 0 : 1));
    static final Comparator<Moviment> TYPE_ORDER =
            (Moviment m1, Moviment m2) -> m1.get1nom().compareTo(m2.get1nom());

    
    public Moviment(String _1nom, String _2tipus, int _3poder) {
        this._1nom = _1nom;
        this._2tipus = _2tipus;
        this._3poder = _3poder;
    }

    @Override
    public String toString() {
        return "Moviment{" + "_1nom=" + _1nom + ", _2tipus=" + _2tipus + ", _3poder=" + _3poder + '}';
    }
    
        @Override
    public int compareTo(Object o) {
        Moviment m = (Moviment)o;
        return _1nom.compareTo(m.get1nom());
    }

    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }
    
    public String get2tipus() {
        return _2tipus;
    }

    public void set2tipus(String _2tipus) {
        this._2tipus = _2tipus;
    }

    public int get3poder() {
        return _3poder;
    }

    public void set3poder(int _3poder) {
        this._3poder = _3poder;
    }

}
