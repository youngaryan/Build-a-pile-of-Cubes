/**
 * cube
 */
public class cube {

    public static void main(String[] args) {

        System.out.println(findNb(4183059834009L));
        }
    public static long findNb(long m) {
        int n = 0;
        int sum =0;
        

        while (sum<m) {
            n +=1;
           int a = (n*n+n);
           int p = 2;
           sum = (int) (Math.pow(a, p)/4);
           System.out.println(n);
        }

        return n;
        
	}	

}