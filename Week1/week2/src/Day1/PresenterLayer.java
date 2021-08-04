package Day1;
import java.nio.file.InvalidPathException;

import javax.imageio.IIOException;

public class PresenterLayer {

	public static void main(String[] args) throws IIOException {
		// TODO Auto-generated method stub
		BusinessLayer bl = new BusinessLayer();
		
		try {
			bl.isVaidAge(15);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessful!!");
		}
		
		System.out.println();
		
		try {
			bl.isValidPan("ABCE123");
		} catch (InvalidPathException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessful!!");
		}
		
	}

}

