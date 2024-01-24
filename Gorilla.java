public class Gorilla extends Mammal {
    
        public Gorilla(int energyLevel) {
            super(energyLevel);
        }

        public void throwSomething() {
            System.out.println("Gorilla is throwing an object");
            this.energyLevel -= 5;
        }

        public void eatBananas() {
            System.out.println("Gorilla Eating Bannana");
            this.energyLevel += 10;
        }

        public void climb() {
            System.out.println("Gorilla is climbing tree!");
            this.energyLevel -= 10;
        }

        public void energy() {
            System.out.println("Energy level is:");
            this.energyLevel -= 10;
        }
}