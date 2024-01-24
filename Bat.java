public class Bat extends Mammal{
    public Bat(){
        super(300);
    }

    public void fly(){
        System.out.println("Bat took off flying");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("Town is on fire by bat attack");
        this.energyLevel -= 100;
    }

    public void energy(){
        System.out.println("Energy level is: ");
        this.energyLevel -= 100;
    }
}