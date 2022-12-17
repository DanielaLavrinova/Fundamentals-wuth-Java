package companyRoster;

import java.util.List;

public class Department {
    private List<String> departmentList;

    public Department(List<String>departmentList){
        this.departmentList = departmentList;
    }

    public void setDepartmentList(List<String> departmentList) {
        this.departmentList = departmentList;
    }

    public List<String> getDepartmentList() {
        return this.departmentList;
    }

}
