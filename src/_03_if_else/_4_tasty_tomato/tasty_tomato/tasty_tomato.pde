void setup() {
    size(1000, 1000);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#F70505);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#0C8928);
    rect(176, 103, 12, 32);
    if (mousePressed){
      fill(200,200,200); noStroke();
      ellipse(89, 200, 50, 50);
    } }
