/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

/**
 *
 * @author phatn
 */
public class Functions {
    Account[] acc= new Account[20];
    int i;
    int accCount= 0;
    
    public int SearchArray(int input, String str){
        for(i= 0; i < input; i++){
            if(str.equals(acc[i].getUserName())){
                break;
            } else i= -1;
        }
        return i;
    }
    
    public void Register(String[] arr){
        acc[accCount]= new Account(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
        
        accCount++;
    }
    
    public void Register2(Account arr){
        acc[0]= arr;
    }
    
    public String passing(){
        return acc[0].getPassword();
    }
    
//    public void ClearFile(){
//        PrintWriter writer = new PrintWriter(FILE_PATH);
//        writer.print("");
//        // other operations
//        writer.close();
//    }
    
//    Login login= new Login(); 
//    public void Passing(){
//        login.setPasswordField(acc[0].getPassword());
//        login.setVisible(true);
//        
//    }
}
