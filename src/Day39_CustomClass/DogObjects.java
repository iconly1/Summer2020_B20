package Day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        dog1.setDogInfo("Odie","Pug","Small",100,"Fawn");
        dog2.setDogInfo("Todo","MUTT","Small",1000,"black");
        dog3.setDogInfo("Lassie","Collie","Medium",300,"Mix");
        dog4.setDogInfo("Benji","MUTT","Small",250,"Cinnimon");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();
        dog4.getDogInfo();

        dog1.deadDog();
        dog2.deadDog();
        dog3.deadDog();
        dog4.deadDog();
    }
}
