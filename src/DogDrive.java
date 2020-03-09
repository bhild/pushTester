public class DogDrive
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang","Husky",5,80);
        Dog dog2 = new Dog("Nutmeg","Australian Sheepdog",12,45);
        Dog dog3 = new Dog("Zwei","Corgi",7,20);
        System.out.println("Dog1:\nBreed " + dog1.getBreed() + "\nage " + dog1.getAge());
        System.out.println("Dog2:\nWeight " + dog2.getMass());
        System.out.println("Dog3:\n"+dog3.toString());
        System.out.println("Total dogs: "+Dog.numDogs());
        System.out.println("Compare Age (Nutmeg:Fang): "+ dog2.getOldestDog(dog1));
        System.out.println("Compare Age (Fang:Zwei): "+ dog1.getOldestDog(dog3));
    }//close main
}//close DogDrive
