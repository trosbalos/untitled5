

public class lesson5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Николай","Ахо","kolya@mail.ru","+79650916750",30000,50);
        persArray[1] = new Employee("Василий","Кадры","Vasya@mail.ru","+79650916752",40000,30);
        persArray[2] = new Employee("Петр","Ресепшн","Petya@mail.ru","+79650916753",50000,40);
        persArray[3] = new Employee("Владимир","Повар","Vova@mail.ru","+79650916754",60000,56);
        persArray[4] = new Employee("Дмитрий","Охранник","Dima@mail.ru","+79650916755",70000,56);



        for (int i = 0; i <persArray.length ; i++) {
            if((persArray[i]).age>40){
                persArray[i].employinfo();

            }
        }

    }


}
