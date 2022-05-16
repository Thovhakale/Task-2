
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thovhakale Wanga
 */
public class login {
private task Task = new task();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
    
    System.out.println("Please enter the username:");
    String username=input.nextLine();
    System.out.println("Please enter the username:");
    String password=input.nextLine();
    System.out.println("Please enter the first name:");
    String Firstname=input.nextLine();
    System.out.println("Please enter the Last name:");
    String Lastname=input.nextLine();
    
    System.out.println("Login page");
    System.out.println("Please enter the username");
    String loginUsername=input.nextLine();
    System.out.println("Please enter the password");
    String loginPassword=input.nextLine();
    
    System.out.println(checkusername(username));
    System.out.println(registerUser(username, password));
    System.out.println(returnLoginStatus(username, password, loginUsername, loginPassword,last));
    System.out.println(loginUser(username,password,loginUsername,loginPassword));

    
    
    System.out.println(printTaskDetails(Sta, Status, dvFirstName, dvLastName, taskName, taskNumber, Description, time));
    System.out.println(createTaskID(dvFirstName , int taskNumber, taskName));
    System.out.println(checkTaskDescription(taskDescription));
    System.out.println(returnTotalHours(int Duration, int time));
    
    
}
public static boolean checkUsername(String username){
    for(int i=0;i<username.length();i++){
        
        int length=username.length();boolean thelength=false;
        //for (int b=0;b<username.length();++){
        if(length<=5){
            if((int)username.charAt(i)==95){
                return true;
                
                
            }
        }
    }
        return false;
}
    public static boolean checkPasswordComplexity(String password){
        for(int i=0;i < password.length();i ++){
        int length=password.length();
        
        boolean Upper=false;
       
        if((int)username.charAt(i)==95){
            return true;
            
        }
       
    }
        return false;
}


public static boolean checkPasswordComplexity(String password){
//for(int i=0;<password.length();i++){
int length=password.length();

boolean Upper=false;
boolean passwordlength=false;
boolean Num=false;
boolean Specialcharacter=false;
for(int i=0;i<password.length();i++){

if((int)password.charAt(i)<=90 && password.charAt(i)==65){
return true;
}
if((int)password.charAt(i)<57 && password.charAt(i)==48){
return true;
}
if((int)password.charAt(i)>=33 && password.charAt(i)==64){
return true;
}
    
  if(Upper && Num && Specialcharacter && length>=8){
    return true;
    }

}
        return false;
}


public static String registerUser(String username,String password ){
if (login.checkUsername(username)==false){
return("The username is incorrectly formatted");
}
else if (login.checkPasswordComplexity(password)==false){
return("The password does not meet the complexity requirements");
}
else{
return("The above conditions have been met and the user has been registered successfully.");
}

}


public boolean loginUser(String username,String password,String loginUser,String loginpassword){
if (loginUser.equals(username)&& loginPassword.equals(password)){
return true;


}

return false;


}

public static String returnLoginStatus(String username,String password, String loginUser, String loginPassword)


boolean login=Login.loginUser(username, password, logiinUser, loginpassword);
if(login==true){


}

return false;


}

public static String returnLoginStatus(String username,String password,String loginUser,String loginpassword)

boolean login=Login.loginUser(username, password, loginUser, loginpassword);

return"Login successful,"+"welcome back"+firstname""+lastname+"it is nice to see you"
}

else{
return"A failed login";
}
    }
    
}

JOptionPane.showMessageDialog(null," welcome to easyKanba");
       
         String Sc=JOptionPane.showInputDialog("a.Option 1) Add tasks "+ "\n" + "b.Option 2) Show report-  coming soon"+"\n"+"c. Option 3)Quit");
          int v=Integer.parseInt(Sc);
        while(v!=3){
            
    
        
      
       
              if(v==1){

    String project= JOptionPane.showInputDialog(null," how many tasks will you like to enter"); 
              int a=Integer.parseInt(project);
              
              
              
              
             
                     int time=0;
              for(int i=0;i<a;i++){
        
        String taskName=JOptionPane.showInputDialog( "enter task Name");
        
      JOptionPane.showMessageDialog(null, i);
      
      
      String taskDescription=JOptionPane.showInputDialog("enter task Description");
 
          if(Task.checkTaskDescription(taskDescription)==  false){
              
              JOptionPane.showMessageDialog(null,"the length should not be greater than 50","Title",JOptionPane.WARNING_MESSAGE);
             
        } 
          else{
              JOptionPane.showMessageDialog(null,"task successfully captured");
          }
    
      JOptionPane.showMessageDialog(null,Task.checkTaskDescription(taskDescription));
   
     
      String  dvFirstName= JOptionPane.showInputDialog(null,"first Name");
     
      String dvLastName= JOptionPane.showInputDialog(null,"enter last name " );
      
      
      
     
      String Duration=JOptionPane.showInputDialog("enter task duration");
     int duration=Integer.parseInt(Duration);
     time+=duration;
     
     
     
     
        JOptionPane.showMessageDialog(null,Task.createTaskID( dvFirstName, i, taskName));
        
       
 
     int taskStatus=Integer.parseInt(JOptionPane.showInputDialog("task Status" + "\n" + "1=to do" + "\n" + "2=done" + "\n" + "3=doing"));
             
             
             String options= "";
             switch (taskStatus){
                 case 1:
                     options="to do";
                     break;
                 case 2:
                     options="done";
                     break;
                 case 3:
                     options="Doing";
                     break;
                 default:
                     break;
             }
           
          
             JOptionPane.showMessageDialog(null,Task.printTaskDetails(Sta,Status ,dvFirstName, dvLastName,taskName, taskNumber,Description, time){
        
              }
              
                 
                  System.out.println(Task.returnTotalHours(time));     
    }
              if(v==2){
                  JOptionPane.showMessageDialog(null,"coming soon");
                   respond=JOptionPane.showInputDialog("a.Option 1) Add tasks "+ "\n" + "b.Option 2) Show report-coming soon"+"\n"+"c. Option 3)Quit");
            
                   v=Integer.parseInt(respond);
              }
            v=Integer.parseInt(JOptionPane.showInputDialog("a.Option 1) Add tasks "+ "\n" + "b.Option 2) Show report-coming soon"+"\n"+"c. Option 3)Quit"));
        
         
  }
