import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 class HDTV implements Comparator<HDTV>,Comparable<HDTV> {

		String BrandName;
		double size;
		
		HDTV()
		{}
		public HDTV(String n, double s)
		{
			BrandName = n;
			size = s;
		}
		
		public String getName()
		{
			return BrandName;
		}
		
		public double getSize()
		{
			return size;
		}
		@Override
		public int compareTo(HDTV h) {
			// TODO Auto-generated method stub
			return (this.BrandName).compareTo(h.BrandName);
		}
		@Override
		public int compare(HDTV a, HDTV b) {
	
			return (int) (a.size - b.size);
		}
}

 class Two
{
	public static void main(String[] args) {
		
		ArrayList<HDTV> list = new ArrayList<HDTV>();
		
		list.add(new HDTV("Sony",41.4));
		list.add(new HDTV("Lenovo",32.6));
		list.add(new HDTV("Philips",42.6));
		
		Collections.sort(list);
		
		for(HDTV q : list)
		{
			System.out.println(q.getName() );
		}
		Collections.sort(list, new HDTV());
	      System.out.println(" ");
	      
	      for(HDTV w: list)   // printing the sorted list of ages
	         System.out.print(w.getName() +"  : "+ w.getSize() + ", ");
	}
}N