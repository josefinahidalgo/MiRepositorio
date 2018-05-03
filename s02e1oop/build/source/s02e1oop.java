import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class s02e1oop extends PApplet {

//declarar figura, nombrar la clase

Figura f;
Figura g;

public void setup (){
  
 //f = new Figura (10, 10, 20); //inicializa
//  g = new Figura (width/2, height/2, 5);

}

public void draw (){
  background (51);

  f.pelota (68,30); //ocupar el parametro fill
  f.mover ();
  f.bordes ();

  g.pelota(100,25);
  g.mover();
  g.bordes();

}
//Archivo de la clase, donde se crea lo que contiene la clase
class Figura {
  int x;
  int y;
  int t;

  Figura (int x, int y, int t){ //_x es pasar por referencia
    this.x = x;  //this se refiere a las x de este archivo y es igual a x del otro archivo
    this.y = y;
    this.t = t;
  }

  //Descripcion, metodo figura ellipse
  public void pelota( int a, int b){
    fill(a);
    stroke(b);
    ellipse(x,y,t,t);
  }

public void mover (){
//movimiento de una ellipse
x++;
y--;
}

public void bordes(){
  // condicionales de borde para una ellipse
  if(x > width){
    x = 0;
  }
  if (y < 0) {
    y = height;
  }
}
}
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s02e1oop" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
