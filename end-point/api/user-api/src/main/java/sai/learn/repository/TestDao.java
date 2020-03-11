package sai.learn.repository;

import lombok.Data;
import org.springframework.stereotype.Repository;
import sai.learn.entity.TestTable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class TestDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<TestTable> getTestTables() {


//        entityManager.
        return null;
//        return sessionFactory.openSession().createQ
    }

    public static void main(String[] args) {

        List<String> inv = new ArrayList<>();
        inv.add("a");
        inv.add("b");
        inv.add("c");
        inv.add("c");

        List<Emp> prop = new ArrayList<>();
        prop.add(new Emp("a"));
        prop.add(new Emp("b"));
//        prop.add(new Emp("c"));
        prop.add(new Emp("d"));
        prop.add(new Emp("f"));



//        planA(inv, prop);
        planB(inv,prop);


//        doThis();

        List<String> sai = Arrays.asList("a", "x", "c","s","d");

//        System.out.println(sai.retainAll(inv));
//        System.out.println(inv);
//        System.out.println(sai);

        System.out.println(sai.remove("a"));



    }



    private static void planB(List<String> inv, List<Emp> prop) {
        Map<String, Object> collect = prop.stream().collect(Collectors.toMap(Emp::getS, (emp) -> emp));
        inv.removeAll(collect.keySet());
        for (String tempInv : inv) {
            System.out.println(""+collect.put(tempInv, "Bla Bla Bla"));
        }
        System.out.println(collect);

        Arrays.asList("","")
        ;

    }

    private static void planA(List<String> inv, List<Emp> prop) {
        Map<String, Object> map = new HashMap<>();

        inv.forEach(invoice -> {
            try {
                map.put(invoice,
                        prop.stream()
                                .filter(emp -> emp.getS().equalsIgnoreCase(invoice))
                                .findFirst()
                                .get()
                );
            } catch (Exception e) {
                map.put(invoice, "No Data Found");
//                System.out.println(e.getMessage());
            }
        });

        System.out.println(map);
    }

    private static void doThis() {
        Set s = new TreeSet(new EmpCompartr());

        s.add(new Emp("SAi"));
        s.add(new Emp("Sai"));
        s.add(new Emp("Sai"));
        System.out.println(s);

        Map ihm = new IdentityHashMap();
        ihm.put(new String("SAI"), "Sai");
        ihm.put(new String("SAI"), "Sai");
        System.out.println(ihm);
        System.out.println(ihm.get(new String("SAI")));

    }

}

class EmpCompartr implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getS().toUpperCase().hashCode() - o2.getS().toUpperCase().hashCode();
    }
}

@Data
class Emp {
    private String s;

    public Emp(String s) {
        this.s = s;
    }
}
