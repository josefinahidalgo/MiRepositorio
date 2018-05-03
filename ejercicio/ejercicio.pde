// comentario de linea
/*
comentario de bloque
*/

/*
los pasos de una variable
1 declarar
2 inicializar
3 usar
*/

// variables globales
int a; // variable entera 0 1 312
float b; // variable decimal y enteras
boolean c; // variable binario true false
String d; // variable de color

void setup (){
  size(200,200);
a = 10;
d = "a" //si escribo la letra en "" aludo a la letra no al valor
println(d,a,b,f);

void draw() {
background(25, 10, a) //la letra sera el valor que se le indique, hasta 255
background (0) //es otra opc de poner color con un solo valor
//no fill(); // es para no rellenar lo que viene
ellipse(100, 100, 100, a);
a++; // el ++ es mas 1px y -- es menos 1px, incrementar o disminur el valor en 1
//pero si pongo a+=10; se mueve a velocidad de 10 osea sumandole 10
}

void keyPressed (){

}
