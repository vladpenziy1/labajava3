package lab3;

import java.util.Comparator;

public class NewComparable implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();
        return age1.compareTo(age2);
    }

}
