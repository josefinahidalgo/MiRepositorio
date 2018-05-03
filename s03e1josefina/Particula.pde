class Particula{
  color [] colores;
  color propioDelObjeto;
  int randomColor;
  float x, y, velx, vely, tamano;

  Particula(int i){
    this.randomColor = int(random(3));
    colores = new color[3];
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
  void show (int k){

    if(k== 0){
    fill(propioDelObjeto);
    ellipse(x, y, tamano, tamano);
  }
else if(k==1){
    fill(colores[0]);
    rect(x, height/2, 30, 30);
    }
}

void mover (int k){
  if (k == 0){
    x += velx;
    y += vely;
  }
  else if (k == 1){
    x--;
  }
}
  void denuevo (){
    if(x> width || x < 0 || y > height || y < 0){
      x = width;
      y = height/2;
      ellipse(x,y,40,40);
      propioDelObjeto = color (0);

    }
  }
}
