int x;
int y;


 void setup () {
   size (400,400);
    x=30;
    y=50;

 }

 void draw () {
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
