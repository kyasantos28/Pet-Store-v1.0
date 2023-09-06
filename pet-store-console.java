import java.util.Scanner;

class PetStore {
    public static void main(String[] args) {
        System.out.println("Welcome to my Pet Store!");

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Select Pet: (Dog, Cat, Fish, Bird)"); 
        System.out.print("Enter your choice: ");
        String selectedPet = scanner.nextLine().toLowerCase();  // convert to lowercase para hindi case-sensitive

        switch (selectedPet) {
            case "dog":
                System.out.print("Select Breed (Bulldog, Poodle, Golden Retriever, Labrador): ");
                String breedChoice = scanner.nextLine().toLowerCase(); 
                displayDogProducts(breedChoice);
                break;

            case "cat":
                System.out.print("Select Breed (Manx, Persian): ");
                breedChoice = scanner.nextLine().toLowerCase(); 
                displayCatProducts(breedChoice);
                break;

            case "fish":
                System.out.print("Select Breed (Angel Fish, Tiger Shark, Koi, Goldfish): ");
                String fishChoice = scanner.nextLine().toLowerCase();  
                displayFishProducts(fishChoice);
                break;

            case "bird":
                System.out.print("Select Breed (Amazon Parrot, Finch): ");
                String birdChoice = scanner.nextLine().toLowerCase();  
                displayBirdProducts(birdChoice);
                break;

            default:
                System.out.println("Not Existing");
                break;
        }

        scanner.close();
    }

    private static void displayDogProducts(String breedChoice) {
        String breed; //for list display
        int itemNumber = 0;
        double commonPrice = 0;// para pwede ibahin ang price

        switch (breedChoice) {
            case "bulldog":
                breed = "Bulldog";
                itemNumber = 1;
                commonPrice = 150.0; 
                break;
            case "poodle":
                breed = "Poodle";
                itemNumber = 2;
                commonPrice = 160.0;
                break;
            case "golden retriever":
                breed = "Golden Retriever";
                itemNumber = 3;
                commonPrice = 170.0;
                break;
            case "labrador":
                breed = "Labrador";
                itemNumber = 4;
                commonPrice = 180.0;
                break;
            default:
                breed = "Unknown";
                break;
        }

        if ("Unknown".equals(breed)) {
            System.out.println("Not Existing");
            return;
        }

        System.out.println("Item ID    Product ID    Description               List Price");
        System.out.println(String.format("DOG-%d01    K9-RT-%d01      Adult Male %s      $%.2f", itemNumber, itemNumber, breed, commonPrice));
        double mediumPrice = commonPrice + (0.25 * commonPrice);
        System.out.println(String.format("DOG-%d02    K9-RT-%d02      Adult Female %s    $%.2f", itemNumber, itemNumber, breed, mediumPrice));
    }

    private static void displayCatProducts(String breedChoice) {
        String breed;
        int itemNumber;
        double commonPrice;

        switch (breedChoice) {
            case "manx":
                breed = "Manx";
                itemNumber = 1;
                commonPrice = 100.0;
                break;
            case "persian":
                breed = "Persian";
                itemNumber = 2;
                commonPrice = 110.0;
                break;
            default:
                breed = "Unknown";
                itemNumber = 3;
                commonPrice = 0.0;
                break;
        }

        if ("Unknown".equals(breed)) {
            System.out.println("Not Existing");
            return;
        }
        double mediumPrice = commonPrice + (0.25 * commonPrice); 
        System.out.println("Item ID    Product ID    Description              List Price");
        System.out.println(String.format("CAT-%d01    C4-PM-%d01      Tail-less %s        $%.2f", itemNumber, itemNumber, breed, mediumPrice));
        System.out.println(String.format("CAT-%d01    C4-PM-%d01      with Tail %s        $%.2f", itemNumber, itemNumber, breed, commonPrice));
    }

    private static void displayFishProducts(String fishChoice) {
        String fishType;
        int itemNumber;
        double commonPrice;

        switch (fishChoice) {
            case "angel fish":
                fishType = "Angel Fish";
                itemNumber = 1;
                commonPrice = 5.0;
                break;
            case "tiger shark":
                fishType = "Tiger Shark";
                itemNumber = 2;
                commonPrice = 15.0;
                break;
            case "koi":
                fishType = "Koi";
                itemNumber = 3;
                commonPrice = 10.0;
                break;
            case "goldfish":
                fishType = "Goldfish";
                itemNumber = 4;
                commonPrice = 3.0;
                break;
            default:
                fishType = "Unknown";
                itemNumber = 5;
                commonPrice = 0.0;
                break;
        }

        if ("Unknown".equals(fishType)) {
            System.out.println("Not Existing");
            return;
        }

        System.out.println("Item ID    Product ID    Description               List Price");
        System.out.println(String.format("FISH-%d01   AQUA-%d01      %s (Small)    $%.2f", itemNumber, itemNumber, fishType, commonPrice));
        double mediumPrice = commonPrice + (0.25 * commonPrice); 
        System.out.println(String.format("FISH-%d02   AQUA-%d02      %s (Medium)   $%.2f", itemNumber, itemNumber, fishType, mediumPrice));
    }

    private static void displayBirdProducts(String birdChoice) {
        String birdType;
        int itemNumber;
        double commonPrice;

        switch (birdChoice) {
            case "amazon parrot":
                birdType = "Amazon Parrot";
                itemNumber = 1;
                commonPrice = 250.0;
                break;
            case "finch":
                birdType = "Finch";
                itemNumber = 2;
                commonPrice = 20.0;
                break;
            default:
                birdType = "Unknown";
                itemNumber = 3;
                commonPrice = 0.0;
                break;
        }

        if ("Unknown".equals(birdType)) {
            System.out.println("Not Existing");
            return;
        }

        System.out.println("Item ID    Product ID    Description               List Price");
        System.out.println(String.format("BIRD-%d01   AVIA-%d01     Male %s     $%.2f", itemNumber, itemNumber, birdType, commonPrice));
        double mediumPrice = commonPrice + (0.25 * commonPrice); 
        System.out.println(String.format("BIRD-%d02   AVIA-%d02     Female %s     $%.2f", itemNumber, itemNumber, birdType, mediumPrice));
    }
}
