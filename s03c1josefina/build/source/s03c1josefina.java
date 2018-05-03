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

public class s03c1josefina extends PApplet {

//Universidad del Desarrollo - Programaci\u00f3n Creativa - Josefina Hidalgo

//Archivo principal

Figuras f;


public void setup(){
  
  f = new Figuras();
}



public void draw (){
  background(255);
  f. triangulo ();
  f. movimiento ();
  //f.linea ();
}
//Archivo de la clase
class Figuras {
float x;
float y;
float vel;

Figuras (){

vel= 2;

//x += velx;
//y += vely;
for (int i = 0; i < 80; i = i++) {
  line(30, i, 80, i);
}
//velx = random(-10,10);//velocidad para partir desde las esquinas
//vely = random(-10,10);

}

public void triangulo (){
  noStroke();
  fill(133, 154, 235);
  triangle(x,y,x,y+25,x+25,y+10);
  if (x>400){
      x= 0;
    }
}



public void movimiento(){
  x=x+vel;

}
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s03c1josefina" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
