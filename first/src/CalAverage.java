
public class CalAverage {

	public int calAvg(int[] arry) {
		int Avg=0, tot=0 ;
		for(int a=0;a < arry.length/2+1;a++) {
			tot += arry[a]+ arry[arry.length-a-1];
		}
		Avg = Math.floorDiv(tot,arry.length);
		return Avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalAverage cal = new CalAverage();
		int j= 100;
		int[] arry = new int[j];
		for(int i=0;i<100;i++) {
			arry[i]=i;
		}
		int i = 3;
		Integer je = 3;
		int m = je.MAX_VALUE;
		System.out.println("i  "+i);
		System.out.println("je "+je);
		System.out.println("m "+m);
		
		System.out.println("Æò±ÕÀº ¹Ù·Î!!!! "+cal.calAvg(arry));
	}

}
