import java.util.Scanner;

public class StudentsGradesAnalysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flag = 1;
		
		String input = "";
		
		int totalStudents = 0;
		
		int temp = 1;
		
		Object[][] studentsArray = new Object[1000][6];
		
		studentsArray[0][0] = "UID(Name)";
		studentsArray[0][1] = "E";
		studentsArray[0][2] = "M";
		studentsArray[0][3] = "C";
		studentsArray[0][4] = "B";
		studentsArray[0][5] = "P";
		
		do {
			System.out.println("Students Grade Analysis System(students limit 1000)");
			System.out.println("Add Students[1]   Show Grades[2]   Class Average[3]");
			System.out.println("English Average[EA]   English Highest[EH]");
			System.out.println("Maths Average[MA]     Maths Highest[MH]");
			System.out.println("Chemistry Average[CA] English Highest[CH]");
			System.out.println("Biology Average[BA]   Biology Highest[BH]");
			System.out.println("Physics Average[PA]   Physics Highest[PH]");
			System.out.println("Close[0]");
			
			
			input = sc.nextLine();
			
			
			if(input.equals("0")) {
				flag = 0;
			}
			
			if(flag == 0) {
				break;
			}
			
			switch(input) {
			case "1":
				System.out.println("Number of students to be added : ");
				
				int n = sc.nextInt();
				
				totalStudents = totalStudents + n;
				
				for(int i = temp; i <= totalStudents; i++) {
					System.out.println("Enter name : ");
					String name = sc.next();
					System.out.println("Enter UID : ");
					int UID = sc.nextInt();
				
					
				
					System.out.println("English : ");
					int english = sc.nextInt();
					System.out.println("Maths : ");
					int maths = sc.nextInt();
					System.out.println("Chemisty : ");
					int chemistry = sc.nextInt();
					System.out.println("Biology : ");
					int biology = sc.nextInt();
					System.out.println("Physics : ");
					int physics = sc.nextInt();
					
					Students student = new Students(name, UID);
				
					
					studentsArray[i][0] = student;
					
					studentsArray[i][1] = english;
					studentsArray[i][2] = maths;
					studentsArray[i][3] = chemistry;
					studentsArray[i][4] = biology;
					studentsArray[i][5] = physics;
					
					temp = temp + n;
				}
				
				
				
				
				
				sc.nextLine();
				
				break;
				
			case "2":
				System.out.println("Total Students: " + totalStudents);
				int number = sc.nextInt();
				printGrades(number, studentsArray);
				sc.nextLine();
				continue;
			
			case "3":
				classAvg(totalStudents, studentsArray);
			
				
				
			case "EA":
				englishAvg(totalStudents, studentsArray);
				
			case "EH":
				highestEnglish(totalStudents, studentsArray);
				
			case "MA":
				mathsAvg(totalStudents, studentsArray);
				
			case "MH":
				highestMaths(totalStudents, studentsArray);
				
				
			case "CA":
				chemAvg(totalStudents, studentsArray);
				
			case "CH":
				highestChem(totalStudents, studentsArray);
				
				
			case "BA":
				bioAvg(totalStudents, studentsArray);
				
			case "BH":
				highestBio(totalStudents, studentsArray);
				
				
			case "PA":
				phyAvg(totalStudents, studentsArray);
				
			case "PH":
				highestPhy(totalStudents, studentsArray);
				
			}	
		} while(flag == 1);
		
		}
	
	
	public static void printGrades(int nos, Object[][] arr) {
		for(int k = 0; k <= nos; k++) {
			for(int l = 0; l < 6; l++) {
			
				System.out.print(arr[k][l] + "     ");
			}
			System.out.println("");
		}
	}
	
	
	public static void englishAvg(int num, Object[][] arr) {
		int sum = 0;
		for(int x = 1; x <= num; x++) {
			sum  = sum + ((Integer) arr[x][1]).intValue();
		}
		int avg = sum / num;
		
		System.out.println(avg);
		
	}
	
	public static void mathsAvg(int num, Object[][] arr) {
		int sum = 0;
		for(int x = 1; x <= num; x++) {
			sum  = sum + ((Integer) arr[x][2]).intValue();
		}
		int avg = sum / num;
		
		System.out.println(avg);
		
	}
	
	public static void chemAvg(int num, Object[][] arr) {
		int sum = 0;
		for(int x = 1; x <= num; x++) {
			sum  = sum + ((Integer) arr[x][3]).intValue();
		}
		int avg = sum / num;
		
		System.out.println(avg);
		
	}
	
	public static void bioAvg(int num, Object[][] arr) {
		int sum = 0;
		for(int x = 1; x <= num; x++) {
			sum  = sum + ((Integer) arr[x][4]).intValue();
		}
		int avg = sum / num;
		
		System.out.println(avg);
		
	}
	
	public static void phyAvg(int num, Object[][] arr) {
		int sum = 0;
		for(int x = 1; x <= num; x++) {
			sum  = sum + ((Integer) arr[x][5]).intValue();
		}
		int avg = sum / num;
		
		System.out.println(avg);
		
	}
	
	
	public static void classAvg(int num, Object[][] arr) {
		int sum = 0;
		for(int x = 1; x <= num; x++) {
			for(int y = 1; y < 6; y++) {
				sum  = sum + ((Integer) arr[x][y]).intValue();	
			}
		}
		int avg = sum / (num * 5);
		
		System.out.println(avg);
		
	}
	
	public static void studentAvg(int num, Object[][] arr, int uid) {
		int sum = 0;
		int target = 0;
		for(int x = 0; x <= num; x++) {
			if(uid == ((Integer) arr[x][0]).intValue());
				target = x;
		}
		
		for(int y = 1; y <= num; y++) {
			sum  = sum + ((Integer) arr[y][target]).intValue();
		}
		int avg = sum / 5;
		System.out.println(avg);	
	}
	
	
	public static void studentTotal(int num, Object[][] arr, int uid) {
		int sum = 0;
		int target = 0;
		for(int x = 0; x <= num; x++) {
			if(uid == ((Integer) arr[x][0]).intValue());
				target = x;
		}
		
		for(int y = 1; y <= num; y++) {
			sum  = sum + ((Integer) arr[y][target]).intValue();
		}
		System.out.println(sum);	
	}
	
	
	public static void highestEnglish(int num, Object[][] arr) {
		int highest = 0;
		for(int x = 1; x <= num; x++) {
			if(highest <= ((Integer) arr[x][1]).intValue()) {
				highest = ((Integer) arr[x][1]).intValue();
			}
			else {
				continue;
			}
		}	
		System.out.println(highest);
		
	}
	
	public static void highestMaths(int num, Object[][] arr) {
		int highest = 0;
		for(int x = 1; x <= num; x++) {
			if(highest <= ((Integer) arr[x][2]).intValue()) {
				highest = ((Integer) arr[x][2]).intValue();
			}
			else {
				continue;
			}
		}	
		System.out.println(highest);
		
	}
	
	
	public static void highestChem(int num, Object[][] arr) {
		int highest = 0;
		for(int x = 1; x <= num; x++) {
			if(highest <= ((Integer) arr[x][3]).intValue()) {
				highest = ((Integer) arr[x][3]).intValue();
			}
			else {
				continue;
			}
		}	
		System.out.println(highest);
		
	}
	
	
	public static void highestBio(int num, Object[][] arr) {
		int highest = 0;
		for(int x = 1; x <= num; x++) {
			if(highest <= ((Integer) arr[x][4]).intValue()) {
				highest = ((Integer) arr[x][4]).intValue();
			}
			else {
				continue;
			}
		}	
		System.out.println(highest);
		
	}
	
	
	public static void highestPhy(int num, Object[][] arr) {
		int highest = 0;
		for(int x = 1; x <= num; x++) {
			if(highest <= ((Integer) arr[x][5]).intValue()) {
				highest = ((Integer) arr[x][5]).intValue();
			}
			else {
				continue;
			}
		}	
		System.out.println(highest);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
