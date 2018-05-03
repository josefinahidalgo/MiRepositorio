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



  void circulos(){
    noStroke();
    fill(133,154,235);
    ellipse(x,y,tam,tam);
  }

    void bordes(){
    if(x>width|| x<0||y>height||y<0){
      x= (width/2);
      y= (height/2);
      }
    }

    boolean salida (){
      if(x>width|| x<0||y>height||y<0){
        return true;
      }else {
        return false;
      }
    }


  void mov(){
  x += velx;
  y += vely;
}
}
