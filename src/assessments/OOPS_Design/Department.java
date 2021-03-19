package assessments.OOPS_Design;

import java.util.List;

public interface Department {

    public Library setLibrary();
    public void setMusicRoom();
    public void setLabRoom();
    public Staff getEldestStaffDetails(List<Staff> staff);

}
