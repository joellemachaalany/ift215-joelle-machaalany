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
    
    public void setGender(String gender){
        this.gender=gender;
    }
    
    public String getNationality(){
        return nationality;
    }
    
    public void setNationality(String nationality){
       this.nationality=nationality;
    }
    
    public String getOccupation(){
        return occupation;
    }
    
    public void setOccupation(String occupation){
        this.occupation=occupation;
    }
    
    public String getGen(){
        int gen;
         if(title=="Male"){
             
         }  
          
        return gen;
    }
    
    public String getPersonalInformation(){
        String personalInformation;
        
        personalInformation="Hi," + "/n I am "+ title + " "+ firstName + " " +lastName
                +"." + "/n I am a "+ getAge()+ " years old " + getGen()+ " from " + 
                nationality + "." + "/n I work as a " + occupation ;
        return personalInformation;
  
    }
}
