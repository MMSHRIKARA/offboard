package col;

public class Student {

	 

    private int sId;

 

    private String sName;

 

    private long sRollNumber;

 

    public int getsId() {
        return sId;
    }

 

    public void setsId(int sId) {
        this.sId = sId;
    }

 

    public String getsName() {
        return sName;
    }

 

    public void setsName(String sName) {
        this.sName = sName;
    }

 

    public long getsRollNumber() {
        return sRollNumber;
    }

 

    public void setsRollNumber(long sRollNumber) {
        this.sRollNumber = sRollNumber;
    }

 

    public Student(int sId, String sName, long sRollNumber) {
        super();
        this.sId = sId;
        this.sName = sName;
        this.sRollNumber = sRollNumber;
    }

 

    public Student() {
        super();
    }

 

    @Override
    public String toString() {
        return "Student [sId=" + sId + ", sName=" + sName + ", sRollNumber=" + sRollNumber + "]";
    }

 

}