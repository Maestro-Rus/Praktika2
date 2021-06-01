
package com.mycompany.praktika2;



public class Main {
    public static void main(String[] args) {
        // Создаю объекты классов, получаю информацию о объектах и задаю её для полей другого объекта
    JobSeeker jobSeek = new JobSeeker();
    Employer empl = new Employer();
    EmploymentAgency agency = new EmploymentAgency();
    Database basa = new Database();
    Document doc = new Document();
    /* ДЛЯ СОИСКАТЕЛЯ */
    String nameA = jobSeek.getNameA();
        basa.setNameA(nameA);
    
    String surnameA = jobSeek.getSurnameA();
    /*для базы данных */
        basa.setSurnameA(surnameA);
    /*для документа */
        doc.setSurnameA(surnameA);
    
    String patrA = jobSeek.getPatrA();
        basa.setPatrA(patrA);
    
    String qualification = jobSeek.getQualification();
        basa.setQualification(qualification);
    
    String profession = jobSeek.getProfession();
        basa.setProfession(profession);
    
    String phone2 = jobSeek.getPhone2();
        basa.setPhone2(phone2);
    /* ДЛЯ РАБОТАДАТЕЛЯ */
    String nameE = empl.getNameE();
        basa.setNameE(nameE);
    
    String surnameE = empl.getSurnameE();
    /*для базы данных */
        basa.setSurnameE(surnameE);
    /*для документа */
        doc.setSurnameA(surnameA);
    
    String patrE = empl.getPatrE();
        basa.setPatrE(patrE);
    
    String activity = empl.getActivity();
        basa.setActivity(activity);
    
    String address = empl.getAddress();
        basa.setAddress(address);
    
    String phone1 = empl.getPhone1();
        basa.setPhone1(phone1);  
    
   /* Вызов методов */
    agency.EmploymenAgencyOut();
    empl.EmployerOut();
    jobSeek.JobSeekerOut();
    basa.showDatabase();
    doc.DocOut();
    }
}
