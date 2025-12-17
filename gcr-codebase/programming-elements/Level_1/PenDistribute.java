public class PenDistribute{
   public static void main(String args[]){
    
     int pen = 14;
     int students = 3;
     
     // each student get pens
      int eachStudentsPen = pen/students;
    
     // remaining pens 
       int remaningPen = pen%students;

       System.out.println("The Pen Per Student is "+ eachStudentsPen + " and the remaining pen not distributed is "+ remaningPen );
    }
}
