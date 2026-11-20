package Arrays;

import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {

        int arr[] = {3, 1, 2, 3, 4, 5, 2, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {

            if(map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for(int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}