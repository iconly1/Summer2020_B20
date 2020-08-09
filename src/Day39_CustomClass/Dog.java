package Day39_CustomClass;

public class Dog {
    /*
	instance variables:
			name, breed, size, age, color

	instance methods:
			setDogInfo, getDogInfo, eat, drink, sleep, ...
 */
    String name;
    String breed;
    String size;
    int age;
    String color;


    public void setDogInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;
    }
    // sets the info of the dog

    public void getDogInfo(){
        System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+"years old");
    }
    // prints dog info
    public void deadDog(){
        System.out.println(name+" RIP"+"  :-(");

    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking a "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping on a bed of bacon");
    }

    public void play(){
        System.out.println(name+" is playing in doggy heaven");
    }



    /*
    dog1: husky
    dog2: pitbull
    dog3: golden retriever
     */


}
