public class StudentClient {

    public static void main(String[] args) {
        System.out.println("Hey");

        Student s = new Student(); //  new Student is called Object and s is refernce variable 
                                     //  ek baat aur string ka default value null hota hai and integet ka 0

        // System.out.println(s.name);
        // System.out.println(s.age);

        s.name = "kartik";
        s.age = 20;

        s.Intro_yourSelf();


        Student s1 = new Student();

        s1.name = "Jatin";
        s1.age = 21;
        s1.Intro_yourSelf();
    }
}