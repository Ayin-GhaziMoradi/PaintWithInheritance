import java.util.ArrayList;

public class Paint {
    public ArrayList<Shape> shapes;

    /**
     * class's constructor
     */
    public Paint(){
        shapes = new ArrayList<>();
    }

    /**
     * adds the input shape to the ArrayList
     * @param inputShape the shape to be added
     */
    public void addShape(Shape inputShape){
        shapes.add(inputShape);
    }

    /**
     * iterates through the shapes Arraylist and calls every shape's draw method
     */
    public void drawAll(){
        for (Shape shape : shapes){
            shape.draw();
        }
    }

    /**
     * iterates through the shapes Arraylist and prints every shape's toString method returned string
     */
    public void printAll(){
        for (Shape shape : shapes){
            System.out.println(shape.toString());
        }
    }

    /**
     * iterates through the shapes Arraylist and prints the details of squares and Equilaterals
     */
    public void describeEqualSides(){
        for (Shape shape : shapes){
            if(shape instanceof Rectangle){
                Rectangle recShape=(Rectangle)shape;
                if (recShape.isSquare()){
                    System.out.println(recShape.toString());
                }
            }
            if(shape instanceof Triangle){
                shape = (Triangle)shape;
                if (((Triangle) shape).isEquilateral()){
                    System.out.println(shape.toString());
                }
            }
        }
    }

}
