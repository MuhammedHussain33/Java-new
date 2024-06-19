//public class Main {
//
//    public static void myFunc(int k){
//        if (k>20){
//            System.out.println("greater");
//        }else {
//            System.out.println("lesser");
//        }
//    }
//
//    public static void newS(int a){
//        int y=a++;
//        System.out.println(y);
//        System.out.println(a);
//    }
//
//    public static void weekend(int d){
//      if(d==1){
//          System.out.println("Monday");
//      }if (d==2){
//            System.out.println("tuesday");
//        }if(d==3){
//            System.out.println("Wednesday");
//        }else{
//            System.out.println("Error");
//        }
//    }
//
//    public static void newLeapyear(int q){
//        if(q%4==0){
//            if (q%100==0){
//                if (q%400==0){
//                    System.out.println(q+"Leapyear");
//                }else{
//                    System.out.println(q+"is not");
//                }
//            }else {
//                System.out.println(q+"is leap  yr");
//            }
//            }else {
//            System.out.println(q+"is not");
//        }
//    }
//
//    public static void OdEvn(int d){
//        if(d%2==0){
//            System.out.println("even number");
//        }else {
//            System.out.println("Odd number");
//        }
//
//    }
//
//    public static void Fibannocci(int p){
//       int first=0;
//       int second=1;
//
//       for (int i=0;i<=p;i++){
//           System.out.println(first+" ");
//
//           int third=first+second;
//           first=second;
//           second=third;
//       }
//    }
//
//    public static void StringPalindrome(String a){
//       String reverse="";
//
//        for (int i = a.length()-1; i>=0; i--) {
//            reverse=reverse+a.charAt(i);
//        }if (a.equals(reverse)){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }
//
//    }
//
//    public static int Factorial(int a){
//        if(a==0){
//            return 1;
//        }
//        return a*Factorial(a-1);
//    }
//
//
//    public static long Fact(int num){
//    long result=1;
//
//        for (int i = 1; i <=num ; i++) {
//            result *= i;
//        }
//
//        return result;
//}
//
//
//
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner calFact=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int sum= calFact.nextInt();
//        long factorial=Fact(sum);
//        System.out.println("the factorial of "+sum+"    is "+factorial);
//
//        Myname("Husain");
//        Mynumber(12);
//
//        Pattern(10);
//        myFunc(33);
//        newS(10);
//        weekend(5);
//        newLeapyear(2021);
//        OdEvn(12);
//        Fibannocci(5);
//        StringPalindrome("radars");
//        System.out.println("result is "+Factorial(6));
//
////        InputStreamReader r=new InputStreamReader(System.in);
////        BufferedReader br=new BufferedReader(r);
////        System.out.println("Enter your Name");
////        String name= br.readLine();
////        System.out.println("my name is "+name);
//
//
////        Scanner myObj=new Scanner(System.in);
////        System.out.println("Enter your name");
////        String userName=myObj.nextLine();
////        System.out.println("my name is "+userName);
//
////        Scanner mySum=new Scanner(System.in);
////        System.out.println("Enter first num");
////        int first=mySum.nextInt();
////        System.out.println("Enter second num");
////        int Second=mySum.nextInt();
////        System.out.println(first+Second);
//
//
////        Scanner myRad=new Scanner(System.in);
////        double pie=3.14;
////        System.out.println("Enter Radious");
////        double rsd=myRad.nextDouble();
////        System.out.println(pie*rsd*rsd);
//
////        Scanner Mul=new Scanner(System.in);
////        System.out.println("Enter your number");
////        int num=Mul.nextInt();
////        for (int i = 1; i <=10 ; i++) {
////            int a=num*i;
////            System.out.println(num+"*"+i+"="+a);
////        }
//        Scanner Pattern=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num= Pattern.nextInt();
//
//        int i,j;
//
//        for ( i = 1; i <=num ; i++) {
//            String a="";
//            for ( j = 1; j <=i; j++) {
//                a+="*";
//            }
//            System.out.println(a);
//        }
//
//    }
//}
//
//
//class Base{
//    int id=101;
//    String name="HUSAIN";
//}
//class Student{
//    public static void main(String[] args) {
//        Base s1=new Base();
//        System.out.println(s1.id+" "+s1.name);
//    }
//}
//
//class Base1{
//    int id;
//    String name;
//}
//
//class Student1{
//    public static void main(String[] args) {
//        Base d1=new Base();
//        d1.id=123;
//        d1.name="Muhammed";
//
//        System.out.println(d1.id+" "+d1.name);
//
//        Base d2=new Base();
//        d2.id=321;
//        d2.name="John";
//
//        System.out.println(d2.id+" "+d2.name);
//    }
//}
//
//
//
//class student1{
//    int id;
//    String name;
//    String address;
//    Long phone;
//
//    student1(int i,String j,String k,long l){
//        id=i;
//        name=j;
//        address=k;
//        phone=l;
//    }
//
//    void display(){
//        System.out.println("Id:"+id+" "+"Name :"+name+" "+"Address: "+address+" "+"Phone: "+phone);
//    }
//
//
//    public static void main(String[] args) {
//        student1 s1=new student1(101,"Husain","ckz",90322342313L);
//        student1 s2=new student1(101,"Amal","klm",1443243224324L);
//        student1 s3=new student1(101,"Alita","vmd",93222423443432L);
//        s1.display();
//        s2.display();
//        s3.display();
//    }
//
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of users: ");
//        int numberOfUsers = scanner.nextInt();
//        scanner.nextLine();
//
//        User[] users = new User[numberOfUsers];
//
//        for (int i = 1; i < numberOfUsers; i++) {
//            System.out.println("Enter details for user " + (i + 1) + ":");
//
//            System.out.print("Enter ID: ");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("Enter Name: ");
//            String name = scanner.nextLine();
//
//            System.out.print("Enter Address: ");
//            String address = scanner.nextLine();
//
//            System.out.print("Enter Phone Number: ");
//            String phoneNumber = scanner.nextLine();
//
//            users[i] = new User(id, name, address, phoneNumber);
//        }
//        System.out.println("\nUser Details:");
//        for (User user : users) {
//            System.out.println(user);
//        }
//        scanner.close();
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        searchAll a=new searchAll();
//        searchImages i=new searchImages();
//        searchVedios v=new searchVedios();
//
//
//        v.search();
//        v.message();
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        AudioCall a=new AudioCall();
//        Vediocall v=new Vediocall();
//        a.disconnect();
//
//        v.calls();
//        v.mute();
//        v.disconnect();
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner e=new Scanner(System.in);
//        System.out.println("Enter empolyee name : ");
//        String name=e.nextLine();
//        System.out.println("Enter your Phone Number : ");
//        int phone=e.nextInt();
//
//        System.out.println("Name: "+name);
//        System.out.println("Number: "+phone);;
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner n=new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name=n.nextLine();
//        System.out.println("Enter Password: ");
//        int password=n.nextInt();
//
//        String dataname="Husain";
//        int dataPassword=123;
//
//
//        if (name.equals(dataname)){
//            if (password==dataPassword){
//                System.out.println("Login sucsessfull");
//            }else {
//                System.out.println("Login fail");
//            }
//        }else {
//            System.out.println("Login Failed");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age=s.nextInt();
//
//        if (age >= 0) {
//            if (age<=12){
//                System.out.println("You are child");
//            } else if (age<=19) {
//                System.out.println("You are Teenager");
//
//            } else if (age<=50) {
//                System.out.println("Adult");
//            }else {
//                System.out.println("You are senior");
//            }
//        }else {
//            System.out.println("Invalid age entered");
//        }
//    }
//}


