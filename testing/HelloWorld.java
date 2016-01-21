import java.io.*;

public class HelloWorld {
	public static void main(String[] args){
		String name;
		BufferedReader reader;
		reader = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("What is your name?");
		try{
			name = reader.readLine();
			int i = 0;
			while (i < 3){
				System.out.println("Hello, Dr. " + name + " Would you like to play a game?");
				i++;
			}
		}
		catch(IOException ioe){
			System.out.println("ERROR. INSUFFICIENT DATA FOR MEANINGFUL ANSWER.");
		}
	}
}