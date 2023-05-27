PImage face; 
void setup() {
  size(800,800);
face = loadImage("76melo.jpg");
face.resize(800,800);
background(face);


size(800,800);
}
void draw() {
  fill(255,0,0);
ellipse(178,247,100,100);
ellipse(478,220,100,100);

if (mousePressed){
  fill(0,14,255);
  ellipse(178,247,100,100);
  fill(126,0,255);
  ellipse(478,220,100,100);

}
}
