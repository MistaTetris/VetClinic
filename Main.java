package animals;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Pedigrie", "golden", 35, "Jack");
		
		Cat cat1 = new Cat("Purina", "Black", 5, "Mikki");
		
		Veterinarian vet1 = new Veterinarian("Bob");
		
		 vet1.animalTreatment(cat1);
		 System.out.println(cat1.getVoice());
		 vet1.animalTreatment(dog1);
		 System.out.println(dog1.getVoice());
		
	}

}
