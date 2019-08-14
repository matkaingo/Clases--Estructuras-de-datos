/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;

/**
 *
 * @author Usuario
 */
public class laberinto implements iLaberinto {
    private char[][] m;
    private String rutArchivo;
    private String linea;
    private pacman p;
    private In file;
    
    public laberinto(String ruta){
   
    rutArchivo = ruta;
    int cont = 0;
    file = new In(rutArchivo);
        while(file.readLine().isEmpty()!= true){ //Lee las lineas
            linea=file.readLine();
            for(int j = 0; j<linea.length();j++){
                m[cont][j] = linea.charAt(j);
            }
            cont++;
        }
    }
    
    public void pintar(){
            char ca;
           for(int i = 0;i<m.length;i++){
               for(int j = 0;j<m[0].length;j++){
                   ca = m[i][j];
                   if(ca=='x'){
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.point(i, j);
                   }
               }
           }
       
    }
    public boolean validarPosicion(pacman a){ //Valida que la siguiente posicion esta libre, si esta libre retorna true
         p = a;
         String dir = a.getDir();
         int x, y;
         x = (int)a.getX();
         y = (int)a.getY();
        if(dir.equals("a")){ //Izquierda
            x--;
            if(m[x][y]=='x'){ //Revisa si el pacman toca pared
                return false;
            } else return true;
           
        } 
        if(dir.equals("d")){//Derecha
            x++;
            if(m[y][x]=='x'){ //Revisa si el pacman toca pared
                return false;
            } else return true;
        } 
        if(dir.equals("w")){ //arriba
            y++;
            if(m[y][x]=='x'){ //Revisa si el pacman toca pared
                return false;
            }
            else return true;
        }
        if(dir.equals("s")){ //Abajo
            y--;
            if(m[y][x]=='x'){ //Revisa si el pacman toca pared
                return false;
            }else return true;
        } 
        return true;
    }

}
