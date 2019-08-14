package practica1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public interface Ipacman {
    public void mover();
    public double getX();
    public double getY();
    public void cambiarDireccion(String dir); //a: izquierda, d:derecha,  s: abajo, w: arriba
    public String getDir(); //Recibe la direccion
    public void pintar();
}
