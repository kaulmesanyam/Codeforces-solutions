import java.util.*; 

public class CF352B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashMap<Long, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            long num = sc.nextInt();
            if(map.containsKey(num)) {
                ArrayList<Integer> positions = map.get(num);
                positions.add(i);
                map.put(num, new ArrayList<>(positions));
            } else {
                ArrayList<Integer> positions= new ArrayList<>();
                positions.add(i);
                map.put(num, positions);
            }
        }

        long count = 0;
        TreeMap<Long, Integer> ans = new TreeMap<>();
        if(map.size() == 1) {
            count++;
            for(Long num : map.keySet()) {
                if(map.get(num).size() == 1)
                ans.put(num, 0);
                else ans.put(num, 1);
            }
        } else {
            for(Long num : map.keySet()) {
                //System.out.println("num: " + num + " " + " | size: " + map.get(num).size());
                if(map.get(num).size() == 1) {
                    count++;
                    ans.put(num, 0);
                } else {
                    if(isAP(map.get(num))) {
                        count++;
                        if(map.get(num).size() > 1)
                           ans.put(num,  map.get(num).get(1) - map.get(num).get(0));
                    }  
                }
            }

        }
        

        System.out.println(count);
            for(Long key : ans.keySet()) {
                int value = ans.get(key);
                System.out.println(key + " " + value);
            }
        sc.close();
    }

    private static boolean isAP(ArrayList<Integer> positions) {
        HashSet<Integer> diff = new HashSet<>();

        if(positions.size() <= 2) return true;
        for(int i = 1; i < positions.size(); i++) {
            diff.add(positions.get(i) - positions.get(i - 1));
            if(diff.size() > 1)
                return false;    
        }
        return true;
    }
}
