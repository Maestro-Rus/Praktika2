
package com.mycompany.praktika2;

public class Document {
        private String surnameA;
        public void setSurnameA(String surnameA){
            this.surnameA = surnameA;
        }
    private String surnameE;
        public void setSurnameE(String surnameE){
            this.surnameE = surnameE;
        }
        String position = ("Junior-программист");
        String commission = ("30%");
        void DocOut(){ 
            System.out.println("Оформление документа между лицами: " + surnameA + " и " + surnameE + "выполнено!!! ");
            System.out.println("Должность: " + position);
            System.out.println("Коммисионные бюро = " + commission);
        }
    
}
