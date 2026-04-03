import java.util.*;

public class RecommendationSystem {
    public static void main(String[] args) {
        List<String> user = Arrays.asList("Mobile", "Laptop");
        List<String> other = Arrays.asList("Mobile", "Tablet", "Laptop");

        for (String item : other) {
            if (!user.contains(item)) {
                System.out.println("Recommended: " + item);
            }
        }
    }
}