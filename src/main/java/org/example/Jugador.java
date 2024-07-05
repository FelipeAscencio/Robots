package org.example;

public class Jugador extends Personaje {

    public Jugador(int filaActual,int columnaActual){
        super(filaActual,columnaActual);
    }

    @Override
    public void mover(int filaJugador, int columnaJugador) {
        int nuevaFila=getFilaActual();
        int nuevaColumna=getColumnaActual();

        setColumnaActual(nuevaColumna);
        setFilaActual(nuevaFila);
    }

    public void mover(Direccion direccion) {
        int nuevaFila=getFilaActual();
        int nuevaColumna=getColumnaActual();
        nuevaFila+=direccion.getCambioFila();
        nuevaColumna+=direccion.getCambioColumna();

        setColumnaActual(nuevaColumna);
        setFilaActual(nuevaFila);
    }

    public void setFila(int fil){
        setFilaActual(fil);
    }

    public void setColumna(int col){
        setColumnaActual(col);
    }
}