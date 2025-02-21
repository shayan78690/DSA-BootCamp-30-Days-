import java.util.*;

public class Main {
    public static void validatePassword(List<Integer> password, String[] result, int[] mostFrequentElement) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < password.size(); i++) {
            map.put(password.get(i), map.getOrDefault(password.get(i), 0)+1);
        }
        boolean isEven = true;
        for(Integer key : map.keySet()) {
            if(map.get(key) % 2 != 0) {
                isEven = false;
                break;
            }
        }

        boolean isExactlyTwo = false;
        for(Integer key : map.keySet()) {
            if(map.get(key) == 2) {
                isExactlyTwo = true;
                break;
            }
        }

        int mostFrequent = Integer.MAX_VALUE;
        int max_freq = 0;
        for(Integer key : map.keySet()) {
            int freq = map.get(key);
            if(freq > max_freq || (freq == max_freq && key < mostFrequent)) {
                max_freq = freq;
                mostFrequent = key;
            }
        }

        if(isEven && isExactlyTwo) {
            result[0] = "VALID";
        } else {
            result[0] = "INVALID";
        }
        mostFrequentElement[0] = mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> password = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            password.add(scanner.nextInt());
        }
        String[] validationResult = new String[1];
        int[] mostFrequentElement = new int[1];
        validatePassword(password, validationResult, mostFrequentElement);
        System.out.println(validationResult[0]);
        System.out.println(mostFrequentElement[0]);
    }
}
