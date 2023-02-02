
import javax.swing.*;

public class TestInformation {

	public static void main(String[] args) {

		String author = JOptionPane.showInputDialog("Input author name");
		String email = JOptionPane.showInputDialog("Input author e-mail");
		String bookTitle = JOptionPane.showInputDialog("Input book title");


		int emailConfirmation = JOptionPane.showConfirmDialog(null, "Do you confirm your e-mail?" , "Confirm" , 0);

		if (emailConfirmation == 1) {

			email = JOptionPane.showInputDialog("Input author e-mail");
		}

		BookNew book = new BookNew(bookTitle , new Author(author,email) , 0);

		JOptionPane.showMessageDialog(null, "Book Title:" + book.getTitle() +"\nAuthor name:" + book.getAuthor().getName() +
				"\nAuthor e-mail:" + book.getAuthor().getEmail()
		);


	}
}

