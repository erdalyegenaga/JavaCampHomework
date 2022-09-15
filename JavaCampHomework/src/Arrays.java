public class Arrays {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Erdal";
        students[1] = "Hazal";
        students[2] = "İlkay";

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("**********");
        for(String student : students){
            System.out.println(student);
        }
    }
}
