import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;


public class Main {
  public static void main(String[] args) {  
    World world = new World(600,600);
   
    Turtle turtle1 = new Turtle(150,150, world);
    turtle1.setName("Bob");
    turtle1.setBodyColor(Color.RED);
    turtle1.setShellColor(Color.green);
    turtle1.setPenWidth(3);
    turtle1.setPenColor(Color.RED);
    turtle1.setWidth(20);
    turtle1.setHeight(20);
     
    Turtle turtle2 = new Turtle(450,150, world);
    turtle2.setName("Joe");
    turtle2.setBodyColor(Color.GREEN);
    turtle2.setShellColor(Color.ORANGE);
    turtle2.setPenWidth(2);
    turtle2.setPenColor(Color.GREEN);
    turtle2.setWidth(10);
    turtle2.setHeight(10);

    Turtle turtle3 = new Turtle(150,450, world);
    turtle3.setName("Larry");
    turtle3.setBodyColor(Color.YELLOW);
    turtle3.setShellColor(Color.MAGENTA);
    turtle3.setPenWidth(2);
    turtle3.setPenColor(Color.YELLOW);
    turtle3.setWidth(25);
    turtle3.setHeight(25);

    Turtle turtle4 = new Turtle(450,450, world);
    turtle4.setName("Parker");
    turtle4.setBodyColor(Color.BLACK);
    turtle4.setShellColor(Color.BLUE);
    turtle4.setPenWidth(2);
    turtle4.setPenColor(Color.BLACK);
    turtle4.setWidth(15);
    turtle4.setHeight(15);

    drawSquare(turtle1, 60);
    drawTriangle(turtle2, 60);
    drawStar(turtle3, 60);
    drawAsterisk(turtle4, 40);
    
    TurtleInfo(turtle1, "Square");
    TurtleInfo(turtle2, "Triangle");
    TurtleInfo(turtle3, "Star");
    TurtleInfo(turtle4, "Asterisk");
  
  }

  public static void drawSquare(Turtle t, int size) {
    for(int i = 0; i < 4; i++){
      t.forward(size);
      t.turnRight();
    }
    
  }
  public static void drawTriangle(Turtle t, int size) {
    for(int i = 0; i < 3; i++){
      t.forward(size);
      t.turn(120);
    }
    
  }
  public static void drawStar(Turtle t, int size) {
    for(int i = 0; i < 5; i++){
      t.forward(size);
      t.turn(144);
    }

  }
  public static void drawAsterisk(Turtle t, int size) {
    for(int i = 0; i < 8; i++){
      t.forward(size);
      t.backward(size);
      t.turn(45); 

    }
  }
  public static void TurtleInfo(Turtle t, String shapeDrawn) {
    Color c = t.getBodyColor();
    double distance = t.getDistance(0, 0);

    System.out.println("Turtle Name: " + t.getName());
    System.out.println("Color(RGB) R=" + c.getRed() + " G=" + c.getGreen() + "B=" + c.getBlue());
    System.out.println("Shape Drawn: "+ shapeDrawn);
    System.out.println("Distace to (0,0): " + String.format("%.2f", distance) + " pixels");

  }
    
}

