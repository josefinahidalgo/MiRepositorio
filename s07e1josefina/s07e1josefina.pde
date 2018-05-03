BASE DE CERTAMEN

int r = 0; //parte en 0
float x, y;
float velx = 2;
void setup() {
  size(400, 400);
  background (0);
}
void draw() {
  background (0);
  translate(width/2, height/2); //origen, giran en torno al centro del canvas
  pushMatrix();
  rotate(radians(r));
  r++;

  for (int i=0; i< 8; i++) {


    noStroke();
    fill(255);
    ellipse(0 + i * 20, 0, 10, 10); //si pongo en el eje x 100 gira horiz

    ellipse(0, 0 + i * 20, 10, 10);

  }
  popMatrix();
