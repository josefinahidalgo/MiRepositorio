//declarar figura, nombrar la clase

Figura f;
Figura g;

void setup (){
  size(600,600);
 //f = new Figura (10, 10, 20); //inicializa
//  g = new Figura (width/2, height/2, 5);

}

void draw (){
  background (51);

  f.pelota (68,30); //ocupar el parametro fill
  f.mover ();
  f.bordes ();

  g.pelota(100,25);
  g.mover();
  g.bordes();

}
