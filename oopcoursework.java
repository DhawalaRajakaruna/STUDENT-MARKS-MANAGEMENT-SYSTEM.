import java.util.*;
class details{
	String userID;
	String name;
	int PRFmarks;
	int DBMSmarks;
	int total;
	double avg;
}
class oopcoursework{
		public static details[] student=new details[0];
		/*
		public static String[] userID=new String[0];// [s100,s101,s102,s103]
		public static String[] name=new String[0];//[kamal,nimal,sunimal,piyal]
		public static int[] PRFmarks=new int[0];//[10,25,65,53]
		public static int[] DBMSmarks=new int[0];//[10,55,66,98]
		*/
		
		//-----------------------------------------------------Home page------------------------------------------------------------------------------------------------------------
	public static void Welcome(){
		Scanner input=new Scanner(System.in);
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM.\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.print("[1] Add New Student.");
		System.out.println("\t\t\t\t\t[2] Add New Student With Marks.");
		System.out.print("[3] Add Marks.");
		System.out.println("\t\t\t\t\t\t[4] Update Student Details.");
		System.out.print("[5] Update Marks.");
		System.out.println("\t\t\t\t\t[6] Delete Student.");
		System.out.print("[7] Print Student Details.");
		System.out.println("\t\t\t\t[8] Print Student Ranks.");
		System.out.print("[9] Best In Programming Fundamentals.");
		System.out.println("\t\t\t[10] Best In Database Management System.");
		
		System.out.println();
		
		L1:System.out.print("Enter an option to continue >");
		int op=input.nextInt();
		
					switch(op){
						case 1:addstudent();break;
						case 2:addstudentwithmarks();break;
						case 3:addmarks();break;
						case 4:updatestudents();break;
						case 5:updatemarks();break;
						case 6:deletestudent();break;
						case 7:printstudentdetails();break;
						case 8:printstudentrank();break;
						case 9:bestPRF();break;
						case 10:bestDBMS();break;
						
					}
		
	}
	//----------------------------Add New Student.------------------------------------------------------------------------------------------------------------------------------------------
	public static void addstudent(){
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\tAdd New Student.\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		
		boolean move=true;
		L1:for(int j=student.length;move;j++){
		
			//-----------creating tempory arrays-------------------
			details[] tempstudent=new details[student.length+1];
			tempstudent[j]=new details();
			tempstudent[j].PRFmarks=-1;
			tempstudent[j].DBMSmarks=-1;
			
			//--------Taking Student ID--------------	
			System.out.print("Enter Student ID : ");
			tempstudent[j].userID=input.next();
			
			//-----------check already input Student ID----------------------
				for(int k=0;k<student.length;k++){
					if(tempstudent[j].userID.equalsIgnoreCase(student[k].userID)){//<------------------*[3]
						j--;
						System.out.println("The Student ID is already exist.");
						System.out.println();
						continue L1;
					}
				}
				
			//-------------Taking name---------------------------
			
			System.out.print("Enter Student Name : ");
			input.nextLine();
			tempstudent[j].name=input.nextLine();
			System.out.println();
			
				//-----------assigning global array---------
				for(int i=0;i<student.length;i++){
					tempstudent[i]=student[i];
				}
			//----------assigning array ref-------------------------
			student=tempstudent;
			
			//------check it repeats------------------
			String allow="y";
			String notallow="n";
			String checkrep;
			System.out.print("Student has been addes succesfully.Do you want to add a new student (y/n) ");
			checkrep=input.next();
				if(checkrep.equalsIgnoreCase(allow)){
					move=true;
				}else if(checkrep.equalsIgnoreCase(notallow)){
					move=false;
				}
			System.out.println();
			}
	}
	
