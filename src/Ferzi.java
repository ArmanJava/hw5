import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ferzi {
    private static Integer x = 0;

    private static Integer y = 0;
    public static int[][] desc = new int[100][100];



    public static void main(String[] args) throws IOException {
        add();


    }

    public static void add() {



            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("РАССПОЛОЖИТЕ ФЕРЗИ НА СЕТКЕ");
                System.out.println(" ПРОВЕРЯЮТСЯ ВСЕ ЛИНИИ");
                System.out.println(" ПРОСМОТРИТЕ ВСЮ ЛИНИЮ СООБЩЕНИЙ");

                for (int i = 0; i < 7; i++) {
                    System.out.println("ВВЕДИТЕ Х");
                    setX(x = Integer.parseInt(reader.readLine()));
                    System.out.println("ВВЕДИТЕ Y");
                    setX(y = Integer.parseInt(reader.readLine()));
                    set(desc);
                    proverka();
                }

                add();
            } catch (IOException e) {
                e.printStackTrace();
            }



    }


    public static void set(int desc[][]) {
        if (!isEmpty()) {
            desc[x][y] = 1;
            System.out.println("ФЕРЗЬ УСТАНОВЛЕН");
        } else {
            System.out.println("Уже занято");
        }

    }

    public static void  proverka() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {

                if (desc[getX()+i][getY()+j]>0||desc[getX()][getY()+j]>0||desc[getX()+i][getY()]>0 ){
                    System.out.println("ПОПАЛ ПО ФЕРЗЮ");
                }
            }
        }

    }





    public static boolean isEmpty() {
        if (desc[x][y] == 0) {
            return false;

        }
        return true;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Ferzi.x = x;
    }


    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Ferzi.y = y;
    }
}
