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
  void pelota( int a, int b){
    fill(a);
    stroke(b);
    ellipse(x,y,t,t);
  }

void mover (){
//movimiento de una ellipse
x++;
y--;
}

void bordes(){
  // condicionales de borde para una ellipse
  if(x > width){
    x = 0;
  }
  if (y < 0) {
    y = height;
  }
}
}
