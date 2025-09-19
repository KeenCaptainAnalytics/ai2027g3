
class Car{
    int price;
    String color;

    void getInfo(){
        System.out.println(price);
        System.out.println(color);
    }
}
public class Ref {
    public static void main(String[] args) {
      Car c1 = new Car();
      c1.color = "pink";
      c1.price= 12344434;
      c1.getInfo();
      Car c2 = new Car() ;
      Car c3 = new Car();
      Car c4 = new Car();
    //   c1 , c2 ,c3 , c4 = > reference variables because they hold refernces of the created object
    // int , boolean ....... => primitive variables(actual values)
    }    
}
