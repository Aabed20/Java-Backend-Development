package array;

record Course(Integer id, String name,Double fee) 
  {
	 
	@Override
	public String toString()
	{
		return id+" : "+name+" : "+fee;
	}
  }

record Offer(String offerText) 
  {
	
	@Override 
	public String toString()
	{
		return offerText;
	}
  }

record EducationInstitute(Course[] courses,Offer[] offers) 
 {
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		int count=0;
		for(int i=0; i<courses.length; i++)
		{
			if(courseId==courses[i].id())
			{
				count++;
				IO.println(studentName+" enrolled in: "+courses[i].name());
				break;
			}
		}
		if(count==0)
		{
			System.err.println("Course with ID "+courseId+" not found.");
		}
	}
	@Override
	public String toString()
	{
		return courses[0].toString()+"\n"+courses[1].toString()+"\n"+courses[2].toString();
	}
    public String viewOffers()
    {
    	return offers[0].toString()+"\n"+offers[1].toString();
    }

 }

record Student(String name, EducationInstitute institute)
{
	
	public void viewCoursesAndFees()
	{
			IO.println(institute.toString());
	}
	
	public void viewOffers()
	{
		IO.println(institute.viewOffers());
	}
	
	public void enrollInCourse(Integer courseId)
	{
		institute.enrollStudentInCourse(courseId, name);
	}
	
}


public class StudentEnrollmentProcess 
{
	public static void main(String[] args)
	{
		
		Course[] courses= new Course[3];
		courses [0] = new Course(1, "Java",35000d);
		courses [1] = new Course(2, ".Net", 30000d);
		courses [2] = new Course(3, "Python", 32000d);
		
		String offer1 = "Special discount: Get 20% off on all courses!";
		String offer2 = "Limited time offer: Enroll in any two courses and get one course free!";

		Offer []offers = new Offer[2];
		offers [0] = new Offer(offer1);
		offers [1] = new Offer(offer2);
		
		
		EducationInstitute education = new EducationInstitute(courses, offers);
		
		
		String studentName = IO.readln("Enter student name: ");
		Student student1 = new Student(studentName, education);
		
		student1.viewCoursesAndFees();
		student1.viewOffers();
		
		Integer courseId = Integer.valueOf(IO.readln("Enter course ID to enroll :"));
		
		student1.enrollInCourse(courseId);
	}

}











