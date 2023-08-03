package com.velocity.miniproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class StudentQuiz  {
	public static Scanner input= new Scanner( System.in);

	public static int choose,choose1,choose2,choose3,choose4,choose5,choose6,choose7,choose8,choose9,choose10,count=0;
	public static String name,email;
	public static long mobile,password;
	public static int result;
	
	public static void StudentLoginAndRegister() {
		System.out.println("==================================================================================");
		
		System.out.println("Welcome to Quiz Based Application");
		System.out.println("User");
		System.out.println("1.-Student Registration");
		System.out.println("2.-Student Login");
		
		System.out.println("==================================================================================");
		
		choose=input.nextInt();
		if(choose==1) {
			
			System.out.println("Student  Name=");
			name=input.next();
			System.out.println("==============================================================================");
			
			System.out.println("Student E-mail id=");
			email=input.next();
			System.out.println("==============================================================================");
			
			System.out.println("Student Mobile number=");
			mobile=input.nextLong();
			System.out.println("==============================================================================");
			
			System.out.println("Student password=");
			password=input.nextLong();
			System.out.println("==============================================================================");
			
			
			System.out.println("Student Registration is Done!!!!!!!");
			
		} else if(choose == 2){
			System.out.println("=================================================================================");
			
			System.out.println("Student Name=");
			name=input.next();
			System.out.println("Student="+name);
			System.out.println("=================================================================================");
			
			System.out.println("Student Password=");
			password=input.nextLong();
			System.out.println("Password="+password);
			System.out.println("=================================================================================");
			
			
			System.out.println("Student login is Done!!!!!!!");
			
		}
	}
		public static void displayQuestion() {
			
			System.out.println("==================================================================================");
			
			System.out.println("Question List from Quiz");
			System.out.println("=================================================================================");
			
			System.out.println("question 1: Which of the following is not introduced with java 8 ?");
			System.out.println("1.Stream API");
			System.out.println("2.Serialization");
			System.out.println("3.Splitarator");
			System.out.println("4.Lamda Expression");
			choose1=input.nextInt();
		if (choose1==2) {
			System.out.println("your Answer is= Serialization ");
			System.out.println("Your answer is right"+count++);
			
		} else {
			System.out.println("Your answer is Wrong");
		}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 2: Which features of java 7 aliows to not explicitly close to resorces?");
			System.out.println("Try catch finally");
			System.out.println("IOExpression");
			System.out.println("Autoclosable");
			System.out.println("Streams");
			choose2=input.nextInt();
			if (choose2==2) {
				System.out.println("your Answer is= IOException ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 3: SessionFactory is a thread-safe object. ?");
			System.out.println("True");
			System.out.println("False");
			choose3=input.nextInt();
			if (choose3==1) {
				System.out.println("your Answer is= True ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}

			
			System.out.println("=================================================================================");
			
			System.out.println("question 4: Which is new method introduced in java 8 to iterate over a collection ?");
			System.out.println("for(String 1 : String(List)");
			System.out.println("foreach(String1 : String(List)");
			System.out.println("StringList.foreach()");
			System.out.println("List.for()");
			choose4=input.nextInt();
			if (choose4==3) {
				System.out.println("your Answer is= StringList.foreach() ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 5 : what is the substitute of Rhino javascript engine i n java 8 ?");
			System.out.println("Nashorn ");
			System.out.println("V8");
			System.out.println("Inscript");
			System.out.println("Narcissus");
			
			choose5=input.nextInt();
			if (choose5==1) {
				System.out.println("your Answer is= Nashorn ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 6: How to read Entire file in one line using java 8 ?");
			System.out.println("Files.readAllLines()");
			System.out.println("Files.read()");
			System.out.println("Files.readFile()");
			System.out.println("Files.lines()");
			choose6=input.nextInt();
			
			if (choose6==1) {
				System.out.println("your Answer is= Files.readAllLines() ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 7: which features of java 7 allows to not explicitly close IO resources ?");
			System.out.println("try catch finally");
			System.out.println("Autoclosable");
			System.out.println("IOException");
			System.out.println("Streams");
			choose7=input.nextInt();
			if (choose7==2) {
				System.out.println("your Answer is= Autoclosable ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 8: which of the following is not a core interface of hibernate ?");
			System.out.println("Configuration");
			System.out.println("Criteria");
			System.out.println("SessionManagement");
			System.out.println("Session");
			
			choose8=input.nextInt();
			if (choose8==3) {
				System.out.println("your Answer is= SessionManagement ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 9:  SessionFactory is a thread-safe object ?");
			System.out.println("True");
			System.out.println("false");
			System.out.println("Don't know");
			System.out.println("false");
			
			choose9=input.nextInt();
			if (choose9==1) {
				System.out.println("your Answer is= True ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
			System.out.println("=================================================================================");
			
			System.out.println("question 10:  Which of the following is not a state of object in Hibernate ?");
			System.out.println("Attached");
			System.out.println("Dettached");
			System.out.println("persistent");
			System.out.println("Transient");
			
			choose10=input.nextInt();
			if (choose10==1) {
				System.out.println("your Answer is= Attached ");
				System.out.println("Your answer is right"+count++);
			} else {
				System.out.println("Your answer is Wrong");
			}
			
				System.out.println("Total Result = "+count);
			
	
			System.out.println("==================================================================================");
			
		}
		
		public static void insertData() {
			try {
				String insertQuery = "insert into studentquizdata(studentName,result)"+" values('name','result')";
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
				Statement statement = con.createStatement();
				statement.execute(insertQuery);
				System.out.println("Insertion Done!!!!");
				statement.close();
				con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void displayresult() {
			
			System.out.println("Student Name "+name);
			System.out.println("Total Result = "+count);
		}
		public static void main(String[] args) {
		
           StudentQuiz.StudentLoginAndRegister();
           StudentQuiz.displayQuestion();
           StudentQuiz.insertData();
           StudentQuiz.displayresult();
	}

}
