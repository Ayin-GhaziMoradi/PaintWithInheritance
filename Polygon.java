import java.util.ArrayList;
import java.util.Collections;

public class Polygon extends Shape{
    public ArrayList<Double> sides;

    /**
     * class's constructor
     * @param args every side length as a list
     */
    public Polygon(double... args) {
        this.sides = new ArrayList<>();
        for (double arg : args){
            sides.add(arg);
        }
    }

    /**
     * calculates perimeter
     * @return double type perimeter
     */
    public double calculatePerimeter(){
        double perimeter = 0;
        for(Double side : sides)
            perimeter += side;

        return perimeter;
    }

    /**
     * check if input shape is the same polygon or not
     * @param inputShape the shape to be tested
     * @return true if it's the same / false if not
     */
    public boolean equals(Shape inputShape){
        Collections.sort(this.sides);
        Polygon testShape = (Polygon)inputShape;
        Collections.sort((testShape).getSides());
        for (int i = 0 ; i<(testShape).getSides().size() ; i++) {
            if (!this.getSides().get(i).equals((testShape).getSides().get(i)))
                return false;
        }
        return true;
    }

    /**
     * returns a string containing every side length
     * @return the string with every side length
     */
    public String toString(){
        int sidesSize = this.sides.size();
        String outPut;
        outPut = new String();
        for(int i=0 ; i < sidesSize-1 ; i++){
            outPut += ("side" + (i+1) + ":" + sides.get(i) + ", ");
        }
        outPut += ("side" + (sidesSize-1) + ":" + sides.get(sidesSize-1));
        return outPut;
    }

    /**
     * get the sides' ArrayList
     * @return sides' Arraylist
     */
    public ArrayList<Double> getSides() {
        return sides;
    }
}
