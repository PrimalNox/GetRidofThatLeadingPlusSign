import java.io.*;
import java.util.*;
import java.lang.Math;

public class InputNumData {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Scanner sf = new Scanner (new File("F:\\Workspace\\GetRidofThatLeadingPlusSign\\MyData.in"));
		int maxIndx = -1;
		String text[] = new String [1000];
		while(sf.hasNext()){
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		String answer = "";
		int sum;
		for(int j = 0; j <= maxIndx;j++){
			Scanner sc = new Scanner (text[j]);
			sum = 0;
			answer = "";
			while(sc.hasNext()){
				int i = sc.nextInt();
				if(sum ==0) {
					answer = answer + i;
					sum = sum + i;
				}
				else {
				answer = answer + " + " + i;
				sum = sum + i;
				}
			}
			answer = answer + " = " + sum;
			System.out.println(answer);
		}
	}

}
