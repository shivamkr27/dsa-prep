import java.util.HashMap;

class Solution {
    public long subarrayXor(int arr[], int k) {
        int n = arr.length;
        long count = 0;
        int xr = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];
            
            int target = xr ^ k;
            
            if (map.containsKey(target)) {
                count += map.get(target);
            }
            
            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }
        }
        
        return count;
    }
}
