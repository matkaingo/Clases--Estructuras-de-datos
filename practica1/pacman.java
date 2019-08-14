/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import edu.princeton.cs.algs4.StdDraw;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Usuario
 */
public class pacman implements Ipacman{
    private double x;
    private double y;
    private String dir;
 
    public pacman(double x, double y, String direccion){
        this.x = x;
        this.y = y;
        dir = direccion;
    }
    public void mover(){
        if(dir.equals("a")){ //Izquierda
            x--;
        } 
        if(dir.equals("d")){//Derecha
            x++;
        } 
        if(dir.equals("w")){ //arriba
            y++;
        }
        if(dir.equals("s")){ //Abajo
            y--;
        } 
        
    
    }
    public void pintar(){
         StdDraw.setPenColor(StdDraw.YELLOW);
         StdDraw.point(x, y);
         
     }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void cambiarDireccion(String nuevaDir){
        dir = nuevaDir;
    }
    
  public String getDir(){
      return dir;
  }
    
    
}
