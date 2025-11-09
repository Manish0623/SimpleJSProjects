// Define the Phone class
class Phone {

    String ring;
    String vibrating;

    // Getter method for ring
    public String getRing() {
        return ring;
    }

    // Getter method for vibrating
    public String getVibrating() {
        return vibrating;
    }
}

// Main class to use the Phone
public class phoneRelated {
    public static void main(String[] args) {
        Phone my = new Phone();

        my.ring = "Your phone is ringing";
        my.vibrating = "Your phone is vibrating";

        // Accessing fields directly
        System.out.println(my.ring);
        System.out.println(my.vibrating);

        // Or accessing via methods
        System.out.println(my.getRing());
        System.out.println(my.getVibrating());
    }
}
