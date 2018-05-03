ArrayList<Figura> lista = new ArrayList<Figura>();
Figura f;


void setup(){
  size(400,400);
for(int i=0; i<10;i++){
f= new Figura(random(width), random(height));
lista.add(f);
}
}

void draw(){
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
