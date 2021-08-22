package StudentDetails;

public class Students {

	public void getStudentInfo()
	{
		System.out.println("Please find the student details as below");
		
	}
	public void getStudentInfo(long ID)
	{
	
		System.out.println("The student ID is"+ID);
	}
	public void getStudentInfo(long id,String name)
			{
		
		System.out.println("The student id"+id);
		System.out.println("the student name is "+name);
		
			}
	public void getStudentInfo(String Email,long phonenumber)
	{
		System.out.println("The student Email ID is"+Email);
		System.out.println("The student phonenumber is"+phonenumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Students name = new Students();
    name.getStudentInfo();
    name.getStudentInfo(2345678L);
	name.getStudentInfo(6354632546325L, "Hema");
	name.getStudentInfo("shrimr.mr@gmail.com", 63457892L);
	
	
	}

}
