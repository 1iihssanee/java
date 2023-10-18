import java.util.Scanner;

public class DemoMatriz {

    public static void main(String[] args) {
    	Scanner entrada =new Scanner(System.in);
    	int matriz[][]=new int[3][3];
    	int aleatorio=0;
    	for (int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			aleatorio=(int)(Math.random()*1000);
    			matriz[i][j]=aleatorio;
    			System.out.println(matriz[i][j]);
    			
    		}
    	}
    	
    	/*for (int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			System.out.println(matriz[i][j]);
    			
    		}
    	}*/
    	
    	
    	//System.out.println();
    }
       
}