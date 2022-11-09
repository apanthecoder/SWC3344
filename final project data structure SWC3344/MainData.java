import java.util.*;
import javax.swing.*;
import java.io.*;
import java.util.LinkedList;

public class MainData {
    
    public static void main(String[]args){
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shaiful zharfan\\Documents\\project data structure\\vaccination info.txt.txt"));
            
            LinkedList<CitizenInformation> citizenList = new LinkedList<>();
            LinkedList<CitizenInformation> completedList = new LinkedList<>();
            
            CitizenInformation MainData;
            String indata = null;
            
            while ((indata = reader.readLine()) != null){
                StringTokenizer st = new StringTokenizer(indata,";");
                String CitizenName = st.nextToken();
                String CitizenIc= st.nextToken();
                String CitizenState= st.nextToken();
                int CitizenAge = Integer.parseInt(st.nextToken());
                String CitizenCategory = st.nextToken();
                String FirstDoseStatus = st.nextToken();
                String SecondDoseStatus = st.nextToken();
                String CertificateVaccinationCompletion = st.nextToken();
                
                MainData = new CitizenInformation(CitizenName,CitizenIc,CitizenState,CitizenAge,CitizenCategory,
                FirstDoseStatus, SecondDoseStatus,CertificateVaccinationCompletion);
                
                citizenList.add(MainData);
            
            }
            reader.close();
            
            Stack<CitizenInformation> stCentre1 = new Stack<>();
            Stack<CitizenInformation> stCentre2 = new Stack<>();
            Stack<CitizenInformation> stCentre3 = new Stack<>();
            
            Stack<CitizenInformation> temp1 = new Stack<>();
            Stack<CitizenInformation> temp2 = new Stack<>();
            Stack<CitizenInformation> temp3 = new Stack<>();
            
            while(!citizenList.isEmpty()){
                
                MainData = citizenList.removeLast();
                if(MainData.getCitizenAge() >= 18 && MainData.getCitizenAge() <= 30){
                    stCentre1.push(MainData);
                }
                else if (MainData.getCitizenAge() >= 31 && MainData.getCitizenAge() <= 49){
                    stCentre2.push(MainData);
                }
                else if (MainData.getCitizenAge() >= 50){
                    stCentre3.push(MainData);
                }
            }
            
            Queue<CitizenInformation> qCentre1 = new LinkedList<>();
            Queue<CitizenInformation> qCentre2 = new LinkedList<>();
            Queue<CitizenInformation> qCentre3 = new LinkedList<>(); 
            
            int menu = 0;
            do{
                menu = Integer.parseInt(JOptionPane.showInputDialog("Plese choose the following :"+
                "\nMenu 1 - Add new data "+ "\nMenu2 - Remove existing data" + "\nMenu3 - Demonstrate the first vaccinaton process"
                + "\nMenu4 - Demonstrate the second vaccination process" + "\nMenu5 - exit"));
                
                
                if(menu == 1){
                    
                String CitizenName = JOptionPane.showInputDialog ("Please enter name : ");
                String CitizenIc = JOptionPane.showInputDialog ("Please enter Ic : ");
                String CitizenState = JOptionPane.showInputDialog ("Please enter state : ");
                int CitizenAge = Integer.parseInt(JOptionPane.showInputDialog ("Please enter age : "));
                String CitizenCategory = JOptionPane.showInputDialog ("Please enter category : ");
                String FirstDoseStatus = JOptionPane.showInputDialog ("Please enter First dose status : ");
                String SecondDoseStatus = JOptionPane.showInputDialog ("Please enter second dose status : ");
                String CertificateVaccinationCompletion = JOptionPane.showInputDialog ("Please enter VaccinationCompletion : ");
                
                MainData = new CitizenInformation(CitizenName,CitizenIc,CitizenState,CitizenAge,CitizenCategory,
                FirstDoseStatus, SecondDoseStatus,CertificateVaccinationCompletion);
                
                citizenList.add(MainData);
            }
            
            else if (menu == 2){
                
                String CitizenIc = JOptionPane.showInputDialog("plese enter the ic that you want to delete :");
                
                for (int i = 0; i< citizenList.size(); i++){
                    
                    MainData = citizenList.get(i);
                    if (MainData.getCitizenIc().equalsIgnoreCase(CitizenIc)){
                        citizenList.remove(MainData);
                    }
                }
            }
            else if (menu == 3){
                
                while (!stCentre1.isEmpty())
                {
                    MainData = stCentre1.pop();
                    if (MainData.getFirstDoseStatus().equalsIgnoreCase("null"))
                    {
                        MainData.setFirstDoseStatus("completed");
                        qCentre1.add(MainData);
                    }
            }
            
            
             while (!stCentre2.isEmpty())
                {
                    MainData = stCentre2.pop();
                    if (MainData.getFirstDoseStatus().equalsIgnoreCase("null"))
                    {
                        MainData.setFirstDoseStatus("completed");
                        qCentre2.add(MainData);
                    }
            }
            
            
             while (!stCentre3.isEmpty())
                {
                    MainData = stCentre3.pop();
                    if (MainData.getFirstDoseStatus().equalsIgnoreCase("null"))
                    {
                        MainData.setFirstDoseStatus("completed");
                        qCentre3.add(MainData);
                    }
            }
            int submenu = 0;
        do{
            submenu = Integer.parseInt(JOptionPane.showInputDialog("please choose the option" + "\nMenu1 - Display 1st dose recipient"
             + "\nMenu2 - Display completed dose recipient"));
             
             if (submenu == 1){
                 System.out.println(qCentre1.toString());
                 System.out.println(qCentre2.toString());
                 System.out.println(qCentre3.toString());
             }
             
             if (submenu == 2){
                 System.out.println(completedList.toString());
             }
        
        }while(submenu != 3);
        }
        if (menu ==4){
            
            while (!qCentre1.isEmpty())
            {
              MainData = qCentre1.remove();
              if(MainData.getSecondDoseStatus().equalsIgnoreCase("null"))
              {
                  MainData.setSecondDoseStatus("Completed");
                  MainData.setCertificateVaccinationCompletion("completed");
              }
            }
            
            while (!qCentre2.isEmpty())
            {
              MainData = qCentre2.remove();
              if(MainData.getSecondDoseStatus().equalsIgnoreCase("null"))
              {
                  MainData.setSecondDoseStatus("Completed");
                  MainData.setCertificateVaccinationCompletion("completed");
              }
            }
            
            while (!qCentre3.isEmpty())
            {
              MainData = qCentre3.remove();
              if(MainData.getSecondDoseStatus().equalsIgnoreCase("null"))
              {
                  MainData.setSecondDoseStatus("Completed");
                  MainData.setCertificateVaccinationCompletion("completed");
              }
            }
            int submenu = 0;
        do{
            submenu = Integer.parseInt(JOptionPane.showInputDialog("please choose the option" + "\nMenu1 - Display 1st dose recipient"
             + "\nMenu2 - Display completed dose recipient"));
             
             if (submenu == 1){
                 System.out.println(qCentre1.toString());
                 System.out.println(qCentre2.toString());
                 System.out.println(qCentre3.toString());
             }
             
             if (submenu == 2){
                 System.out.println(completedList.toString());
             }
        
        }while(submenu != 3);
        }
        
    }while(menu != 5);
    
}
    catch ( Exception e){
    System.out.println(e.getMessage());
}
}
}
