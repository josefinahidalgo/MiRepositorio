// height



int x;
int x1;
int y;
int y1;


 void setup () {
   //asize (400,400);
    x=0;
    x1=0;
    y=height/2;
    y1=0;

   }

 void draw () {
   background(40,181,139);
fill(0,0,255);
noStroke ();
   ellipse(x,y,80,80);
   x++ ;

   if (x > width) {
   x= 0;
 }

strokeWeight (3);
stroke(255,0,0);
noFill();

   ellipse(x1,y1,50,50);
   x1 ++ ;
   y1 ++ ;
   }

//si x1 mayor al ancho vuelve a x1=0

  if (x1 > width) {
     x1=0;
   }

     //si y1 mayor al alto vuelve a y1=0
if (y1 > height) {
       y1=0;
     }

   }
 }
