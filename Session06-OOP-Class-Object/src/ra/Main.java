package ra;

public class Main {
    public static void main(String[] args) {
        //khoi tao doi tuong :class_name > <object_name> = new <class_name>
        Student student = new Student("huan", 24, "1102");
        System.out.println(student);
        Student student1 = new Student("cho khanh", "9999");
        System.out.println(student1);

        //constructor không tham số
        Student student2 = new Student();
        System.out.println("student" + student2);
        //thay đổi  thuộc tíh name thông qua phương thức setter
        student.setName("hieucamau");
        // goi phuong thuc
        System.out.println(student.getName());
    }
}
