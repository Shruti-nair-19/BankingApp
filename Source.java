import java.util.*;

//this class will simply act as an object to store data
class AddDataUsers 
{    
	int dept_id,notification_id,status;    
	String username,password;   
	
	public AddDataUsers(String username, String password,int dept_id,int status,int notification_id) 
{    
	    this.username=username;   
	    this.password=password;
	    this.dept_id=dept_id;
	    this.status=status;
	    this.notification_id=notification_id; 
	        
}    
} //end of class AddDataUsers   


class AddDataDepartment 
{    
	//int dept_id;  
	String dept_name
	
	public AddDataDepartment(String dept_name) {     
	    this.dept_name = dept_name;        
}    
} //end of class AddDataUsers


class AddDataNotification
{    
	
	String notification_name;
	public AddDataNotification(String notification_name) {     
	    this.dept_notification = notification_name;        
}    
} //end of class AddDataNotification



class Source{

	public static void main(String args[]){
	
		System.out.println("Log In As: ");
		System.out.println("1. Admin");
		System.out.println("2. User 1");
		System.out.println("3. User 2");
		System.out.println("4. HOD1");
		System.out.println("5. HOD2");
		System.out.println("6. Exit");
		Scanner sc=new Scanner(System.in);
		int logIn=sc.nextInt();

		Users users=new Users();


		do {

		switch(logIn){

			case 1: users.admin();
					break;
			case 2: users.userportal(2);
					break;
			case 3: users.userportal(3);
					break;
			
			case 4: users.hod(4);
					break;
			case 5: users.hod(5);
					break;
			default: System.out.println("Incorrect Option, Select Again");
					 break;
			}

		}
		while(logIn!=5);

		 
	} //end of main	

} //end of Login class



class Users{

    Scanner sc=new Scanner(System.in);
    public Map<Integer,AddDataUsers> getUsersMap() {

		   //Creating map of User   
		    Map<Integer,AddDataUsers> user_database=new TreeMap<Integer,AddDataUsers>();    
		    //Creating Users    
		    AddDataUsers a1=new AddDataUsers("admin","123",-1,-1,-1);
		    AddDataUsers a2=new AddDataUsers("shruti","890",1,-1,22);
		    AddDataUsers a3=new AddDataUsers("dipali","567",1,-1,22);
		    AddDataUsers a4=new AddDataUsers("zainaeb","456",2,-1,23);
		    AddDataUsers a5=new AddDataUsers("jaya","345",2,-1,23);

		    
		    //Adding values to map   
		    user_database.put(1,a1); 
		    user_database.put(2,a2);
		    user_database.put(3,a3); 
		    user_database.put(4,a4); 
		    user_database.put(5,a5); 
			

	
         	    return user_database;
   		 }


public Map<Integer,AddDataNotification> getNotificationMap() 
		{

		    //Creating map for notification   
		    Map<Integer,AddDataNotification> notification_database=new TreeMap<Integer,AddDataNotification>();    
		    //Creating notifications   
		    AddDataNotification n1=new AddDataNotification("Employees have to work 10 hours a day",1);
		    AddDataNotification n2=new AddDataNotification("Lunch breaks for 30 minutes only",2);

		    
		    //Adding values to map   
		    notification_database.put(22,n1); 
		    notification_database.put(23,n2);
			
         	    return notification_database;
   		 }
	
	
public Map<Integer,AddDataDepartment> getDepartmentMap() 
		{

		    //Creating map for department  
		    Map<Integer,AddDataDepartment> department_database=new TreeMap<Integer,AddDataDepartment>();    
		    //Creating departments 
		    AddDataDepartment d1=new AddDataDepartment("IT");
		    AddDataDepartment d2=new AddDataDepartment("Trade processing");

		    
		    //Adding values to map   
		    department_database.put(1,d1); 
		    department_database.put(2,d2);
				
         	    return department_database;
   		 }


public void hod_view_notifications(int department)
{
		
			Map<Integer,AddDataUsers> users_database = getUsersMap();
			
			Map<Integer,AddDataNotification> notification_database = getNotificationMap();
			AddDataNotification b = notification_database.get(notification_number);

			//loop
			for(int i = 1; i <= 2; i++) 
				{
					// AddDataUsers a = users_database.get(i);
					AddDataNotification b = notification_database.get(i);
					if (b.dept_id == department) {
						System.out.println(b.notification_id + "\t" + b.notification_name);
				}
			}
			


			


}
}
