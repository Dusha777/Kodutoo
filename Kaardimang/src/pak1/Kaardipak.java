package pak1;
import java.util.ArrayList;
import java.util.Random;

public class Kaardipak {
	
	public ArrayList<int[]>  kaardipakiSeis=new ArrayList<int[]>(); 
	// 1-�rtu,2-risti,3-poti,4-rutu//6-6,....11-soldat....
	
	public Kaardipak(){
		
	for(int i=0;i<4;i++){
		
		for (int y=1;y<14;y++){
		  /*  int[] c=new int[2];
		    c[0]=i+1;
		    c[1]=y+1;*/
			this.kaardipakiSeis.add(new int[]{i+1, y+1});
		}
		
		
	   }
	}
	
	public void segamine (){
		Random random = new Random() ;
		for (int i=0;i<7000;i++){
	        int koht1 = random.nextInt(36);
	        int koht2 = random.nextInt(36);
	        int[] buf=new int[2];
	        if(koht1!=koht2){
	        	buf=this.kaardipakiSeis.get(koht1);
	        	this.kaardipakiSeis.set(koht1, this.kaardipakiSeis.get(koht2));
	        	this.kaardipakiSeis.set(koht2, buf);
	        }
			
			
		}
		
		
	}
	
	public int[] kaartValja(){
		
		int[] valja=new int[2];
		valja=kaardipakiSeis.get(0) ;
		//System.out.print(Integer.toString(kaardipakiSeis.get(0)[0])+"-"+Integer.toString(kaardipakiSeis.get(0)[1]));
		kaardipakiSeis.remove(0);
		return valja;
		
	}
	
	
	public void naitaSeis(){
		for (int i=0;i<kaardipakiSeis.size();i++){
			
			System.out.print(Integer.toString(kaardipakiSeis.get(i)[0]));
			
			System.out.println("-"+Integer.toString(kaardipakiSeis.get(i)[1]));
		}
	}
	 
}

