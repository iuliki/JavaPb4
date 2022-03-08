package clasePb4;

public class Birou {
	Sertar S2= new Sertar(2,2,4);
	Sertar S3= new Sertar(7,7,9);
	
	private int L=0;
	private int l=0;
	private int h=0;
	
	public Birou(int L,int l,int h){
		setBirou(L,l,h);
		
	}
	public void PrintBirou() {
	System.out.println("Biroul are lungimea de : "+ L +"\n Latimea este: " + l +"\n Inaltimea este: " + h );
	}
	
	public void setBirou(int L,int l,int h) {
		this.L=L;
		this.l=l;
		this.h=h;
	}

}
