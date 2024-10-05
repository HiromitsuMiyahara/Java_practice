public class Item {
  String name;
  int price;

  public Item(String name) {
    this.name = name;
    this.price = 0;
    System.out.println("現在の装備は" + name + "で、価格は" + price + "円");
  }

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }
}