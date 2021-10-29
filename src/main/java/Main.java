import java.io.*;

public class Main {

    public static void main (String args[]) throws IOException{

        int[] nums = {1, 10, 7}; //массив с данными
        String fileName = "nums.txt";
        File file = new File(fileName); //файл в который положим массив

//        проверяем наличие файла, если нет создаем
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        //записываем массив чисел в файл
        try {
            PrintWriter pw = new PrintWriter(file);
            for (int el : nums) {
            pw.println(el);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //считываем данные из файла и выполняем  алгоритм
        BufferedReader br = null;
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null){
                checkNumb(Integer.parseInt(line));

        }

    }

//метод алгоритма
    public static String checkNumb(Integer num){
        String res;
        if(num%3==0 && num%5==0 )
            res = "FizzBuzz";
        else if (num%3==0)
            res = "Fizz";
        else if (num%5==0)
            res = "Buzz";
        else res = String.valueOf(num);
    return res;
    }

}
