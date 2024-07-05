package org.example;

public abstract class Personaje {
    private int filaActual;
    private int columnaActual;

    public Personaje(int filaInicial, int columnaInicial) {
        this.filaActual = filaInicial;
        this.columnaActual = columnaInicial;
    }

    public int getFilaActual() {
        return filaActual;
    }

    public int getColumnaActual() {
        return columnaActual;
    }

    public void setFilaActual(int fil){
        filaActual=fil;
    }

    public void setColumnaActual(int col){
        columnaActual=col;
    }

    public int calcularDireccion(int actual, int objetivo) {
        int diferencia = objetivo - actual;
        if (Math.abs(diferencia) >= 1) {
            return diferencia > 0 ? 1 : -1;
        }
        return 0;
    }

    public abstract void mover(int filaJugador, int columnaJugador);

    public boolean colisionJugador(int filaJugador, int columnaJugador){
        return (filaJugador == getFilaActual() && columnaJugador == getColumnaActual());
    }
}
