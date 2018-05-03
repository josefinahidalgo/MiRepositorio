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

public class s04e0josefina extends PApplet {

ArrayList<Figura> lista = new ArrayList<Figura>();
Figura f;


public void setup(){
  
for(int i=0; i<10;i++){
f= new Figura(random(width), random(height));
lista.add(f);
}
}

public void draw(){
  background(255);
  for(Figura f : lista){
  f.circulos();
  f.bordes();
  f.mov();
}

/*for (int i =lista.size()-1; i>= 0; i--){
  Figura f = lista.get (i);
  if(f.salida()){
    lista.remove(i);
  }
}
}*/

/*void keyPressed (){
  if(key == ' '){
    Figura f = new Figura(mouseX, mouseY,10);
    lista.add(f);
  }*/
}
class Figura {

float x;
float y;
float velx;
float vely;
float tam;



  Figura(float x, float y){
 this.x = x;
 this.y = y;
 this.velx = random (-1,1);
 this.vely = random (-1,1);
 this.tam = random (5,8);

  }



  public void circulos(){
    noStroke();
    fill(133,154,235);
    ellipse(x,y,tam,tam);
  }

    public void bordes(){
    if(x>width|| x<0||y>height||y<0){
      x= (width/2);
      y= (height/2);
      }
    }

    public boolean salida (){
      if(x>width|| x<0||y>height||y<0){
        return true;
      }else {
        return false;
      }
    }


  public void mov(){
  x += velx;
  y += vely;
}
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s04e0josefina" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
