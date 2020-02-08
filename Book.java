 /**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Angelina A Joy)
 * @version (2/06/2020)
 */
 public class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;  // 2.85 adds number of pages 
    private String refNumber;
    private int borrowed; // 2.91 adds borrowed int field to the book class 
    private boolean courseText; //adds courseText field for 2.92 requirement
 

    /**
     * Set the author and title fields when this object
     * is constructed.
     * Includes author, title, and pages for the constructor required for 2.85
     */
    public Book(String bookAuthor, String bookTitle, int numPages, boolean courseText)
    {
    author= bookAuthor;
    title = bookTitle; 
    pages = numPages;
    refNumber = "";     // initilize refNumber in constructor to satisfy 2.88 
       
    }
    
    // default constructor 
    public Book(int borrow)
    {
     author = "";
     title = ""; 
     pages = 0;
     courseText = false; 
     borrowed = borrow; 
    }
    // getPages method returns number of pages Required for 2.85
    // return pages field
    
    public int getPages()
    {   
        return pages;
    }
    
    
    //getTitle method returns title, satisfies 2.83 Requirement for creating accessors for the String fields
    
    public String getTitle()
    { 
        return title;
    }
    
    //getAuthor method returns author, satisfies 2.83 Requirement for creating accessors for the String fields 
    
    public String getAuthor()
    {
        return author;   
    }
    
    //printAuthor method prints author String field, Requirement for 2.84 
    public void printAuthor()
    { 
        System.out.println("Author:" + author);
    } 
    
    //printTitle method prints title String field, requirement for 2.84
    public void printTitle()
    { 
     System.out.println("Title: " + title); 
    }
    
    // getRefNumber returns refNumber field for 2.88
    public String getRefNumber()
    {
       return refNumber;
    }
     
    // setRefNumber is a mutator for 2.88
    public void setRefNumber(String ref)
    {
       
       if(ref.length() >=3) 
         refNumber = ref; 
            else 
                System.out.println("Error");
     
    }
    
    /// 2.91 accessor for Borrowed. Returns borrowed.
    
    public int getBorrowed()
    {
        return borrowed;
    } 
    
    /// 2.91 mutator for getBorrowed/ borrowed field. Incrimates borrow by 1 
    
    public void borrow() 
    {
         borrowed+=1; 
        
    }
    

    /// satisfies requiremnet for 2.87 printDetails method prints title, author and pages. 
    /// details modified for 2.88 to print reference number, 
    /// and should print reference number if refrence number has been set.
    public void printDetails() 
    {
       System.out.print("Title: " + title);
       System.out.print(" Author: " + author);
       System.out.print(" Pages: " + pages);
       
       if(refNumber.length() == 0)
           System.out.print(", Ref Number: ZZZ");
           else 
           System.out.print(", Ref Number: " + refNumber);
           
          System.out.print(" Times borrowed: " + borrowed);
       
    }
    /// 2.92 accessor method for the isCourseText field 
    public boolean isCourseText()
    {
        return courseText;
    }
    
}
