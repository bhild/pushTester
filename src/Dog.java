
public class Dog implements Comparable <Dog>
{
    private String name = null;
    private String breed = null;
    private double age = -1;
    private double mass  = -1;
    private static int dogCount  = 0;
    Dog(String name, String breed, double age,double mass)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.mass = mass;
        dogCount ++;
    }//close constuctor
    public void setName(String name)
    {
        this.name = name;
    }//close
    public void setBreed(String breed)
    {
        this.breed = breed;
    }//close
    public void setAge(double age)
    {
        this.age = age;
    }//close
    public void setMass(double mass)
    {
        this.mass = mass;
    }//close
    public String getName()
    {
        return name;
    }//close
    public String getBreed()
    {
        return breed;
    }//close
    public double getAge()
    {
        return age;
    }//close
    public double getMass()
    {
        return mass;
    }//close
    public double massInKg()
    {
        return mass/2.20462;
    }//close massInKg
    public static int numDogs()
    {
        return dogCount;
    }//close numDogs
    public String toString()
    {

        return "Name: "+name+"\nBreed: "+ breed+"\nAge: "+ age+"\nMass: " + mass;
    }//close to string
    public String getOldestDog(Dog a)
    {
        int out = this.compareTo(a);
        if(out==-1)
        {
            return a.name;
        }//close if
        else if(out==1)
        {
           return this.name;
        }//close if 2
        return "equal";
    }//close get oldest dog
    @Override
    public int compareTo(Dog dog) {
        int out = 0;
        if(dog.age>this.age)
        {
            out = -1;
        }else if(dog.age<this.age)
        {
            out = 1;
        }
        return out;
    }//close compare to
}//close class Dog
