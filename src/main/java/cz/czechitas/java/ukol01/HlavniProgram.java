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
    zofka.move(40);
    zofka.turnRight(180);
    zofka.setPenColor(new Color(220, 121, 151));
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
  }





}
