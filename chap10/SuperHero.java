public class SuperHero extends Hero {
  boolean flying;
  
  public SuperHero() {
    super();
    System.out.println("SuperHeroのコンストラクタが動作");
  }
  //飛ぶ
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  //着地する
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  public void run() {
    System.out.println(this.name + "は撤退した");
  }
}