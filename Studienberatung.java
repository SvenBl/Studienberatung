import java.util.*;

public class Studienberatung(){
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String answer = scanner.next();
		
		if(answer.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			String answer = scanner.next();
			if(answer.equalsIgnoreCase("n")){}
			else{
			}
			
			
		}
		else{
			System.out.println("Bist du wissbegierig?");
			String answer = scanner.next();
			if(answer.equalsIgnoreCase("n")){}
			else{
			}
		}
		
	}
}