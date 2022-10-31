import java.util.Scanner;

class student{
    int[] marks=new int[10];
    void input(){
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<10;i++){
            marks[i]= obj.nextInt();
        }

    }
    void display(){
        for(int i=0;i<10;i++){
            System.out.println(marks[i]);
        }
    }
}
public class Exp3_4 {
    public static void main(String[] args) {
        student a=new student();
        a.input();
        a.display();
    }
}
