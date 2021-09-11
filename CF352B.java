import java.util.*; 
 
public class CF352B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashMap<Long, ArrayList<Long>> map = new HashMap<>();
 
        for(long i = 0; i < n; i++) {
            long num = sc.nextLong();
            ArrayList<Long> positions;
            if(map.containsKey(num)) {
                positions = map.get(num);    
            } else {
                positions= new ArrayList<>();
            }
            positions.add(i);
                map.put(num, positions);
        }
 
        TreeMap<Long, Long> ans = new TreeMap<>();
       for(Long num : map.keySet()) {
                //System.out.println("num: " + num + " " + " | size: " + map.get(num).size());
            if(map.get(num).size() == 1) {
                ans.put(num, (long)0);
            } else {
                if(isAP(map.get(num))) {
                    //if(map.get(num).size() > 1)
                       ans.put(num,  map.get(num).get(1) - map.get(num).get(0));
               // }  
                }
            }
        }
        System.out.println(ans.size());
        for(Long key : ans.keySet()) {
            System.out.println(key + " " + ans.get(key));
        }
        sc.close();
    }
 
    private static boolean isAP(ArrayList<Long> positions) {
        HashSet<Long> diff = new HashSet<>();
 
        if(positions.size() <= 2) return true;
        for(long i = 1; i < positions.size(); i++) {
            diff.add(positions.get((int)i) - positions.get((int)i - 1));
            if(diff.size() > 1)
                return false;    
        }
        return true;
    }
}