//class Animal{
//    void eat(){
//        System.out.println("Eating....!");
//    }
//}
//
//class cat extends Animal{
//     void catSound(){
//         System.out.println("mewww");
//     }
//}
//
//class dog extends Animal{
//    void dogSound(){
//        System.out.println("bark");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//       cat Ct=new cat();
//       dog Dg=new dog();
//
//       Ct.eat();
//       Ct.catSound();
//
//       Dg.eat();
//       Dg.dogSound();
//
//    }
//}


//class Vehicle{
//    void drive(){
//        System.out.println("car driving");
//    }
//}
//
//class Car extends Vehicle{
//    void repair(){
//        System.out.println("Car repaired");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//       Car c=new Car();
//
//       c.drive();
//       c.repair();
//
//    }
//}


//class Employee{
//    void work(){
//        System.out.println("work hard...@!");
//    }
//}
//
//class HRmanager extends Employee{
//    void getSalary(){
//        System.out.println("Salary credited sucessfully...!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        HRmanager h=new HRmanager();
//
//        h.getSalary();
//        h.work();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        File f=new File("C:/Users/mammo/OneDrive/Documents/GitHub/Sample.txt");   ////creating file using path name
//
//        try {
//            boolean status= f.createNewFile();
//            if(status){
//                System.out.println("New File created");
//            }else {
//                System.out.println("File already exist");
//            }
//        }catch (Exception e){
//            System.out.println("error occured...!");
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String message="Learn java programming";
//
//        try {
//            FileWriter fw=new FileWriter("C:/Users/mammo/OneDrive/Documents/GitHub/Sample.txt");
//            fw.write(message);       ///write a message using write method
//            System.out.println("Message written to file...!");   ////////insert text to the Sample.txt file
//            fw.close();
//        }catch (Exception e){
//            System.out.println("An error occurred...!");
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        char[] data=new char[100];       ///how much charecters reading defined
//
//        try {
//           FileReader fr=new FileReader("C:/Users/mammo/OneDrive/Documents/GitHub/Sample.txt");
//           fr.read(data);          /////////////data read using read method from text file
//            System.out.println(data);
//
//            fr.close();
//        }catch (Exception e){
//            System.out.println("An error occurred");
//        }
//    }
//}

