package pattern;
import java.util.*;

// sorting - reference from https://stackoverflow.com/questions/708698/how-can-i-sort-a-list-alphabetically

public class SortBook {
	
	String field_to_sort;
	
	public SortBook(String field_to_sort)
	{
		this.field_to_sort = field_to_sort;
	}
	
	public List<BookInformation> SortBook(List<BookInformation> listofbooks)
	{
		
		if(field_to_sort == "Author")
		{ 
			Collections.sort(listofbooks, new Comparator() {
				public int compare(Object book1, Object book2) 
				{
				return ((BookInformation)book1).getAuthor().compareTo(((BookInformation)book2).getAuthor());
				}
				}); 
			
			 
			return listofbooks;
		}
		else if(field_to_sort == "YearPublished")
		{
			Collections.sort(listofbooks, new Comparator() {
				public int compare(Object book1, Object book2) 
				{
				return ((BookInformation)book1).getYearPublished().compareTo(((BookInformation)book2).getYearPublished());
				}
				}); 
			
           
			return listofbooks;
			
		}
		else if (field_to_sort == "Title")
		{
			Collections.sort(listofbooks, new Comparator() {
				public int compare(Object book1, Object book2) 
				{
				return ((BookInformation)book1).getTitle().compareTo(((BookInformation)book2).getTitle());
				}
				}); 
			
            return listofbooks;
		}
		else
		{
			
		return listofbooks;
	}}
}
