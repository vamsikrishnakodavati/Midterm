package pattern;

import java.util.*;

public class BookLibrarian {

	
	List<BookInformation> listofbooks = new ArrayList<BookInformation>();
	private SortBook sortbook;
	
	public BookLibrarian()
	{}
	
	public void Set_Sortbook(SortBook sortbook)
	{
		this.sortbook = sortbook;
	}
	
	public void AddBook(BookInformation book)
	{
		
		listofbooks.add(book);
	}
	
	public void printList()
	{  List<BookInformation> sortlist;
		if(sortbook == null)
		{
			sortlist = listofbooks;
			
		}
		else
		{
			sortlist = sortbook.SortBook(listofbooks);
		}	
		
		for(BookInformation book: sortlist)
		{
			System.out.println("Author        :   " + book.getAuthor());
			System.out.println("Title         :   " + book.getTitle());
			System.out.println("YearPublished :   " + book.getYearPublished());
			System.out.println("Summary       :   " + book.getSummary());
			System.out.println("\n");
		}
		
		
		
	}
	
	
}
