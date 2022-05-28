package week4;

public class studentinfo {
	public void getstudentInfo(int studentid) {
		System.out.println("studentid="+studentid);
	}
	public void getstudentInfo(int studentid,String studentname) {
		System.out.println("studentid="+studentid+"stdentname="+studentname);
	}
	public void getstudentInfo(String email,long phonenumber) { 
		System.out.println("email="+email+"phonenumber="+phonenumber);
	}
	public static void main(String[] args) {
		
	
	studentinfo obj=new studentinfo();
	obj.getstudentInfo(375687);
	obj.getstudentInfo(375687,"babu");
	obj.getstudentInfo("hjdvjssgj@gmail.com", 3477178318l);
	
	}
}
