public class Rectangle extends Polygon {
    /**
     * class's constructor
     * @param args list of every side length
     */
    public Rectangle(double... args) {
        super(args);
    }

    /**
     * calculates area
     * @return double type area
     */
    public double calculateArea(){
        double area = sides.get(0) * sides.get(1);
        return area;
    }

    /**
     * prints type and calls super method to print perimeter and area
     */
    public void draw(){
        System.out.print("Type : Rectangle");
        super.draw();
    }

    /**
     * uses super method to get every side detail
     * @return a string that represents type and every side length
     */
    public String toString(){
        return ("Rectangle:: " + super.toString());
    }

    /**
     * check if all sides are equal
     * @return true of all sides are equal / false if not
     */
    public boolean isSquare(){
        if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)) && sides.get(2).equals(sides.get(3)))
            return true;
        else
            return false;
    }

}
