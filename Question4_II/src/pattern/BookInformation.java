package pattern;

public class BookInformation {
	
	
	private String Author;
	private String Title;
    private String YearPublished;
    private String Summary;
    
    public BookInformation(String Author, String Title, String YearPublished, String Summary)
    {
    	this.Author = Author;
    	this.Title = Title;
    	this.YearPublished = YearPublished;
    	this.Summary = Summary;
    	
    }
    
    public String getAuthor()
    {
    	return Author;
    }
    
    public String getTitle()
    {
    	return Title;
    }
    
    public String getYearPublished()
    {
      return YearPublished;	
    }
    
    public String getSummary()
    {
    	return Summary;
    }
    
    
}