	//---------------------------Add New Student With Marks.-------------------------------------------------------------------------------------------------------------------------------	
	public static void addstudentwithmarks(){
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("|\t\t\tAdd New Student With Marks.\t\t\t\t|");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		
		boolean move=true;
		L1:for(int j=student.length;move;j++){
			
			details[] tempstudent=new details[student.length+1];
			tempstudent[j]=new details();
			//--------Taking Student ID--------------	
			System.out.print("Enter Student ID : ");
			tempstudent[j].userID=input.next();
			
			
			//-----------check already input Student ID----------------------
			
				for(int k=0;k<student.length;k++){
					if(tempstudent[j].userID.equalsIgnoreCase(student[k].userID)){//<------------------*[3]
						j--;
						System.out.println("The Student ID is already exist.");
						System.out.println();
						continue L1;
					}
				}
			//-------------Taking name---------------------------
			
			System.out.print("Enter Student Name : ");
			input.nextLine();
			tempstudent[j].name=input.nextLine();
			System.out.println();
			
			//------------Taking PRF marks-----------
			do{
				System.out.print("Programming Fundermentals Marks : ");
				tempstudent[j].PRFmarks=input.nextInt();
				if(tempstudent[j].PRFmarks>100 | tempstudent[j].PRFmarks<0){
				System.out.println("Invalid Marks.please enter correct marks");
				System.out.println();
				}
			}while(tempstudent[j].PRFmarks>100 | tempstudent[j].PRFmarks<0);
		
			//-------------Taking DBMS marks---------------
			do{
				System.out.print("Data Base Managemnt System Marks : ");
				tempstudent[j].DBMSmarks=input.nextInt();
				if(tempstudent[j].DBMSmarks>100 | tempstudent[j].DBMSmarks<0){
				System.out.println("Invalid Marks.please enter correct marks");
				System.out.println();
				}
			}while(tempstudent[j].DBMSmarks>100 | tempstudent[j].DBMSmarks<0);
				System.out.println();
			
			
			//-----------assigning global array---------
				for(int i=0;i<student.length;i++){
					tempstudent[i]=student[i];
				}
				
			//----------assigning array ref-------------------------
			student=tempstudent;
			
			//------check it repeats------------------
			String allow="y";
			String notallow="n";
			String checkrep;
			System.out.print("Student has been addes succesfully.Do you want to add a new student (y/n) ");
			checkrep=input.next();
				if(checkrep.equalsIgnoreCase(allow)){
					move=true;
				}else if(checkrep.equalsIgnoreCase(notallow)){
					move=false;
				}
					System.out.println();
			}
	}
	
	//------------------Add Marks.------------------------------------------------------------------------------------------------------------------------------------
	public static void addmarks(){
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\tAdd Marks.\t\t\t\t|");
		System.out.println("-----------------------------------------------------------------");
		
		Scanner input=new Scanner(System.in);
		
		boolean move=true;
		boolean checkalready=true;
		L1:for(int j=student.length;move;j++){
			
			//--------Taking Student ID--------------	
			System.out.println();
			System.out.print("Enter Student ID : ");
			String CheckID=input.next();
			
			
			//-----------check already input Student ID----------------------
			int k=0;
			boolean track=false;
			boolean display=true;
			for(int n=0;n<student.length;n++){
					if(CheckID.equalsIgnoreCase(student[n].userID)){
						k=n;
						track=true;
					}
			}
			
				if(track==true){
					System.out.println("Student Name : "+student[k].name);
					System.out.println();
					
					if(student[k].PRFmarks==-1){
					
						//------------Taking PRF marks-----------
						do{
							System.out.print("Programming Fundermentals Marks : ");
							student[k].PRFmarks=input.nextInt();
							if(student[k].PRFmarks>100 | student[k].PRFmarks<0){
							System.out.println("Invalid Marks.please enter correct marks");
							System.out.println();
							}
						}while(student[k].PRFmarks>100 | student[k].PRFmarks<0);
						
						
					//-------------Taking DBMS marks---------------
						do{
							System.out.print("Data Base Managemnt System Marks : ");
							student[k].DBMSmarks=input.nextInt();
							if(student[k].DBMSmarks>100 | student[k].DBMSmarks<0){
							System.out.println("Invalid Marks.please enter correct marks");
							System.out.println();
							}
						}while(student[k].DBMSmarks>100 | student[k].DBMSmarks<0);
							System.out.println();
							
						display=true;
						
					}else{
						System.out.println("This Students marks have beem already added.");
						System.out.println("If you want to update the marks, please use [4] Update Marks option.");
						System.out.println();
						
						display=false;
						
						}
					
					if(display){
								
						//------check it repeats------------------
						String allow="y";
						String notallow="n";
						String checkrep;
						System.out.print("Marks have been added.Do you want to add marks for another student? (y/n)");
						checkrep=input.next();
							if(checkrep.equalsIgnoreCase(allow)){
								move=true;
								continue L1; 
							}else if(checkrep.equalsIgnoreCase(notallow)){
								move=false;
								continue L1;
							}	
					}else{
						
						//------check it repeats------------------
						String allow="y";
						String notallow="n";
						String checkrep;
						System.out.print("Do you want to add marks for another student? (y/n)");
						checkrep=input.next();
						if(checkrep.equalsIgnoreCase(allow)){
							move=true;
							continue L1; 
						}else if(checkrep.equalsIgnoreCase(notallow)){
							move=false;
							continue L1;
							}
											
					}
				}else if(track==false){
					
					//------check it repeats------------------
					String allow="y";
					String notallow="n";
					String checkrep;
						System.out.println();
					System.out.print("Invalid Student ID.Do you want to search again? (y/n)");
					checkrep=input.next();
					if(checkrep.equalsIgnoreCase(allow)){
						move=true;
						continue L1;
					}else if(checkrep.equalsIgnoreCase(notallow)){
						System.out.println();
						move=false;
						continue L1;
						}
				}
		}
	}
	
