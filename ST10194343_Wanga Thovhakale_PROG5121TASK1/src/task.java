/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thovhakale Wanga
 */
public class task 
  public static int returnTotalHours( int Duration, int time){
       
    return time+=Duration;
     
        }  
        
          public static String printTaskDetails(String Sta,String Status ,String dvFirstName,String dvLastName,String taskName,int taskNumber,String Description,int time){
        return" task status :" + Sta + " \n " +   "Developer Details:" + dvFirstName + "   "+ dvLastName + " \n " + "taskNumber:" + taskNumber + " \n " + "task Name:" + taskName + " \n " + "task Description:" + Description  + " \n " + "taskID:" + Task.createTaskID(dvFirstName, taskNumber,taskName ) + "\n" + "task Duration:"  + time;
               
         
     }
     
     public static String createTaskID(String dvFirstName , int taskNumber,String taskName){
        String taskID = null;
     
        return taskID + taskName.substring(0,2) + ":" + taskNumber + ":"+ dvFirstName.substring(dvFirstName.length()-3,dvFirstName.length());
        
    }
      
      public static boolean checkTaskDescription(String taskDescription){
        
        
        int length=taskDescription.length();
        boolean thelength=false;
         for(int b=0;b<taskDescription.length();b++){
        if(length<=50){
            return true;
        
    }
         }
         return false;
}  
    

