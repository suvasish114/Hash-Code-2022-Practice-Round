package solution1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	private Customer customer = new Customer();
	public Solution(String ipFile, String opFile) {
		try {
			Scanner scanner = new Scanner(new File(ipFile));
			FileWriter fileWriter = new FileWriter(opFile);
			int C = Integer.parseInt(scanner.next());
			int L,D;
			scanner.nextLine();
			for(int i=0; i<C; i++) {
				L = Integer.parseInt(scanner.next());
				for(int j=0; j<L; j++) {
					customer.addLikes(scanner.next());
					
				}
				D = Integer.parseInt(scanner.next());
				for(int j=0; j<D; j++) {
					customer.addDislikes(scanner.next());
				}
			}
			scanner.close();
			customer.trimLikes();
			int N = customer.getLikes().size();
			fileWriter.write(String.valueOf(N));
			Iterator iterator = customer.getLikes().iterator();
			while(iterator.hasNext()) {
				fileWriter.write(" ");
				fileWriter.write(iterator.next().toString());
			}
			fileWriter.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
}
