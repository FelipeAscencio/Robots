package org.example;

public class Tablero {
    private int filas;
    private int columnas;
    private Object[][] matriz;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Object[filas][columnas];
    }

    public void vaciar(){
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                this.eliminarElemento(i,j);
            }
        }
    }

    public boolean hayExplosion(int fila, int col){
        Object elemento = getElemento(fila, col);
        if (elemento instanceof Explosion){
            return true;
        }
        return false;
    }

    public boolean hayEnemigo(int fila, int col){
        Object elemento=getElemento(fila,col);
        return elemento instanceof Robot1 || elemento instanceof Robot2;
    }

    public void eliminarElemento(int fila, int columna) {
        matriz[fila][columna] = null;
    }

    public void agregarElemento(Object elemento, int filaNueva, int colNueva){
        matriz[filaNueva][colNueva]=elemento;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Object getElemento(int fila, int columna) {
        return matriz[fila][columna];
    }
}
