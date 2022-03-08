package clasePb4;

public class Sertar {
	private int L=0;
	private int l=0;
	private int h=0;
	
	public Sertar(int L,int l,int h) {
		setSertar(L,l,h);
		//PrintSertar();
	}
	
	public  void PrintSertar() {
		System.out.println("Sertar: " + L +" " + l +" " + h );
	}
	
	/*@Override
	public String toString() {
		return "Sertar [L=" + L + ", l=" + l + ", h=" + h + "]";
	}*/

	public void setSertar(int L,int l,int h) {
		this.L=L;
		this.l=l;
		this.h=h;
	}
	

}
