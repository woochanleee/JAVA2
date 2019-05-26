//import java.net.InterfaceAddress;
//
//class StudentInfo{
//    public int grade;
//    StudentInfo(int grade){ this.grade = grade; }
//}
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person<T, S>{
//    public T info;
//    public S id;
//    Person(T info, S id){
//        this.info = info;
//        this.id = id;
//    }
//    public <U> void printInfo(U info){
//        System.out.println(info);
//    }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        Integer i = new Integer(10);
//        EmployeeInfo e = new EmployeeInfo(1);
//        //Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
//       Person p1 = new Person(e, i);
////        System.out.println(p1.id.intValue( ));
//        p1.printInfo(e);
//    }
//}
interface Info{
    public abstract int getLevel();
}

class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank;}
    public int getRank(){
        return this.rank;
    }

    @Override
    public int getLevel() {
        return 0;
    }
}class Person<T extends Info>{
    public T info;
    Person(T info){
        this.info = info;
    info.getLevel();
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
    }
}