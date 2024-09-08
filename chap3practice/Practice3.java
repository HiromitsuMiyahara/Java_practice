public class Practice3 {
  public static void main(String[] args) {
    int isHungry = 0;
    String food = "ハンバーガー";
    System.out.println("こんにちは");
    System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです");
    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
    // if (isHungry == 0) {
    //   System.out.println("お腹がいっぱいです");
    // } else {
    //   System.out.println("腹ペコです");
    //   System.out.println(food + "をいただきます");
    // }
    System.out.println("ごちそうさまでした");
  }
}