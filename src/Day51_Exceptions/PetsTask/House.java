package Day51_Exceptions.PetsTask;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winton","Scotty Terrier",'M',4, "Black");

        System.out.println( dog1.name );

        System.out.println(dog1);

        Cat cat1 = new Cat("Sushi","devonrex",'f',1,"calico");
        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Tony","Bengal",'m',80,"Striped");

        System.out.println(tiger1);

        tiger1.eat();

    }
}
