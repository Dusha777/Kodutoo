package pak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class proov {
    public static int m_seis=0;
    public static int d_seis=0;

    public static Kaardipak minu=new Kaardipak();
	public static void main(String[] args) {
		minu.segamine();
		minu.naitaSeis();
		System.out.println("------------Kaardid segatud. Mäng stardib--------- ");
		juht(0);
		juht(0);
		juht(1);
		
	}
	
	public static void juht(int kes){ //1-mangija 0-diller
		
       
       if(kes==1) mangijaKalkulaator (minu.kaartValja());
       else dillerjaKalkulaator(minu.kaartValja());
		
	}
	
	public static void dillerjaKalkulaator(int[] kaart){
		String kaart_str="";
		//System.out.println(Integer.toString(kaart[0])+"-"+Integer.toString(kaart[1]));
		if(kaart[1]>10 ){
			 if (kaart[1]==14){
				 d_seis+=11; 
				 kaart_str="Äss";
				 
			 }
			 else {
				 d_seis+=10;
				 if(kaart[1]==11)kaart_str="Pois";
				 else if(kaart[1]==12)kaart_str="Emand";
				 else kaart_str="Kuningas";
			 }
		 } 
		 else{
			d_seis+=kaart[1];
			kaart_str=Integer.toString(kaart[1]);
		 }
		System.out.println("Dilleri kaart on - "+kaart_str);
		System.out.println("Dilleri Punktid kokku - "+Integer.toString(d_seis));
		if(d_seis>m_seis && d_seis<22 && m_seis!=0) System.out.println(Integer.toString(d_seis)+" - "+Integer.toString(m_seis)+"//Dilleri võit");
		else if(d_seis>21)System.out.println(Integer.toString(d_seis)+" - "+Integer.toString(m_seis)+"//Mangija vöit");
		else if(d_seis==m_seis && d_seis<17) juht(0);
		else if(d_seis==m_seis && d_seis>16) System.out.println(Integer.toString(d_seis)+" - "+Integer.toString(m_seis)+"//Viik");
		else if(m_seis!=0) juht(0);
		  
	}
	public static void mangijaKalkulaator(int[] kaart){
		String kaart_str="";
		//System.out.println(Integer.toString(kaart[0])+"-"+Integer.toString(kaart[1]));
		if(kaart[1]>10 ){
			 if (kaart[1]==14){
				 m_seis+=11; 
				 kaart_str="Äss";
				 
			 }
			 else {
				 m_seis+=10;
				 if(kaart[1]==11)kaart_str="Pois";
				 else if(kaart[1]==12)kaart_str="Emand";
				 else kaart_str="Kuningas";
			 }
		 } 
		 else{
			m_seis+=kaart[1];
			kaart_str=Integer.toString(kaart[1]);
		 }
		System.out.println("Teie kaart on - "+kaart_str);
		System.out.println("Punktid kokku - "+Integer.toString(m_seis));
		if(m_seis>21)System.out.println("Ülevõtt :(. Dilleri võit");
		else comunicator();
		  
	}
	
	public static void comunicator(){
		int vastus; // 1-veel kaart, 0-endale
		try {
        	System.out.println("Soovite veel kaart? 1-jah 0-aitab");
        	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            vastus = Integer.valueOf(in.readLine());
            if (vastus==0) {
            	juht(0);
			}
            else juht(1);
            
         } catch  (IOException e) {
            System.out.println("Midagi valesti");
         }
	}
		


}
