public class Students{
	String name;
	int UID;
	
	public Students(String name, int UID) {
		this.name = name;
		this.UID = UID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return UID;
	}
	
	 public String toString() {
	        // Use StringBuilder for efficient string concatenation, especially for complex outputs
	        StringBuilder sb = new StringBuilder();
	        sb.append("").append(UID);
	        sb.append(" ").append(name);
	        return sb.toString();
	    }
	
	
	/*public void addMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("English : ");
		this.marks[0] = sc.nextInt();
		System.out.println("Maths : ");
		this.marks[1] = sc.nextInt();
		System.out.println("Chemisty : ");
		this.marks[2] = sc.nextInt();
		System.out.println("Biology : ");
		this.marks[3] = sc.nextInt();
		System.out.println("Physics : ");
		this.marks[4] = sc.nextInt();
	}*/
}
