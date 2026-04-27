class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        int[] result = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : barcodes) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxfreq = 0;
        int maxelement = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > maxfreq) {
                maxfreq = map.get(key);
                maxelement = key;
            }
        }

        int idx = 0;

        while (map.get(maxelement) > 0) {
            result[idx] = maxelement;
            idx += 2;
            map.put(maxelement, map.get(maxelement) - 1);
        }

        for(int key:map.keySet()){
            while(map.get(key)>0){
                if(idx>=n){
                idx=1;
            }
            result[idx]=key;
            idx+=2;

            map.put(key,map.get(key)-1);
            }
        }

        return result;

    }
}