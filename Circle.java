public class Circle extends Shape{
    public double radius;

    /**
     * class's constructor
     * @param radius circle's radius (double)
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * get circle radius
     * @return circle radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * calculates perimeter
     * @return double type perimeter
     */
    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    /**
     * calculates area
     * @return double type area
     */
    public double calculateArea(){
        double area = radius * radius * Math.PI;
        return area;
    }

    /**
     * prints type and calls super method to print perimeter and area
     */
    public void draw(){
        System.out.print("Type : Circle");
        super.draw();
    }

    /**
     * check if input shape is the same circle or not
     * @param testShape the shape to be tested
     * @return true if it's the same / false if not
     */
    public boolean equals(Shape testShape){
        if(this.getRadius() == ((Circle)testShape).getRadius())
            return true;
        else
            return false;
    }

    /**
     * returns a string that stores type and radius
     * @return type and radius as a string
     */
    public String toString(){
        return ("Type : Circle | Radius : " + this.getRadius());
    }
}
