package org.example;

public class Robot1 extends Personaje{
    public Robot1(int filaInicial, int columnaInicial) {
        super(filaInicial, columnaInicial);
    }

    @Override
    public void mover(int filaJugador, int columnaJugador) {
        int dirFilaMover = calcularDireccion(getFilaActual(), filaJugador);
        int dirColumnaMover = calcularDireccion(getColumnaActual(), columnaJugador);

        int nuevaFila=getFilaActual()+dirFilaMover;
        int nuevaColumna=getColumnaActual()+dirColumnaMover;

        setColumnaActual(nuevaColumna);
        setFilaActual(nuevaFila);
    }
}

