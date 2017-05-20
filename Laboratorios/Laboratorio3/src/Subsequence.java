import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Subsequence {

	public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException { 
String dato = "dato.txt";
String dato2 = "dato2.txt";

BufferedReader fileIn = new BufferedReader( new FileReader (dato));
PrintWriter fileOut = new PrintWriter( new FileWriter (dato2));
laSecuencia(fileIn,fileOut);
	}
	
	public static void laSecuencia(BufferedReader fileIn,PrintWriter fileOut) throws IOException { 
		String dato="";
		int contacorta=0;
		int contacorta2=0;
		
	while((dato=fileIn.readLine())!=null){
		String []cortado=dato.split(" ");
		contacorta=0;
		boolean verdadero=false;
	    contacorta2=0;

		
for(int contador=0;((cortado[0].length()-1)>=contador)&&verdadero==false;contador++){
			
			if(cortado[0].charAt(contador)==cortado[1].charAt(contacorta)){
				contacorta++;}
			
			if(cortado[0].charAt(cortado[0].length()-contador-1)==cortado[1].charAt(contacorta2)){
				contacorta2++;}

			if((contacorta==cortado[1].length())||(contacorta2==cortado[1].length())){
				verdadero=true;}
		
	}
			
		if(verdadero){
			System.out.println(cortado[1]+" SI es una subsecuencia de "+cortado[0]);
		fileOut.println(cortado[1]+" SI es una subsecuencia de "+cortado[0]);}
		else
			System.out.println(cortado[1]+" NO es una subsecuencia de "+cortado[0]);
		fileOut.println(cortado[1]+" NO es una subsecuencia de "+cortado[0]);
	}	
	fileOut.close();
	}
}




