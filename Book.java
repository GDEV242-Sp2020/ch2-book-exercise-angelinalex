 /**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Angelina A Joy)
 * @version (2/06/2020)
 */
 class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber= "";
    private int borrowed; 
    private boolean courseText;
   

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String refNumber, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        
        courseText = false;
        
        
        
    }
    
    // getPages method returns number of pages
    // return pages field
    
    public int getPages()
    { 
        return pages;
    }
    
    
    //getTitle method returns title 
    public String getTitle()
    { 
        return title;
    }
    
    public String getAuthor()
    {
        return author;   
    }
    
    public String getRefNumber()
    {
       return refNumber;
    }
     
    
    public void setRefNumber(String ref)
    {
       refNumber = ref; 
       if(ref.length() >=3) 
       refNumber = ref;
            else 
                System.out.println("Error input value!!!");
     
    }
    
    
    public int getBorrowed()
    {
        return borrowed;
    } 
    
    public void setBorrowed()
    { 
       borrowed+=1; 
 
    }
    
    public void printAuthor()
    {
        System.out.println("Author:" + author);
    }
 
    public void printTitle()
    {
        System.out.println("Title:" + title);
    }
    
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
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
}
