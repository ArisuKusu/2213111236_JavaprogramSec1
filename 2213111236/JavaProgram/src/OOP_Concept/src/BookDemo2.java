import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String authorname = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author e-mail: ");
		
		String BookTitle = JOptionPane.showInputDialog("Input book title: ");
		int Bookpages = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		int confirm = JOptionPane.showConfirmDialog(null,"IS the page correct?", "Confirm",0);
		while(confirm == 1) {
			Bookpages = Integer.parseInt(JOptionPane.showInputDialog("input book page"));
			confirm = JOptionPane.showConfirmDialog(null,"IS the page correct?", "Confirm",0);
		}
		Book book = new Book(BookTitle,new Author(authorname,email),Bookpages);
		JOptionPane.showMessageDialog(null, "Book title: "+ book.getTitle()+
				                      "\nAuthor name: "+ book.getAuthor().getName()+" ("+book.getPage()
				                      +"/"+"\nAuthor e-mail: "+ book.getAuthor().getemail());
		
		
	}

}
