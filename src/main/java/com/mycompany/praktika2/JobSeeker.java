
package com.mycompany.praktika2;

public class JobSeeker {
    
        String nameA = ("Владимир");
        public String getNameA(){
            return nameA;
        }
        String surnameA = ("Поляков");;
        public String getSurnameA(){
            return surnameA;
        }
            
        String patrA = ("Александрович");
        public String getPatrA(){
            return patrA;
        }
        String qualification = ("Техник-программист");
        public String getQualification(){
            return qualification;
        }
        String profession = ("Программист");
        public String getProfession(){
            return profession;
        }
        String phone2 = ("89094453491");
        public String getPhone2(){
            return phone2;
        }
        // вывод информации о соискателе
        void JobSeekerOut(){
            System.out.println("Имя соискателя: " + nameA);
            System.out.println("Фамилия: " + surnameA);
            System.out.println("Отчество: " + patrA);
            System.out.println("Квалификация: " + qualification);
            System.out.println("Профессия: " + profession);
            System.out.println("Телефон: " + phone2);
            System.out.println("");
        }
        
    
}
