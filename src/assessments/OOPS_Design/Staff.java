package assessments.OOPS_Design;

public class Staff {

   public int StaffAge;
    public String FirstName;
    public String LastName;
    public static int MaxAge=0;

    public Staff(int StaffAge,String FirstName,String LastName)
    {
        this.StaffAge=StaffAge;
        this.FirstName=FirstName;
        this.LastName=LastName;
        if(StaffAge>=MaxAge)
            this.MaxAge=StaffAge;
    }

    public int getStaffAge() {
        return StaffAge;
    }
    public String getStaffFirstName() {
        return FirstName;
    }
    public String getStaffLastName() {
        return LastName;
    }
}
