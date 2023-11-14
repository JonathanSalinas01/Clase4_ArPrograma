package ar.edu.AP4.app;

import ar.edu.AP4.context.ActualizarEstado;
import ar.edu.AP4.context.Cancion;
import ar.edu.AP4.states.Normal;

public class StateApp {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002, new Normal());
        ActualizarEstado accion = new ActualizarEstado();

        cancion1.normal();

       cancion1.setReproducciones(1100);
       accion.ActualizarEstado(cancion1);

        cancion1.setDislikes(6001);
       accion.ActualizarEstado(cancion1);

       cancion1.setReproducciones(50500);
        cancion1.setLikes(21000);
        accion.ActualizarEstado(cancion1);

        cancion1.setReproducciones(0);
        accion.ActualizarEstado(cancion1);





    }
}