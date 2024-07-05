package org.example;

public enum Direccion {
    ARRIBA(-1, 0),
    ABAJO(1, 0),
    IZQUIERDA(0, -1),
    DERECHA(0, 1),
    DIAGONAL_ARRIBA_IZQUIERDA(-1,-1),
    DIAGONAL_ARRIBA_DERECHA(-1, 1),
    DIAGONAL_ABAJO_IZQUIERDA(1, -1),
    DIAGONAL_ABAJO_DERECHA(1,1);
    private final int cambioFila;
    private final int cambioColumna;

    Direccion(int cambioFila, int cambioColumna) {
        this.cambioFila = cambioFila;
        this.cambioColumna = cambioColumna;
    }

    public static Direccion calcular(double diffX, double diffY) {
        double angulo = Math.toDegrees(Math.atan2(diffY, diffX));
        if (angulo < 0) {
            angulo += 360;
        }

        if (angulo >= 337.5 || angulo < 22.5) {
            return Direccion.ABAJO;
        } else if (angulo >= 22.5 && angulo < 67.5) {
            return Direccion.DIAGONAL_ABAJO_DERECHA;
        } else if (angulo >= 67.5 && angulo < 112.5) {
            return Direccion.DERECHA;
        } else if (angulo >= 112.5 && angulo < 157.5) {
            return Direccion.DIAGONAL_ARRIBA_DERECHA;
        } else if (angulo >= 157.5 && angulo < 202.5) {
            return Direccion.ARRIBA;
        } else if (angulo >= 202.5 && angulo < 247.5) {
            return Direccion.DIAGONAL_ARRIBA_IZQUIERDA;
        } else if (angulo >= 247.5 && angulo < 292.5) {
            return Direccion.IZQUIERDA;
        } else {
            return Direccion.DIAGONAL_ABAJO_IZQUIERDA;
        }
    }

    public int getCambioFila() {
        return cambioFila;
    }

    public int getCambioColumna() {
        return cambioColumna;
    }
}
