public class CitizenInformation {

        private String CitizenName;
        private String CitizenIc;
        private String CitizenState;
        private int CitizenAge;
        private String CitizenCategory;
        private String FirstDoseStatus;
        private String SecondDoseStatus;
        private String CertificateVaccinationCompletion;
    
        public CitizenInformation()
    {
        CitizenName = null;
        CitizenIc = null;
        CitizenState = null;
        CitizenAge = 0;
        CitizenCategory = null;
        FirstDoseStatus = null;
        SecondDoseStatus = null;
        CertificateVaccinationCompletion = null;
        }
        
    
    public CitizenInformation(String CitizenName, String CitizenIc, String CitizenState, int CitizenAge, String CitizenCategory,
    String FirstDoseStatus, String SecondDoseStatus, String CertificateVaccinationCompletion )
    {
        this.CitizenName = CitizenName;
        this.CitizenIc = CitizenIc;
        this.CitizenState = CitizenState;
        this.CitizenAge = CitizenAge;
        this.CitizenCategory = CitizenCategory;
        this.FirstDoseStatus = FirstDoseStatus;
        this.SecondDoseStatus = SecondDoseStatus;
        this.CertificateVaccinationCompletion = CertificateVaccinationCompletion;
    }

    public void setCitizenName(String a)
    {
        CitizenName = a;
    }
    
    public void setCitizenIc(String b)
    {
        CitizenIc = b;
    }
    
    public void setCitizenState(String c)
    {
        CitizenState = c;
    }
    
    public void setCitizenAge(int d)
    {
        CitizenAge = d;
    }
    
    public void setCitizenCategory(String e)
    {
        CitizenCategory = e;
    }
    
    public void setFirstDoseStatus(String f)
    {
        FirstDoseStatus = f;
        }
    
        public void setSecondDoseStatus(String g)
    {
        SecondDoseStatus = g;
        }
        
        public void setCertificateVaccinationCompletion(String h)
    {
      CertificateVaccinationCompletion = h;
        }
    //Getter method
    
    public String getCitizenName()
    {
        return CitizenName;
    }
    
    public String getCitizenIc()
    {
        return CitizenIc;
    }
    
    public String getCitizenState()
    {
        return CitizenState;
    }
    
    public int getCitizenAge()
    {
        return CitizenAge;
    }
    
    public String getCitizenCategory()
    {
        return CitizenCategory;
    }
    
    public String getFirstDoseStatus()
    {
                return FirstDoseStatus; 
        }
        
        public String getSecondDoseStatus()
    {
                return SecondDoseStatus; 
        }
        
        public String getCertificateVaccinationCompletion()
    {
                return CertificateVaccinationCompletion; 
        }
    
    //toString method
    public String toString()
    {
         return ("\nCitizen Name = " +CitizenName+ "\nCitizen Ic = " +CitizenIc+ "\nCitizen Age = " +CitizenAge+ "\nCitizen Category = "
         +CitizenCategory+ "\n1st Dose Status = " +FirstDoseStatus+ "\n2nd Dose Status = " +SecondDoseStatus+ "\nCertificate Vaccination Completion = "
         +CertificateVaccinationCompletion + "\n----------------------------------------------");
    }
    
}
