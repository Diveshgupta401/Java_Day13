package Day13;

public class MaxFload {
	 public static float compareTo(float num1, float num2, float num3) {

	        if (num1 > num2 && num1 > num3) {
	            return num1;
	        } else if (num2 > num3) {
	            return num2;
	        } else {
	            return num3;
	        }
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub



	    	MaxFload number = new MaxFload();
	        System.out.println("max Number =" + number.compareTo(4.1f, 2.6f, 1.7f));
	    }
}
