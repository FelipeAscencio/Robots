package org.example;

public class Robot2 extends Personaje {
    public Robot2(int filaInicial, int columnaInicial) {
        super(filaInicial, columnaInicial);
    }

    @Override
    public void mover(int filaJugador, int columnaJugador) {
        int dirFilaMover = calcularDireccion(getFilaActual(), filaJugador);
        int dirColumnaMover = calcularDireccion(getColumnaActual(), columnaJugador);

        int nuevaFila=getFilaActual()+dirFilaMover;
        int nuevaColumna=getColumnaActual()+dirColumnaMover;

        nuevaFila+=calcularDireccion(nuevaFila,filaJugador);
        nuevaColumna+=calcularDireccion(nuevaColumna,columnaJugador);
        setColumnaActual(nuevaColumna);
        setFilaActual(nuevaFila);
    }
}
