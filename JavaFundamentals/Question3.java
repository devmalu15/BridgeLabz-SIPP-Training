public class Question3 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int remaining_pen = pens % students;
        int pens_per_student = pens / students;

        System.out.println("The Pen Per Student is " + pens_per_student + " and the remaining pen not distributed is " + remaining_pen);
    }
    
}