	//--------------------Update Student Details.---------------------------------------------------------------------------------------------------------------------------------------
	public static void updatestudents(){
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\tUpdate Student Details.\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		
		boolean move=true;
		L1:for(int j=student.length;move;j++){
		
			//--------Taking Student ID--------------	
			System.out.println();
			System.out.print("Enter Student ID : ");
			String CheckID=input.next();
		
			//-----------check already input Student ID----------------------
			int k=0;
			boolean track=false;
			for(int n=0;n<student.length;n++){
					if(CheckID.equalsIgnoreCase(student[n].userID)){
						k=n;
						track=true;
						}
			}
				if(track==true){
					System.out.println("Student Name : "+student[k].name);
					System.out.println();
					
					//----------update name-----------------------------	
					System.out.print("Enter the new Student Name : ");
					String newname=input.next();
					student[k].name=newname;
					System.out.println();
					System.out.println("Student details has been updated successfully");
					
					//------check it repeats------------------
					String allow="y";
					String notallow="n";
					String checkrep;
					System.out.print("Do you want to search again? (y/n)");
					checkrep=input.next();
					if(checkrep.equalsIgnoreCase(allow)){
						move=true;
						continue L1;
					}else if(checkrep.equalsIgnoreCase(notallow)){
						System.out.println();
						move=false;
						continue L1;
						}
						
				}else if(track==false){
						
					//------check it repeats------------------
					String allow="y";
					String notallow="n";
					String checkrep;
					System.out.println();
					System.out.print("Invalid Student ID.Do you want to search again? (y/n)");
					checkrep=input.next();
					if(checkrep.equalsIgnoreCase(allow)){
						move=true;
						continue L1;
					}else if(checkrep.equalsIgnoreCase(notallow)){
						System.out.println();
						move=false;
						continue L1;
						}
				}
			
	}
}
	
	//-------------------------Update marks-----------------------------------------------------------------------------------------------------------------------------------------------
	public static void updatemarks(){
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\tUpdate Marks.\t\t\t\t|");
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		
		boolean move=true;
		L1:for(int j=student.length;move;j++){
		
		//--------Taking Student ID--------------	
		System.out.println();
		System.out.print("Enter Student ID : ");
		String CheckID=input.next();
		
		//-----------check already input Student ID----------------------
		int k=0;
		boolean track=false;
		for(int n=0;n<student.length;n++){
				if(CheckID.equalsIgnoreCase(student[n].userID)){
					k=n;
					track=true;
				}
		}
			if(track==true){
				System.out.println("Student Name : "+student[k].name);
				System.out.println();
				
			if(student[k].PRFmarks!=-1){
				System.out.println("Programming Fundermentals marks : "+student[k].PRFmarks);
				System.out.println("Database Management System marks : "+student[k].DBMSmarks);	
				System.out.println();
				
				//------------Taking new PRF marks-----------
				do{
					System.out.print("Enter new Programming Fundermentals Marks : ");
					student[k].PRFmarks=input.nextInt();
					if(student[k].PRFmarks>100 | student[k].PRFmarks<0){
						System.out.println("Invalid Marks.please enter correct marks");
						System.out.println();
					}
				}while(student[k].PRFmarks>100 | student[k].PRFmarks<0);
				
				//-------------Taking new DBMS marks---------------
				do{
					System.out.print("Enter new Data Base Managemnt System Marks : ");
					student[k].DBMSmarks=input.nextInt();
					if(student[k].DBMSmarks>100 | student[k].DBMSmarks<0){
						System.out.println("Invalid Marks.please enter correct marks");
						System.out.println();
					}
				}while(student[k].DBMSmarks>100 | student[k].DBMSmarks<0);
				
				System.out.println();
				System.out.println("Student details has been updated successfully");
				
			//------check it repeats------------------
			String allow="y";
			String notallow="n";
			String checkrep;
			System.out.print("Do you want to search again? (y/n)");
			checkrep=input.next();
			if(checkrep.equalsIgnoreCase(allow)){
				move=true;
				continue L1;
			}else if(checkrep.equalsIgnoreCase(notallow)){
				System.out.println();
				move=false;
				continue L1;
				}
			}else{
				//------- repeats------------------
				String allow="y";
				String notallow="n";
				String checkrep;
				System.out.print("This Student's marks yet to be added.");
				System.out.print("Do you want to search again? (y/n)");
				checkrep=input.next();
				if(checkrep.equalsIgnoreCase(allow)){
					move=true;
					continue L1;
				}else if(checkrep.equalsIgnoreCase(notallow)){
					System.out.println();
					move=false;
					continue L1;
				}
			}
			}else if(track==false){
				
				//------check it repeats------------------
				String allow="y";
				String notallow="n";
				String checkrep;
					System.out.println();
				System.out.print("Invalid Student ID.Do you want to search again? (y/n)");
				checkrep=input.next();
				if(checkrep.equalsIgnoreCase(allow)){
					move=true;
					continue L1;
				}else if(checkrep.equalsIgnoreCase(notallow)){
					System.out.println();
					move=false;
					continue L1;
					}
			}
		}
	}
	
