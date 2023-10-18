import java.util.Scanner;

public class DemooMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int matriz[][]=new int[3][3];
		int aleatorio=0;
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				aleatorio=(int)(Math.random()*1000);
				matriz[x][y]=aleatorio;
			}
		}
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				System.out.println(matriz[x][y]);
			}
		}
	}

}