////////////////////delete

//public class Main {
//    public static void main(String[] args) {
//        try {
//            File n=new File("C:/Users/mammo/OneDrive/Documents/GitHub/Sample2.txt");
//            n.delete();
//            System.out.println("file deleted");
//        }catch (Exception e){
//            System.out.println("An error occurred");
//        }
//    }
//}


//class Vehicle {
//    void run(){
//        System.out.println("this vehicle is running");
//    }
//}
//
//class car extends Vehicle{
//    void repair(){
//        System.out.println("car is running");
//    }
//}
//
//class bus extends Vehicle{
//    void service(){
//        System.out.println("Bus service sucessfully");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        car c=new car();
//        bus b=new bus();
//
//        c.run();
//        c.repair();
//
//        b.run();
//        b.service();
//
//    }
//}

///////////////////////////////multilevel inheritance

// class grandParent{
//    void printGrandParent(){
//        System.out.println("i am the grand pareent class");
//    }
// }
//
// class parent extends grandParent{
//    void printParent(){
//        System.out.println("i am the parent class");
//    }
// }
//
// class child extends parent{
//    void printChild(){
//        System.out.println("i am the child class");
//    }
// }
//
//public class Main {
//    public static void main(String[] args) {
//        child c=new child();
//
//        c.printGrandParent();
//        c.printParent();
//        c.printChild();
//    }
//}


////multiple inheritance (through interface)


//interface shape{
//    double getArea();
//}
//
//interface color{
//    String getColor();
//}
//
//class circle implements shape,color{
//    private double radius;
//    private String color;
//
//    public circle(double radius,String color){
//        this.radius=radius;
//        this.color=color;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI*radius*radius;
//    }

//    @Override
//    public String getColor() {
//        return color;
//    }
//
//    public void displayInfo(){
//        System.out.println("cicle with radious: "+radius);
//        System.out.println("Area: "+getArea());
//        System.out.println("Color: "+getColor());
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        circle c=new circle(5.0,"Red");
//        c.displayInfo();
//    }
//}


//class Employee{
//    void work(){
//        System.out.println("Working Employees");
//    }
//
//    double getSalary(){
//        return 10000;
//    }
//}
//
//class HRmanager extends Employee{
//    void work(){
//        System.out.println("Hrmanager splitting works");
//    }
//
//    void addEmpoloyee(String employeeName){
//        System.out.println("Adding new employee: "+employeeName);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Employee e=new Employee();
//        HRmanager h=new HRmanager();
//        e.work();
//        System.out.println("Slary: "+e.getSalary());
//
//        h.work();
//        System.out.println("Slary: "+h.getSalary());
//        h.addEmpoloyee("Dcruzza666");
//
//    }
//
//}


//class husain{
//    int ne(int n){
//        return n*n;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//       husain h=new husain();
//
//        System.out.println(h.ne(32));
//
//    }
//}


//////////////java interface example

//interface Bank{
//    int rateofInterest();
//}
//class Sbi implements Bank{
//    public int rateofInterest(){
//        return 9;
//    }
//}
//class Pnb implements Bank{
//    public int rateofInterest(){
//        return 10;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Bank b=new Sbi();
//        Bank p=new Pnb();
//
//        System.out.println("Rate of interest in sbi: "+b.rateofInterest());
//        System.out.println("Rate of interest in pnb: "+p.rateofInterest());
//    }
//}

