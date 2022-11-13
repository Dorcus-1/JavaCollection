package school;

import java.util.*;

public class Student {
    private String name;
    private int stuId;

    Student(String name, int stuId){
        this.name=name;
        this.stuId=stuId;
    }

    public String getName() {
        return name;
    }

    public int getStuId() {
        return stuId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuId=" + stuId +
                '}';
    }

//    class crudeDemo{
//
//    }

    public static  void main(String[] args){
        int ch;
        List<Student> c= new ArrayList<Student>();
        Scanner sc= new Scanner(System.in);
        Scanner scLine= new Scanner(System.in);
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter you choice:");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter your name:");
                    String nm= scLine.nextLine();
                    System.out.println("Enter your Id:");
                    int id= sc.nextInt();

                    c.add(new Student(nm,id));
                    break;

                    case 2:
                        System.out.println("-------------------------");
                        Iterator<Student> i= c.iterator();
                        while (i.hasNext()){
                            Student s= i.next();
                            System.out.println(s);
                        }
                        System.out.println("-------------------------");
                    break;

                case 3:
                    boolean found= false;
                    System.out.println("Enter student id:");
                    int studentId=sc.nextInt();
                    System.out.println("-------------------------");
                    i= c.iterator();
                    while (i.hasNext()){
                        Student sr= i.next();
                        if(sr.getStuId()==studentId){
                            System.out.println(sr);
                            found=true;
                        }

                    }
                    System.out.println("-------------------------");
                    if(!found){
                        System.out.println("Record not found");
                    }
                    System.out.println("-------------------------");
                    break;
                case 4:
                     found= false;
                    System.out.println("Enter student id to delete:");
                    studentId=sc.nextInt();
                    System.out.println("-------------------------");
                    i= c.iterator();
                    while (i.hasNext()){
                        Student sr= i.next();
                        if(sr.getStuId()==studentId){
                           i.remove();
                            found=true;
                        }

                    }
                    System.out.println("-------------------------");
                    if(!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Deleted successfully");
                    }
                    System.out.println("-------------------------");
                    break;

                case 5:
                    found= false;
                    System.out.println("Enter student id to update:");
                    studentId=sc.nextInt();
                    System.out.println("-------------------------");
                    ListIterator<Student> li= c.listIterator();
                    while (li.hasNext()){
                        Student sr= li.next();
                        if(sr.getStuId()==studentId){
                            System.out.println("Enter your name:");
                            nm= scLine.nextLine();
                            System.out.println("Enter your Id:");
                            id= sc.nextInt();
                            found=true;
                            li.set(new Student(nm,id));
                        }

                    }
                    System.out.println("-------------------------");
                    if(!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Updated successfully");
                    }
                    System.out.println("-------------------------");
                    break;
            }

        }while(ch!=0);

    }
}
