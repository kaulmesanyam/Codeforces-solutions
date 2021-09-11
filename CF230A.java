import java.util.*;



public class CF230A {

        public int x;
        public int y;
        CF230A(int x, int y) {
            this.x = x;
            this.y = y;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        
        List<CF230A> dragons = new ArrayList<CF230A>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            dragons.add(new CF230A(x, y));
            
        }

        Collections.sort(dragons, new Comparator<CF230A>() {
            public int compare(CF230A d1, CF230A d2) {
                if(d1.x < d2.x) {
                    return -1;
                } else if(d1.x == d2.x) {
                    return 0;
                } else return 1;
            }
        });
        boolean flag = true;

        for(CF230A d: dragons ) {
            if(s > d.x) {
                s += d.y;
            } else {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("YES");
        } else 
        System.out.println("NO");
        sc.close();
    }
}
