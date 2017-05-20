import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Arne {

	public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
		public static void main(String[] args) throws IOException{
			
			System.out.println("Cantidad de líneas? ");
			int x = Integer.parseInt(entrada.readLine());
			System.out.println("Teclea las líneas del mensaje:");
			String []y = new String [x];
			for(int k=0;k<x;k++){
			y[k]=entrada.readLine();
			}
			
			decodifica(y);
		}
		

		public static void decodifica(String []s){
			
			String nuevo="";
			int contamenos=0;
			int longitud=s[0].length()-1;
			
			for(int c=s[0].length()-1;c>=0;c--){

			for(int r=s.length-1;r>=0;r--){
				
				if(s[r].charAt(longitud-contamenos)=='_')
					nuevo+=" ";
				
				else if (s[r].charAt(longitud-contamenos)=='\\') 
					nuevo+="\n";
				
				else
				nuevo+=s[r].charAt(longitud-contamenos);
			}
			contamenos++;
		}
			System.out.println("El mensaje descifrado es: \n"+nuevo);

		}
		
		
		
		
}
