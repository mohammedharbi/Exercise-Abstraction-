//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MovablePoint mp = new MovablePoint(0,0,1,1);

        System.out.println("This is my current position: X= "+mp.getX()+" Y= "+mp.getY());
        System.out.println("-------------------------------------");
        System.out.println("Now going up Y= "+mp.getY());
        mp.moveUp();
        System.out.println("After moving up Y= "+mp.getY());
        mp.moveDown();
        mp.moveDown();
        System.out.println("After going down twice Y= "+mp.getY());
        System.out.println("-------------------------------------");
        System.out.println("Now going to the right  X= "+mp.getX());
        mp.moveRight();
        System.out.println("After moving right X= "+mp.getX());
        mp.moveLeft();
        mp.moveLeft();
        mp.moveLeft();
        System.out.println("After going left twice X= "+mp.getX());
        System.out.println("-------------------------------------");
        System.out.println("This is my current position: X= "+mp.getX()+" Y= "+mp.getY());


        System.out.println("This is my current position: X= "+mp.getX()+" Y= "+mp.getY());
        System.out.println("-------------------------------------");
        System.out.println("Now going up Y= "+mp.getY());
        mp.moveUp();
        System.out.println("After moving up Y= "+mp.getY());
        mp.moveDown();
        mp.moveDown();
        System.out.println("After going down twice Y= "+mp.getY());
        System.out.println("-------------------------------------");
        System.out.println("Now going to the right  X= "+mp.getX());
        mp.moveRight();
        System.out.println("After moving right X= "+mp.getX());
        mp.moveLeft();
        mp.moveLeft();
        mp.moveLeft();
        System.out.println("After going left twice X= "+mp.getX());
        System.out.println("-------------------------------------");
        System.out.println("This is my current position: X= "+mp.getX()+" Y= "+mp.getY());

    }
}