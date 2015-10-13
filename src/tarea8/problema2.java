package tarea8;

/**
 * Created by yamir on 10/12/15.
 */
public class problema2 {
    /* programa que imprima la siguiente serie matematica de valores
            1,5,3,7,5,9,7,11...23
     */
    public static void main(String[] args){

    int x = 1;

        do
        {
            System.out.print(x + ", ");
            x += 4;
            System.out.print(x+", ");
            x -= 2;

        } while (x<20);
        System.out.println(" ");
        int y = 1;

        while (y<20){
            System.out.print(y + ", ");
            y += 4;
            System.out.print(y+", ");
            y -= 2;

        }

    }
}