	//-------------Delete Student ------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void deletestudent(){
	
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\t\tDelete Student.\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
	
		boolean move=true;
		L1:for(int j=student.length;move;j++){
			
			//--------Taking Student ID--------------	
			System.out.println();
			System.out.print("Enter Student ID : ");
			String CheckID=input.next();
			
			
			//-----------check already input Student ID----------------------
			int k=0;
			boolean track=false;
			for(int n=0;n<student.length;n++){
					if(CheckID.equalsIgnoreCase(student[n].userID)){
						k=n;
						track=true;
					}
			}
			//----------------delete the student ----------------------------
			if(track==true){
					
					details[] tempstudent=new details[student.length-1];
					
					for(int l=0;l<k;l++){
						tempstudent[l]=student[l];
					}
					
					for(;k<student.length-1;k++){	
						tempstudent[k]=student[k+1];
					}
					
					student=tempstudent;
						
					//------- repeats------------------
					String allow="y";
					String notallow="n";
					String checkrep;
					System.out.println("Student has been deleted successfully.");
					System.out.print("Do you want to delete another student? (y/n)");
					checkrep=input.next();
					if(checkrep.equalsIgnoreCase(allow)){
						move=true;
						continue L1;
					}else if(checkrep.equalsIgnoreCase(notallow)){
						System.out.println();
						move=false;
						continue L1;
					}
							
				}else if(track==false){	
					//------check it repeats------------------
					String allow="y";
					String notallow="n";
					String checkrep;
						System.out.println();
					System.out.print("Invalid Student ID.Do you want to search again? (y/n)");
					checkrep=input.next();
					if(checkrep.equalsIgnoreCase(allow)){
						move=true;
						continue L1;
					}else if(checkrep.equalsIgnoreCase(notallow)){
						System.out.println();
						move=false;
						continue L1;
					}
			}
		}
	}
	
	//----------print student details ---------------------------------------------------------------------------------------------------------------------------------
	public static void printstudentdetails(){
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\tPrint Student Details.\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		
			double max=-1;
			//int[] total=new int[PRFmarks.length];
			//double[] avg=new double[PRFmarks.length];
			for(int x=0;x<student.length;x++){
				student[x].total=student[x].PRFmarks+student[x].DBMSmarks;
				student[x].avg=(double)student[x].total/2;
			}
		
		
			for(int j=0;j<student.length-1;j++){
				for(int i=0;i<student.length-1;i++){
					if(student[i].avg>student[i+1].avg){
						double av=student[i].avg;
						int tot=student[i].total;
						String uID=student[i].userID;
						String uname=student[i].name;
						int prf=student[i].PRFmarks;
						int dbms=student[i].DBMSmarks;
							
						student[i].avg=student[i+1].avg;
						student[i].total=student[i+1].total;
						student[i].userID=student[i+1].userID;
						student[i].name=student[i+1].name;
						student[i].PRFmarks=student[i+1].PRFmarks;
						student[i].DBMSmarks=student[i+1].DBMSmarks;
							
						student[i+1].avg=av;
						student[i+1].total=tot;
						student[i+1].userID=uID;
						student[i+1].name=uname;
						student[i+1].PRFmarks=prf;
						student[i+1].DBMSmarks=dbms;
						}
					}
				}
		
		boolean move=true;
		L1:for(int j=student.length;move;j++){
		
			//--------Taking Student ID--------------	
			System.out.println();
			System.out.print("Enter Student ID : ");
			String CheckID=input.next();
		
			//-----------check already input Student ID----------------------
			int k=0;
			boolean track=false;
			for(int n=0;n<student.length;n++){
					if(CheckID.equalsIgnoreCase(student[n].userID)){
						k=n;
						track=true;
					}
			}
			
			//----------------delete the student ----------------------------
			if(track==true){
				if(student[k].PRFmarks==-1){
					String allow="y";
					String notallow="n";
					String checkrep;
					System.out.println();
					System.out.println("Marks yet to be added");
					System.out.println();
					System.out.print("Do you want to search another student? (y/n)");
					checkrep=input.next();
					if(checkrep.equalsIgnoreCase(allow)){
						move=true;
						continue L1;
					}else if(checkrep.equalsIgnoreCase(notallow)){
						System.out.println();
						move=false;
						continue L1;
						}
				}else{
					
				System.out.println("Student Name : "+student[k].name);
				System.out.println("+--------------------------------------------------+---------------+");
				System.out.format("| %-48s | %13d |%n","Programming Fundermentals marks",student[k].PRFmarks);
				System.out.format("| %-48s | %13d |%n","Database Managemet Systems marks",student[k].DBMSmarks);
				System.out.format("| %-48s | %13d |%n","Total marks ",student[k].total);
				System.out.format("| %-48s | %13f |%n","Avg. Marks",student[k].avg);
				System.out.format("| %-48s | %13d |%n","Rank",student.length-k);
				System.out.println("+--------------------------------------------------+---------------+");
				
				String allow="y";
				String notallow="n";
				String checkrep;
				System.out.println();
				System.out.print("Do you want to search another student? (y/n)");
				checkrep=input.next();
				
				if(checkrep.equalsIgnoreCase(allow)){
					move=true;
					continue L1;
				}else if(checkrep.equalsIgnoreCase(notallow)){
					System.out.println();
					move=false;
					continue L1;
					}
				}
			}else if(track==false){
				
				//------check it repeats------------------
				String allow="y";
				String notallow="n";
				String checkrep;
				System.out.println();
				System.out.print("Invalid Student ID.Do you want to search again? (y/n)");
				checkrep=input.next();
				if(checkrep.equalsIgnoreCase(allow)){
					move=true;
					continue L1;
				}else if(checkrep.equalsIgnoreCase(notallow)){
					System.out.println();
					move=false;
					continue L1;
					}
			}
		}
	}
	
	//--------------print student rank -------------------------------------------------------------------------------------------------------------------------------
	public static void printstudentrank(){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\tPrint Student Ranks.\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
			double max=-1;
			//int[] total=new int[PRFmarks.length];
			//double[] avg=new double[PRFmarks.length];
			for(int x=0;x<student.length;x++){
				student[x].total=student[x].PRFmarks+student[x].DBMSmarks;
				student[x].avg=(double)student[x].total/2;
			}
		
			for(int j=0;j<student.length-1;j++){
				for(int i=0;i<student.length-1;i++){
					if(student[i].avg>student[i+1].avg){
						double av=student[i].avg;
						int tot=student[i].total;
						String uID=student[i].userID;
						String uname=student[i].name;
						int prf=student[i].PRFmarks;
						int dbms=student[i].DBMSmarks;
							
						student[i].avg=student[i+1].avg;
						student[i].total=student[i+1].total;
						student[i].userID=student[i+1].userID;
						student[i].name=student[i+1].name;
						student[i].PRFmarks=student[i+1].PRFmarks;
						student[i].DBMSmarks=student[i+1].DBMSmarks;
							
						student[i+1].avg=av;
						student[i+1].total=tot;
						student[i+1].userID=uID;
						student[i+1].name=uname;
						student[i+1].PRFmarks=prf;
						student[i+1].DBMSmarks=dbms;
						}
					}
				}
		
		System.out.println("+---------+------------+------------------------------------+------------------+---------------+");
		System.out.println("|Rank     | ID         | Name                               |Total Marks       |Avg. Marks     |");
		System.out.println("+---------+------------+------------------------------------+------------------+---------------+");
		for(int k=student.length-1;k>=0;k--){
			if(student[k].PRFmarks!=-1){
		System.out.printf("|%-9d|%-12s|%-36s|%18d|%15f|%n",student.length-k,student[k].userID,student[k].name,student[k].PRFmarks+student[k].DBMSmarks,(double)(student[k].PRFmarks+student[k].DBMSmarks)/2);
			}
		}
		System.out.println("+---------+------------+------------------------------------+------------------+---------------+");
		
		String allow="y";
		System.out.println();
		System.out.print("Do you want to go to the main menu?(y/n)");
		String check=input.next();
		if(allow.equalsIgnoreCase(check)){
			return;
		}else{
			input.nextLine();
		}
	}
	
	//----------------------Best of PRF marks-------------------------------------------------------------------------------------------------------------------------
	public static void bestPRF(){
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("|\t\t\tBest In Programming Fundamentals.\t\t\t\t|");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		
		for(int j=0;j<student.length-1;j++){
			for(int i=0;i<student.length-1;i++){
				if(student[i].PRFmarks>student[i+1].PRFmarks){
					String uID=student[i].userID;
					String uname=student[i].name;
					int prf=student[i].PRFmarks;
					int dbms=student[i].DBMSmarks;
							
					student[i].userID=student[i+1].userID;
					student[i].name=student[i+1].name;
					student[i].PRFmarks=student[i+1].PRFmarks;
					student[i].DBMSmarks=student[i+1].DBMSmarks;
							
					student[i+1].userID=uID;
					student[i+1].name=uname;
					student[i+1].PRFmarks=prf;
					student[i+1].DBMSmarks=dbms;
				}
			}
		}
		
		System.out.println("+------------+------------------------------------+---------------+---------------+");
		System.out.println("| ID         | Name                               |PF Marks       |DBMS Marks     |");
		System.out.println("+------------+------------------------------------+---------------+---------------+");
		for(int k=student.length-1;k>=0;k--){
			if(student[k].PRFmarks!=-1){
			System.out.printf("|%-12s|%-36s|%15d|%15d|%n",student[k].userID,student[k].name,student[k].PRFmarks,student[k].DBMSmarks);
			}
		}
		System.out.println("+------------+------------------------------------+---------------+---------------+");
		
		String allow="y";
		System.out.println();
		System.out.print("Do you want to go to the main menu?(y/n)");
		String check=input.next();
		if(allow.equalsIgnoreCase(check)){
			return;
		}else{
			input.next();
		}
		
	}
	
	//--------------best in DBMS----------------------------------------------------------------------------------------------------------------
	public static void bestDBMS(){
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("|\t\t\tBest In Data Base Management Systems.\t\t\t\t|");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		
		for(int j=0;j<student.length-1;j++){
			for(int i=0;i<student.length-1;i++){
				if(student[i].DBMSmarks>student[i+1].DBMSmarks){
					String uID=student[i].userID;
					String uname=student[i].name;
					int prf=student[i].PRFmarks;
					int dbms=student[i].DBMSmarks;
							
					student[i].userID=student[i+1].userID;
					student[i].name=student[i+1].name;
					student[i].PRFmarks=student[i+1].PRFmarks;
					student[i].DBMSmarks=student[i+1].DBMSmarks;
							
					student[i+1].userID=uID;
					student[i+1].name=uname;
					student[i+1].PRFmarks=prf;
					student[i+1].DBMSmarks=dbms;
					}
				}
			}
		
		System.out.println("+------------+------------------------------------+---------------+---------------+");
		System.out.println("| ID         | Name                               |DBMS MArks     |PF Marks      |");
		System.out.println("+------------+------------------------------------+---------------+---------------+");
		for(int k=student.length-1;k>=0;k--){
			if(student[k].PRFmarks!=-1){
			System.out.printf("|%-12s|%-36s|%15d|%15d|%n",student[k].userID,student[k].name,student[k].DBMSmarks,student[k].PRFmarks);
			}
		}
		System.out.println("+------------+------------------------------------+---------------+---------------+");
		
		String allow="y";
		System.out.println();
		System.out.print("Do you want to go to the main menu?(y/n)");
		String check=input.next();
		if(allow.equalsIgnoreCase(check)){
			return;
		}else{
			input.next();
		}
	}
	
	//-----------main method ---------------------------------------------------------------------------------------------------------------------
	public static void main (String[] args) {
		do{
			Welcome();
		}while(true);
	}
}


