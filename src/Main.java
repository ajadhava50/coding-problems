import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {


        List<Emp> list = Arrays.asList(
                new Emp(1, "a", 2000),
                new Emp(2, "c", 4000),
                new Emp(3, "b", 3000),
                new Emp(4, "d", 8000));
//        Comparator myComparator = (Object i1, Object i2) -> {
//            Emp i=(Emp)i1;
//            Emp j=(Emp)i2;
//
//               if(i.getSal() >j.getSal())
//                   return -1;
//               else
//                   return 1;
//            };

      Map<String,Integer> map = list.stream()
                .sorted(Comparator.comparingInt(Emp::getSal).reversed())
                .limit(2)
                .collect(Collectors.toMap(Emp::getName,Emp::getSal));
        map.forEach((k,v)-> System.out.println(k+"->"+v));

    }
}

class Emp {

    private int id;
    private String name;
    private int sal;

    public Emp(int id,String name, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
