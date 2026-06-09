class Student {
    private String id;
    private String name;
    private double marks;
	
    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId(){
		return id;
	}
    public String getName(){
		return name;
	}
    public double getMarks(){
		return marks;
	}
	public String calculateGrade(){
        if (marks >= 75){		
			return "A";
		}
        else if (marks >= 65){
			return "B";
		}
        else if (marks >= 55){
			return "C";
		}
        else if (marks >= 35){
			return "S";
		}
        else{ 
			return "F";
		}
    }

    public void displayStudentDetails() {
        System.out.println(id + " \t\t " + name + " \t\t "+marks+"\t\t\t"+calculateGrade());
    }
}
public class StudentGradeSystem {
    public static void main(String args[]) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("=== Student Grade Management System ===");
        
        while (true) {
			System.out.println(" ");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Display Average Mark");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = sc.nextInt();
            sc.nextLine();
		}
        sc.close();
    }
}