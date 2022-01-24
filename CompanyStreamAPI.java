package lab3;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

public class CompanyStreamAPI {


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

    public List<Worker> sortedByAge(List<Worker> list){

       return list.stream().sorted(Comparator.comparing(Worker::getAge)).collect(Collectors.toList());
    }

    public List<Worker> filterByName(List<Worker> list, String name){

        List<Worker> res = list.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList());
        return res;
    }

    public Optional<Worker> MaxSalary(List<Worker> list){

        return list.stream().max(Comparator.comparing(Worker::getSalary));
    }


    public boolean isYounger(List<Worker> list, int age1){

        return list.stream().anyMatch(ages -> ages.getAge() < age1);
    }


    public void printfList(List<Worker> list){
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String args[]){

        List<Worker> copy = new ArrayList<Worker>();

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


        CompanyStreamAPI companyStreamAPI = new CompanyStreamAPI();
        companyStreamAPI.setNumberCompany(1);
        companyStreamAPI.setNameCompany("Glovo");
        List<Worker> l = companyStreamAPI.getList();

        l.add(w1);
        l.add(w2);
        l.add(w3);
        l.add(w4);
        l.add(w5);
        l.add(w6);
        l.add(w7);
        l.add(w8);


           System.out.println( companyStreamAPI.isYounger(l, 20));
      // copy =  companyStreamAPI.filterByName(l,"Petro");

      //  companyStreamAPI.printfList(copy);
     //   System.out.println(companyStreamAPI.MaxSalary(l));
 //company.sortByAge(l);
// companyStreamAPI.printfList(l);
        //Collections.sort(l);  //Сортування по імені по-батькові
        // company.printfList(l);

        // System.out.println("\n\n");
        // company.UpdateSalary(l);

        // company.printfList(l);


    }
}

