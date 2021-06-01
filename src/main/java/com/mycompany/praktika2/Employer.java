
package com.mycompany.praktika2;

public class Employer {
        
        String nameE = ("Дмитрий");
        public String getNameE(){
            return nameE;
        }
        String surnameE = ("Марцинкевич");
        public String getSurnameE(){
            return surnameE;
        }
        String patrE = ("Сергеевич");
        public String getPatrE(){
            return patrE;
        }
        String activity = ("Программирование");
        public String getActivity(){
            return activity;
        }
        String address = ("Город Белгород, улица новая");
        public String getAddress(){
            return address;
        }
        String phone1 = ("89995474157");
        public String getPhone1(){
            return phone1;
        }
        // вывод информации о работодателе
        void EmployerOut(){
        System.out.println("ИНФОРМАЦИЯ О РАБОТОДАТЕЛЕ.");
        System.out.println("Имя работодателя: " + nameE);
        System.out.println("Фамилия: " + surnameE);
        System.out.println("Отчество: " + patrE);
        System.out.println("Вид деятельности: " + activity);
        System.out.println("Адрес: " + address);
        System.out.println("Рабочий телефон: " + phone1);
        System.out.println("");
        System.out.println("ИНФОРМАЦИЯ О СОИСКАТЕЛЕ.");
    }
}
