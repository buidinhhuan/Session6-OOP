package ra;

// cus phap khai baso lowps : class + [tên lớp]
public class Student {
    String name ;
    int age;
    String msv;

    // hàm khởi tạo đối tượng
    public Student( ){}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", msv='" + msv + '\'' +
                '}';
    }

    public Student(String name, int age, String msv ){
        this.name = name;
        this.age = age;
        this.msv = msv;
    }public Student(String name, String msv ){
        this.name = name;
        this.msv = msv;
    }
    //  phuong thuc getter .setter
    public String getName(){
        return  this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
