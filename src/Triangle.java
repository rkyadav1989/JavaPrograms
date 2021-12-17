public class Triangle {
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //Constructor
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        /*This is an parameterized constructor and it accepts same parameter name as of request attribute name.
        In this case we use this keyword to identify attribute in scope of class
         */
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        //There is no need to use this keyword here, attributes in scopes of method is unique, but in case of above case this was not the case.
        return (base * height) / 2;
    }
}
