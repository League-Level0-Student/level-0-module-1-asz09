PImage mushroom;
PImage olive;
PImage pepperoni;

void setup() {mushroom = loadImage("mushroom.png");
olive = loadImage("olive.png");
pepperoni = loadImage("download.png");
    size(1000,1000);
}
void draw() {
  fill(180,143,82);
    ellipse(500,500,600,600);
    fill(248,250,177);
    ellipse(500,500,540,540);
    image(olive,400,500);
    image(mushroom,400,600);
    image(olive,410,505);
    image(mushroom,415,510);
    image(olive,420,520);
    for(int counter=0;counter <30;counter++){
      image(mushroom,random(300,670),530+counter);
       image(olive,random(300,619),420+counter);
        image(pepperoni,random(100,630),560+counter);
    }
    if (mousePressed){println(mouseX);}
}
