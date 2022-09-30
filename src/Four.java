import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Four {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Himanshu nayal", 20000L, "Nainital"));
        list.add(new Employee("aman singh", 30000L, "Noida"));
        list.add(new Employee("kamlesh malik", 25000L, "Delhi"));
        list.add(new Employee("mohit pathak", 12000L, "mumbai"));


        //condition
        List<String> r = list.stream().filter(
                        e -> e.getCity().equalsIgnoreCase("Delhi") && e.getSalary() < 5000)
                .map(e -> e.getFullName()).collect(toList());
        List<String> Distinct = r.stream().distinct().collect(toList());

        System.out.println(Distinct);


        System.out.println(Arrays.asList(1, 3, 32, 0, 23).
                stream().filter(e -> e % 2 == 0).
                collect(toList()));
    }
}
