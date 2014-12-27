package perosnalInformation;

public class main {
    private String title;
    private String firstName;
    private String lastName;
    private String gender;
    private int dateOfBirth;
    private String nationality;
    private String occupation;
    
    
     public main (String title, String firstName, String lastName,
             String gender, int dateOfBirth, String nationality,String occupation){
        this.title=title;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.nationality=nationality;
        this.occupation=occupation;
        
    }
     
     public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getGender(){
        return gender;
    }
}
