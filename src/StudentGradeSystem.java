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
			
			 if (choice == 1) {
                System.out.print("Enter Student ID: ");
                String id = sc.nextLine();
                
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();
                
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                } 
				else {
                    studentList.add(new Student(id, name, marks));
                    System.out.println("Student added successfully!");
                }
                
            } 
			
			else if (choice == 2) {
                if (studentList.isEmpty()) {
                    System.out.println("No student records found.");
                } 
				else {
                    System.out.println(" ");
                    System.out.println("ID: \t\t\t Name: \t\t\t\t Marks: \t\tGrade: ");
                    System.out.println(" ");
                    for (Student s : studentList) {
                        s.displayStudentDetails();
                    }
                    System.out.println(" ");
                }
                
            }

			else if (choice == 3) {
                
                if (studentList.isEmpty()) {
                    System.out.println("No student records found.");
                } 
				else {
                    System.out.print("Enter Student ID to Search: ");
                    String searchId = sc.nextLine();
                    boolean found = false;
                    
                    for (Student s : studentList) {
                        if (s.getId().equalsIgnoreCase(searchId)) {
							System.out.println(" ");
                            System.out.println("Student Found:");
                            System.out.println("ID: " + s.getId());
                            System.out.println("Name: " + s.getName());
                            System.out.println("Marks: " + s.getMarks());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + searchId + " not found.");
                    }
                }
                
            }

				else if (choice == 4) {
                
                if (studentList.isEmpty()) {
                    System.out.println("No records to calculate average.");
                } 
				else {
                    double total = 0;
                    for (Student s : studentList) {
                        total += s.getMarks();
                    }
                    double average = total / studentList.size();
                    double roundedAverage = Math.round(average*100.0)/100.0;
                    System.out.println("Total Students: "+ studentList.size());
                    System.out.println("Average Mark of All Students: "+roundedAverage);
                }
                
            } 
			
			else if (choice == 5) {
                System.out.println("Exiting program. Progress saved!");
                break;
            } 
			else {
                System.out.println("Invalid choice! Please select 1-5.");
            }
		}
        sc.close();
    }
}