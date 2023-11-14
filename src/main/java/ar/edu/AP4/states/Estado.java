package ar.edu.AP4.states;

import ar.edu.AP4.context.Cancion;

public interface Estado {
    public void normal(Cancion c);
    public void enAuge(Cancion c);
    public void enTendencia(Cancion c);
}
