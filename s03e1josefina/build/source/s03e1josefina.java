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

public class s03e1josefina extends PApplet {

//vamos a trabajar con colores

ArrayList<Particula> lista = new ArrayList<Particula>();
Particula p;
int n,m;

public void setup(){
  
  for (int i = 0; i < 200; i++){
    p = new Particula(i);
    lista.add(p);
  }
}

public void draw (){

  background(255);
  for (Particula a: lista){
    a.show(n);//modificara la eleccion
    a.mover(m);
    a.denuevo();
  }

  //if(frameCount % 60 == 0){ //cada 60 frames cambia de direccion
  //  m = int (random(2)); //por el random puede no cambiar la direccion
    // puede elegir 0,0,0,0,1,0,1,1,0,1,0... por ej
    //al ponerle el int al random solo va a cambiar en tres n\u00fameros
    //enteros, en este caso 0 y 1.
  //}
}

//void keyPressed(){
  //if (key== '1'){ // se vuelven cuadrados
    //n = 1;
  //}
  //else if (key== '0'){ // se vuelven circulos
    //n = 0;
  //}
  //else if (key == 'd'){ // al apretar d se van a la derecha
    //m = 0;
  //}
  //else if (key == 'i'){ // al apretar i se va a la izquieda
    //m = 1;
  //}
//}
class Particula{
  int [] colores;
  int propioDelObjeto;
  int randomColor;
  float x, y, velx, vely, tamano;

  Particula(int i){
    this.randomColor = PApplet.parseInt(random(3));
    colores = new int[3];
    colores [0] = color (255,0,0);
    colores [1] = color (0,255,0);
    colores [2] = color (0,0,255);
    propioDelObjeto = colores [randomColor];
    //x = i*25 + 5;
    x = width/2;//parte desde el ancho medio del canvas
    y = height/2;//parte desde el alto medio del canvas

    velx = random(-10,10);//velocidad para partir desde las esquinas
    vely = random(-10,10);

    x += velx;
    y += vely;
    tamano = random (10,30);

  }

  //descripcion
  public void show (int k){

    if(k== 0){
    fill(propioDelObjeto);
    ellipse(x, y, tamano, tamano);
  }
else if(k==1){
    fill(colores[0]);
    rect(x, height/2, 30, 30);
    }
}

public void mover (int k){
  if (k == 0){
    x += velx;
    y += vely;
  }
  else if (k == 1){
    x--;
  }
}
  public void denuevo (){
    if(x> width || x < 0 || y > height || y < 0){
      x = width;
      y = height/2;
      ellipse(x,y,40,40);
      propioDelObjeto = color (0);

    }
  }
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s03e1josefina" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
