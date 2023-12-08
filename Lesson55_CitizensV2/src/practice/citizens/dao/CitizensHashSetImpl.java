package practice.citizens.dao;

import practice.citizens.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CitizensHashSetImpl implements Citizens{
    // fields
    private HashSet<Person> idList; // список граждан по id

    private HashSet<Person> lastNameList; // список граждан по фамилиям

    private HashSet<Person> ageList; // список граждан по возрасту
    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по алфавиту по фамилиям
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge()); // сортировка по кол-ву лет
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    // constructor
    // пустой конструктор
    public CitizensHashSetImpl() {
        idList = new HashSet<>(); // создаем пустой лист
        lastNameList = new HashSet<>();
        ageList = new HashSet<>();
    }

    public CitizensHashSetImpl(List<Person> citizens) {
        this(); // вызов пустого конструктора
        for (Person person : citizens) {
            add(person);
        }
    }

    @Override
    public boolean add(Person person) {
        return person !=null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    @Override
    public boolean remove(int id) {
        Person person = find(id);
        return person != null && idList.remove(person) && lastNameList.remove(person)&& ageList.remove(person);
    }

    @Override
    public Person find(int id) {
        for (Person p:idList

             ) {if (p.getId()== id)
                 return p;

        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        return null; // TODO
    }

    @Override
    public Iterable<Person> find(String lastName) {
        return null; // TODO
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        List <Person> sortedList =new ArrayList<>(ageList);
        sortedList.sort(ageComparator);
        return sortedList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        List <Person> sortedList =new ArrayList<>(lastNameList);
//        for (Person p: lastNameList
//             ) {sortedList.add(p);
//        }
        sortedList.sort(lastNameComparator);
        return sortedList;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
