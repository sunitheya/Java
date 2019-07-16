public class AreaCalculator {
    public static double area(double radius){
        double area;
        if(radius < 0){
            return -1;
        }
        return area = Math.PI*radius*radius;
    }
    public static double area(double x,double y){
        double areaOfRectangle;
        if((x<0) || (y<0)){
            return -1;
        }
        return areaOfRectangle = x*y;
    }

}
