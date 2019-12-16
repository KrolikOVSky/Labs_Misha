import java.util.Date;
public class Lab1
{
    public static void main(String args[]) 
    {
        Date date = new Date();
        
        int numStud = 31;
        int numGrup = 2;
        int numRez = numStud * numGrup;
        String teacherName = "Волкова Татьяна Викторовна";
        String studentName = "Акулов Михаил Мимхайлович";
        String group = "ИВТ/б-19-2-о";
        
        System.out.println("Программу выполнил:\n" + studentName);
        System.out.println("Шифр группы: " + group);
        System.out.println("Дата: " + date);
        System.out.println("Номер варианта: 1 ");
        System.out.println("Число студентов в группе: " + numStud);
        System.out.println("Число групп в потоке: " + numGrup);
        System.out.println("Всего студентов в потоке: " + numRez);
        System.out.println("Проверила:\n" + teacherName);
    }
}
