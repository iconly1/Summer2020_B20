package Day39_CustomClass;

public class dogPark {
    public static void main(String[] args) {

        Dog [] dogPark = {new Dog(), new Dog(),new Dog(),new Dog(),new Dog()};
        dogPark[0].setDogInfo("Odie","Pug","Small",100,"Fawn");
        dogPark[1].setDogInfo("Todo","MUTT","Small",1000,"black");
        dogPark[2].setDogInfo("Lassie","Collie","Medium",300,"Mix");
        dogPark[3].setDogInfo("Benji","MUTT","Small",250,"Cinnimon");
        dogPark[4].setDogInfo("Houch","French-Mastiff","Large",250,"Cinnimon");

        for (int i = 0; i<= dogPark.length-1;i++) {
            String food = "Ghost Biscuit";
            String drink = "BEER";
            dogPark[i].getDogInfo();
            dogPark[i].deadDog();
            dogPark[i].play();
            dogPark[i].eat(food);
            dogPark[i].drink(drink);
            dogPark[i].sleep();
        }
    }
}
