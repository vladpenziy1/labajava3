package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company{


    private int numberCompany;
    private String nameCompany;
    private List<Worker> list = new ArrayList<Worker>();

    public int getNumberCompany() {
        return numberCompany;
    }

    public void setNumberCompany(int numberCompany) {
        this.numberCompany = numberCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void setList(List<Worker> list) {
        this.list = list;
    }

    public List<Worker> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Company{" +
                "numberCompany=" + numberCompany +
                ", nameCompany='" + nameCompany + '\'' +
                ", list=" + list +
                '}';
    }


    //повертає список тих працівників, які мають задане ім'я name
    public List<Worker> filterByName(List<Worker> list, String name){
        List<Worker> result = new ArrayList<Worker>();

        for(int i = 0; i < list.size();i++){
            if(list.get(i).getName() == name){
                result.add(list.get(i));
            }
        }

        return result;
    }

    //сортування працівників за віком
    public void sortByAge(List<Worker> list){

        Collections.sort(list, new NewComparable());

        }

       // return list;


    //підвищення зарплати всім працівникам, які працюють більше 10 років
    public void UpdateSalary(List<Worker> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getExperience() > 10){
                list.get(i).setSalary(list.get(i).getSalary()*1.25f);
            }
        }

    }


    //знаходження максимальної зарплати
    public Worker MaxSalary(List<Worker> list){
        Worker res = null;
        float temp = list.get(0).getSalary();
        for(int i=1;i<list.size();i++){
            if(list.get(i).getSalary() > temp){
                res = list.get(i);
            }
        }

        return res;
    }

    //чи є хоча б один один працівник, який є молодше за якийсь вік
    public boolean isYounger(List<Worker> list, int age){

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAge() < age){
                return true;
            }
        }

        return false;
    }


    //вивід списку працівників
    public void printfList(List<Worker> list){

        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }



    public static void main(String args[]){

        Worker w1 = new Worker();

        w1.setId(1);
        w1.setSurname("Petrenko");
        w1.setName("Ivan");
        w1.setLastname("Olehovych");
        w1.setAge(45);
        w1.setExperience(10);
        w1.setSalary(3500);


        Worker w2 = new Worker();

        w2.setId(2);
        w2.setSurname("Kalush");
        w2.setName("Mariya");
        w2.setLastname("Ivanivna");
        w2.setAge(41);
        w2.setExperience(7);
        w2.setSalary(2500);

        Worker w3 = new Worker();

        w3.setId(3);
        w3.setSurname("Poluk");
        w3.setName("Petro");
        w3.setLastname("Volodymyrovych");
        w3.setAge(20);
        w3.setExperience(11);
        w3.setSalary(5000);

        Worker w4 = new Worker();


        w4.setId(4);
        w4.setSurname("Maksymov");
        w4.setName("Petro");
        w4.setLastname("Maksymovych");
        w4.setAge(36);
        w4.setExperience(14);
        w4.setSalary(4300);

        Worker w5 = new Worker();


        w5.setId(5);
        w5.setSurname("Loza");
        w5.setName("Ihor");
        w5.setLastname("Petrovych");
        w5.setAge(19);
        w5.setExperience(17);
        w5.setSalary(2400);

        Worker w6 = new Worker();

        w6.setId(6);
        w6.setSurname("Kyznecova");
        w6.setName("Olena");
        w6.setLastname("Dmytrivna");
        w6.setAge(54);
        w6.setExperience(9);
        w6.setSalary(2400);


        Worker w7 = new Worker();

        w7.setId(7);
        w7.setSurname("Vatin");
        w7.setName("Volodymyr");
        w7.setLastname("Viktorovych");
        w7.setAge(35);
        w7.setExperience(16);
        w7.setSalary(3200);

        Worker w8 = new Worker();


        w8.setId(8);
        w8.setSurname("Andrienko");
        w8.setName("Petro");
        w8.setLastname("Mykolayovych");
        w8.setAge(40);
        w8.setExperience(11);
        w8.setSalary(7000);


        Company company = new Company();
        company.setNumberCompany(1);
        company.setNameCompany("Softserve");
        List<Worker> l = company.getList();

       l.add(w1);
       l.add(w2);
       l.add(w3);
       l.add(w4);
       l.add(w5);
       l.add(w6);
       l.add(w7);
       l.add(w8);

        company.sortByAge(l);
        company.printfList(l);
        System.out.println("\n\n");
        company.printfList(l);

       //Collections.sort(l);  //Сортування по імені по-батькові
        // company.printfList(l);
       // company.UpdateSalary(l);
       // company.printfList(l);
       // System.out.println(company.MaxSalary(l));


    }

}
