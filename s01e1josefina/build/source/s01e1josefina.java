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

public class s01e1josefina extends PApplet {

int x;
int y;


 public void setup () {
   
    x=30;
    y=50;

 }

 public void draw () {
   background(69,151,139);
   ellipse(x,y,50,50);
   x += 3;
   y += 3;

   if (x > width) {
     x=0;
  if (y > width){
    y=0;
  }
}
}
  public void settings() {  size (400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s01e1josefina" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
