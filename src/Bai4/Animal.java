package Bai4;

public class Animal {
     String name;
     String color;

     public void run(){
         System.out.println("dang chay"); ;
     }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "dog ";
        dog.color = "black ";
        System.out.print("name: " + dog.name + " color: " + dog.color);
        dog.run();
//        System.out.println(dog);
    }
}
