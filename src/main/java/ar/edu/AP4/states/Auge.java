package ar.edu.AP4.states;

import ar.edu.AP4.context.Cancion;

public class Auge implements Estado{
    Icono cohete = Icono.ROCKET;
    Icono notaMusical = Icono.MUSICAL_NOTE;
    Icono fuego = Icono.FIRE;


    @Override
    public void normal(Cancion c) {
        //System.out.println("Esta cancion ahora esta normal");
        System.out.println(notaMusical.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Normal());
    }

    @Override
    public void enAuge(Cancion c) {
        System.out.println("Esta cancion ya esta en auge");
    }

    @Override
    public void enTendencia(Cancion c) {
        //System.out.println("En tendencia");
        System.out.println(fuego.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Tendencia());
    }
}
