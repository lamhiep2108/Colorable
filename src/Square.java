public  class Square extends Rectangle implements Colorable{
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(4);
        squares[1] = new Square();
        squares[2] = new Square(5, "red", false);
        for (Square square: squares){

            System.out.println("area"+ square.getArea());
        }

    }
}