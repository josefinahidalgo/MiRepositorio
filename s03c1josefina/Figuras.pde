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

void triangulo (){
  noStroke();
  fill(133, 154, 235);
  triangle(x,y,x,y+25,x+25,y+10);
  if (x>400){
      x= 0;
    }
}



void movimiento(){
  x=x+vel;

}
}
