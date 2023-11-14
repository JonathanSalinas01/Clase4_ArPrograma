package ar.edu.AP4.states;

import ar.edu.AP4.context.Cancion;

public class Normal implements Estado{
    Icono cohete = Icono.ROCKET;
    Icono notaMusical = Icono.MUSICAL_NOTE;
    Icono fuego = Icono.FIRE;



    @Override
    public void normal(Cancion c) {
        System.out.println("Esta canción se acaba de lanzar");
    }

    @Override
    public void enAuge(Cancion c) {
        System.out.println(cohete.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                            + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Auge());
    }

    @Override
    public void enTendencia(Cancion c) {
        System.out.println(fuego.texto() + " " + c.getNombre() + " - " + c.getArtista() + " - ("
                + c.getAlbum() + " - " + c.getAnhoLanzamiento() + ")");
        c.setState(new Tendencia());
    }
}
