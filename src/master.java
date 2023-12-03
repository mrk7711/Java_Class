import java.util.Scanner;
// in the next lines we introduce student class with 3 features: name, ID and Grade.
class student{
	int ID;
	int Grade;
	String Name;
	void insertRecord(int ID,int Grade, String name){  
		  this.ID=ID;  
		  this.Name=name;  
		  this.Grade=Grade;
		 } 
	
//	in the next lines we introduce a method for the student class and in this method we show all of the students that registered till now!
	void Show_user_info()
	{
		System.out.print("Name:");
		System.out.print(this.Name);
		System.out.print("\tID:");
		System.out.print(this.ID);
		System.out.print("\t\tGrade:");
		System.out.println(this.Grade);
	}
}


public class master {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int j=3;
//			in the next lines we introduce 3 objects from student class and i fill the features by myself.
//			we made array that the members are object of student class.
			student[] arr2=new student[100];
			student s1=new student();
			student s2=new student();
			student s3=new student();
			s1.Name="Kimia";
			s1.Grade=20;
			s1.ID=400;
			arr2[0]=s1;
			s2.Name="Mobina";
			s2.Grade=18;
			s2.ID=500;
			arr2[1]=s2;
			s3.Name="Sara";
			s3.Grade=14;
			s3.ID=600;
			arr2[2]=s3;
//			Here we made our menu with 4 options
//			if user press 1: we can register a new student and save his or her feature in the array.
//			if user press 2: we can search our students by the ID and show the array index.
//			if user press 3: we can show a student feature by giving his or her ID and show other features as well.
//			if user press 4: we can show all of the students that registered in our school till now. 
			System.out.println("Welcome......");
			while(true)
			{
			System.out.println("For Register Please Press 1......");
			System.out.println("For Searching User Please Press 2......");
			System.out.println("Showing Your Information Please Press 3......");
			System.out.println("Showing All Registered Students Please Press 4......");
			Scanner input=new Scanner(System.in);
			int input2=input.nextInt();
			
			switch(input2)
			{
			case 1:
				student s4=new student();
				Scanner n=new Scanner(System.in);
				Scanner i=new Scanner(System.in);
				Scanner g=new Scanner(System.in);
				System.out.println("Please enter your Name");
				String ne=n.next();
				System.out.println("Please enter your ID");
				int id=i.nextInt();
				System.out.println("Please enter your Grade");
				int gr=g.nextInt();
				s4.insertRecord(id, gr,ne);
				System.out.println("Information Registered!");
				System.out.print("A new student:\t");
				System.out.print(s4.Name);
				System.out.print("\t\tID:");
				System.out.print(s4.ID);
				System.out.print("\t\tGrade:");
				System.out.println(s4.Grade);
				System.out.println("Thank you !!!!");
				
				arr2[j]=s4;
				j=j+1;
				break;
			case 2:
				Scanner g3=new Scanner(System.in);
				System.out.println("Please enter your ID");
				int gr3=g3.nextInt();
				for(int x=0;x<j;x++)
					if(arr2[x].ID==gr3)
					{
						System.out.print("Your Index is \t");
						System.out.println(x);
						break;
					}
						else
						{
							if(x==j-1)
							{
								if(arr2[j-1].ID !=gr3)
								{
									System.out.println("No User Found!");
								}
							}
						}
				break;
			case 3:
				Scanner g2=new Scanner(System.in);
				System.out.println("Please enter your ID");
				int gr2=g2.nextInt();
					for(int x=0;x<j;x++)
						if(arr2[x].ID==gr2)
						{
							System.out.print("Your Name is:");
							System.out.print(arr2[x].Name);
							System.out.print("\tYour Grade is:");
							System.out.println(arr2[x].Grade);
						}
				break;
			case 4:
				for(int x=0;x<j;x++)
				{
					System.out.print(x+1);
					System.out.print(".");
					arr2[x].Show_user_info();
				}
				break;
			}
			System.out.println("Do You Want To Continue?(Y/N)");
			Scanner g4=new Scanner(System.in);
			char ans=g4.next().charAt(0);
			if(ans=='N' || ans=='n')
				break;
			}
			System.out.println("Bye......");
	}
}
