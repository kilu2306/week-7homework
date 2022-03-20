public class Wall {
    ///creating two instacen variable;
    double width;
    double height;

    //creating one constructor
    public Wall() {
        this.width=width;
        this.height=height;

    }
//constructor with parameter
    public Wall(double width, double height) {
        if (width < 0) {
            width=0;
        } else if (height < 0) {
            height=0;
        }
        this.width= width ;
        this. height= height;
    }

    //declaring first return method with no parameter
    public double getWidth() {

        return width;
    }

    //declaring second return method with no parameter
    public double getHeight() {

        return height;

    }

    //declaring  third return type of method with parameter
    public double setHeight(double height) {

        if (height < 0) {
            height=0;}
        this.height=height;
        return height;
    } //declaring  fourth return type methof with no parameter
        public double getArea(){
            double area = width* height;

            return area ;
        }

    public static void main(String[] args) {
        Wall wall= new Wall(5,4);
        System.out.println("area =" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width =" + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area=" + wall.getArea());
    }
    }
