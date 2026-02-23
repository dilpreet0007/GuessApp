import java.io.*;
public class StorageService{
	public static void saveResult(String player,int attempts,boolean win){
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("game_results.txt",true))){
			writer.write("Player: " + player + ", Attempts: " + attempts + ", Results : " + (win ? "win" : "lose"));
			writer.newLine();
		}catch(IOException e){
			System.out.println("Unable to save game results.");
		}
	}
}