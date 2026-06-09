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
