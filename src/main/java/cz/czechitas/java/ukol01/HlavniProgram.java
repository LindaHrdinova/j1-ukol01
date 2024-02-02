package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

  nakresliPrasatko();
  zofka.turnLeft(90);
  zofka.move(450);
  zofka.turnLeft(90);
  zofka.move(120);
  zofka.turnRight(180);
  nakresliDomecek();
  nakresliDomecek();
  zofka.move(200);
  zofka.turnLeft(90);
  zofka.move(320);
  zofka.turnRight(90);
  for(int i = 0; i <= 4; i++){
  nakresliDomecek();}
  zofka.move(200);
  zofka.turnLeft(90);
  nakresliSlunicko();
  zofka.turnLeft(180);
  zofka.move(800);
  zofka.turnRight(90);
  napisL();
  napisI();
  napisN();
  napisD();
  napisA();

  }
    public void praseciNozicky(){
    zofka.turnRight(30);
    zofka.move(50);
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnRight(120);
    zofka.move(50);
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnRight(30);}

  public void nakresliPrasatko() {
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(100);
    zofka.setPenColor(new Color(220, 121, 151));
    zofka.move(100);
    zofka.penDown();
    praseciNozicky();
    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnRight(90);
    praseciNozicky();
    zofka.move(100);
    zofka.turnRight(130);
    zofka.move(30);
    zofka.turnRight(180);
    zofka.move(30);
    zofka.turnLeft(40);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnRight(135);
    zofka.move(((double) 100/2*Math.sqrt(2)));
    zofka.turnRight(90);
    zofka.move(((double) 100/2*Math.sqrt(2)));
    zofka.penUp();
    zofka.turnLeft(45);
  }

  public void nakresliSlunicko(){
    zofka.setPenColor(new Color(250, 230, 6));
    zofka.penDown();
    for (int i = 0; i < 7; i++) {
      zofka.move(9);
      zofka.turnLeft(90);
      zofka.move(55);
      zofka.turnLeft(180);
      zofka.move(55);
      zofka.turnLeft(90);
      zofka.move(9);
      zofka.turnRight(25);
      zofka.move(9);
      zofka.turnLeft(90);
      zofka.move(30);
      zofka.turnLeft(180);
      zofka.move(30);
      zofka.turnLeft(90);
      zofka.move(9);
      zofka.turnRight(25);
    }
    zofka.penUp();
    zofka.turnLeft(170);
    zofka.move(100);

  }

  public void nakresliDomecek()
  {
//    zofka.turnLeft(180);
//    zofka.move(100);
//    zofka.turnLeft(180);
    zofka.setPenColor(new Color(217, 191, 180));
    zofka.turnLeft(90);
    zofka.penDown();
    for(int i = 0; i < 5 ; i++ )
    {
      zofka.turnRight(90);
      zofka.move(100);
    }
    zofka.setPenColor(new Color(196, 34, 6));
    zofka.turnRight(45);
    zofka.move(50*Math.sqrt(2));
    zofka.turnRight(90);
    zofka.move(50*Math.sqrt(2));
    zofka.turnRight(135);
    zofka.move(100);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(160);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(180);
  }
  public void napisA()
  {
    // A
    zofka.setPenColor(new Color(208, 86, 86));
    zofka.penDown();
    zofka.turnRight(25);
    zofka.move(100*Math.sqrt(1.25));
    zofka.turnRight(135);
    zofka.move(100*Math.sqrt(1.25));
    zofka.turnRight(180);
    zofka.move(30*Math.sqrt(1.25));
    zofka.turnLeft(72);
    zofka.move(55);
    zofka.turnRight(180);
    zofka.move(55);
    zofka.turnRight(72);
    zofka.move(30*Math.sqrt(1.25));
    zofka.penUp();
    zofka.turnLeft(68);
    zofka.move(50);
    zofka.turnLeft(90);
  }

  public void napisD()
  {//D
    zofka.setPenColor(new Color(208, 86, 206));
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(135);
    zofka.move(70);
    zofka.turnRight(90);
    zofka.move(70);
    zofka.penUp();
    zofka.turnLeft(135);
    zofka.move(50);
    zofka.turnLeft(90);
  }
  public void napisI(){
    // I
    zofka.setPenColor(new Color(86, 171, 208));
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(180);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(30);
    zofka.turnLeft(90);}
  public void napisL() {
    // L
    zofka.setPenColor(new Color(86, 88, 208));
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(180);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.penUp();
    zofka.move(30);
    zofka.turnLeft(90);
  }

  public void napisN(){
    //N
    zofka.setPenColor(new Color(131, 86, 208));
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(155);
    zofka.move(100*Math.sqrt(1.25));
    zofka.turnLeft(155);
    zofka.move(100);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(30);
    zofka.turnLeft(90);
  }

}
