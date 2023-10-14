package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.entities.Canditate;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> totalVotes = new HashMap<String, Integer>();
			
			String line = br.readLine();
			
			while (line != null) {				
				String[] fields = line.split(",");
				
				if (totalVotes.containsKey(fields[0])) {
					int vote = totalVotes.get(fields[0]);
					int updatingVote = vote + Integer.parseInt(fields[1]);
					totalVotes.put(fields[0], updatingVote);
				} else {
					totalVotes.put(fields[0], Integer.parseInt(fields[1]));
				}
				
				line = br.readLine();
			}
			
			for (String v : totalVotes.keySet()) {
				System.out.println(v + ": " + totalVotes.get(v));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
