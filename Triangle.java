public class Triangle extends Polygon{
    /**
     * class's constructor
     * @param args list of every side length
     */
    public Triangle(double... args) {
        super(args);
    }

    /**
     * calculates area
     * @return double type area
     */
    public double calculateArea(){
        double perimeterHalf = calculatePerimeter()/2;
        double area = perimeterHalf * (perimeterHalf - sides.get(0)) * (perimeterHalf - sides.get(1))
                * (perimeterHalf - sides.get(2));
        area = Math.sqrt(area);
        return area;
    }

    /**
     * prints type and calls super method to print perimeter and area
     */
    public void draw(){
        System.out.print("Type : Triangle");
        super.draw();
    }

    /**
     * uses super method to get every side detail
     * @return a string that represents type and every side length
     */
    public String toString(){
        return ("Triangle:: " + super.toString());
    }

    /**
     * check if all sides are equal
     * @return true of all sides are equal / false if not
     */
    public boolean isEquilateral(){
        if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)))
            return true;
        else
            return false;
    }
}