//class Animal{
//    void sound(){
//    }
//}
//class Bird extends Animal{
//    @Override
//    void sound() {
//        System.out.println("bird sound..!");
//    }
//}
//
//class Cat extends Animal{
//    @Override
//    void sound() {
//        System.out.println("cat sound..!");
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Bird b=new Bird();
//        Cat c=new Cat();
//
//        b.sound();
//        c.sound();
//    }
//}


//class Vehicle{
//      void speedUp(){
//          System.out.println("main sound");
//      }
//}
//class car extends Vehicle{
//    void speedUp(){
//        System.out.println("Car speed around 80 kmph");
//    }
//}
//class bicycle extends Vehicle{
//    void speedUp(){
//        System.out.println("Bicycle speed around 20 kmph");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        car c=new car();
//        bicycle b=new bicycle();
//
//        c.speedUp();
//        b.speedUp();
//    }
//}


//class Vehicle{
//    int speed;
//    public Vehicle(){
//        this.speed=0;
//    }
//    public void speedUp(){
//        System.out.println("Vehicle is speeding up");
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//}
//
//
//class car extends Vehicle{
//    public void speedUp(){
//        speed += 10;
//        System.out.println("Car speed increased to: "+speed+"km/hr");
//    }
//}
//
//class Bicycle extends Vehicle{
//    public void speedUp(){
//        speed += 3;
//        System.out.println("Bicycle speed increased to: "+speed+"km/hr");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Vehicle myCar = new car();
//        Vehicle myBicycle = new Bicycle();
//
//        System.out.println("Speeding up the car:");
//        myCar.speedUp();
//        myCar.speedUp();
//
//
//        System.out.println("Speeding up the Bicycle:");
//        myBicycle.speedUp();
//        myBicycle.speedUp();
//        myBicycle.speedUp();
//    }
//}



//class  Vehicle {
//    String model;
//    String make;
//
//     Vehicle(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }
//
//     void displayDetails() {
//        System.out.println(this.make +" "+ this.model);
//    }
//}
//
//class Car extends Vehicle{
//    int noofDoors;
//    Car(String make,String model,int noofDoors){
//        super(make,model);
//        this.noofDoors=noofDoors;
//
//    }
//
//    void displayDetails(){
//        System.out.println(make+" "+model+" "+noofDoors);
//    }
//}
//
//class Truck extends Vehicle{
//    double loadCapacity;
//     Truck(String make,String model,double loadCapacity){
//         super(make,model);
//         this.loadCapacity=loadCapacity;
//
//    }
//    void displayDetails(){
//        System.out.println(make+" "+model+" "+loadCapacity+"Tons");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//       Vehicle [] v=new Vehicle[]{
//               new Car("Suzuki","Swift",4),
//               new Car("Mahendra","Xuv",5),
//               new Truck("Tata","Prime",2.3),
//               new Truck("Leyland","Mrco",4.32),
//       };
//
//           for (Vehicle vh : v){
//               vh.displayDetails();
//           }
//    }
//}

//class Course{
//    String courseName;
//    String courseCode;
//
//    Course(String courseName,String courseCode){
//        this.courseName=courseName;
//        this.courseCode=courseCode;
//    }
//
//    void displayDetails(){
//        System.out.println(courseName+courseCode);
//    }
//}
//
//class online extends Course{
//    String platfom;
//    online(String courseName,String courseCode,String platfom){
//        super(courseName,courseCode);
//        this.platfom=platfom;
//    }
//
//    @Override
//    void displayDetails() {
//        System.out.println(courseName+" "+courseCode+" "+platfom);
//    }
//}
//
//class offline extends Course{
//    String location;
//    offline(String courseName,String courseCode,String location){
//        super(courseName,courseCode);
//        this.location=location;
//    }
//
//    @Override
//    void displayDetails() {
//        System.out.println(courseName+" "+courseCode+" "+location);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Course[] c=new Course[]{
//                new online("Python","Py","M teams"),
//                new offline("Java","Jv","Tvm"),
//        };
//        for (Course co:c){
//            co.displayDetails();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//       searchPerson s=new searchPerson();
//
//       s.search();
//
//       s.message();
//    }
//}

