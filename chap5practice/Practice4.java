public class Practice4{
  public static double calcTriangleArea(double bottom, double height) {
    double ans = bottom * height / 2;
    return ans;
  }
  public static double calcCircleArea(double radius) {
    double ans = radius * radius * 3.14;
    return ans;
  }
  public static void main(String[] args) {
    double calcTriangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積は" + calcTriangleArea + "cm２");
    double calcCircleArea = calcCircleArea(5.0);
    System.out.println("円の面積は" + calcCircleArea + "cm２");
  }
}