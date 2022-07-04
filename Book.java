
public class Book {

	private String bookName;
	private String isbnNum;
	private String authorName;
	private String pub;
	
	public Book(String bookName, String isbnNum, String authorName, String pub) {
		this.bookName   = bookName;
		this.isbnNum    = isbnNum;
		this.authorName = authorName;
		this.pub        = pub;
	}

	public String getBookInfo(){
		String info;
		info  = " Book Name  : "   +this.bookName;
		info += "\n ISBN Number: " +this.isbnNum;
		info += "\n Author Name: " +this.authorName;
		info += "\n Publisher  : " +this.pub;
		return info;
	}
	
	public void setName(String bookName){
		this.bookName = bookName;
	}
	
	public void setISBN(String isbnNum){
		this.isbnNum = isbnNum;
	}
	
	public void setAuthor(String authorName){
		this.authorName = authorName;
	}
	
	public void setPub(String publisher){
		this.pub = publisher;
	}
	
	public String getName(){
		return this.bookName;
	}
	
	public String getISBN(){
		return this.isbnNum;
	}
	
	public String getAuthor(){
		return this.authorName;
	}
	
	public String getPub(){
		return this.pub;
	}
}
