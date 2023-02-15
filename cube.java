/**
 * cube
 */
public class cube {

    public static void main(String[] args) {

        System.out.println(findNb(4183059834009L));
        }
    public static long findNb(long m) {
        int n = 0;
        long sum =0;
        

        while (sum<m) {
            n +=1;
           Long a = (long) (n*n+n);
           int p = 2;
           sum = (long) (Math.pow(a, p)/4);
        }
        if (sum == m) {
            return n;
            
        } else {
            return -1;

        }
        
	}	

}