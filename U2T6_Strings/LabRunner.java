package U2T6_Strings;

public class LabRunner {
    public static void main(String[] args) {
        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo();
        System.out.println(info);
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());


        


    }
}
