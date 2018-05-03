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

public class movopc extends PApplet {

Formas f;
 float x, y;

public void setup(){
  
  f= new Formas ();

}

public void draw (){
    for (int i = 0; i<12; i++) {
      for (int j = 0; j<8; j++) {
        float x = map (i, 0, 9, width*.25f, width*.65f);
        float y = map (j, 0, 7, height*.25f, height*.65f);
        //ellipse(x, y, 10, 10);
         f.figura(x,y);
      }
    }
}
class Formas {


Formas (){
  //x= width/4;
  //y= height/4;
}

public void figura (float x, float y) {
noStroke();
fill(255);
ellipse(x,y,10,10);
}

public void opacidad(){
}
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "movopc" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
