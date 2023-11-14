package ar.edu.AP4.context;

public class ActualizarEstado {
    private int MIN_REPRODUCCIONES_AUGE = 1000;
    private int MIN_REPRODUCCIONES_TENDENCIA = 50000;
    private  int MIN_LIKES_TENDENCIA = 20000;
    private int MAX_DISLIKES = 5000;
    public void ActualizarEstado(Cancion c){

        if (c.getReproducciones() > MIN_REPRODUCCIONES_AUGE && c.getDislikes() < MAX_DISLIKES) {
            c.enAuge();
        } else if (c.getReproducciones() > MIN_REPRODUCCIONES_TENDENCIA && (c.getReproducciones() > MIN_REPRODUCCIONES_TENDENCIA
                && c.getLikes() > MIN_LIKES_TENDENCIA)) {
            c.enTendencia();
        } else {
            c.normal();
        }
    }

    }

