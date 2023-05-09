import java.io.*;
import java.nio.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)  {

        Dop dop = new Dop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("wayIn: ");//S://Итмо/Программирование/5лаба/dop/src/read1.txt
        String wayIn = scanner.nextLine();
        System.out.println("wayOut: ");//S://Итмо/Программирование/5лаба/dop/src/save1.txt
        String wayOut = scanner.nextLine();
        dop.Sort(wayIn, wayOut);
        System.out.println("wayIn: ");//S://Итмо/Программирование/5лаба/dop/src/read2.txt
        wayIn=scanner.nextLine();
        System.out.println("Symbol: ");
        String symbol = scanner.nextLine();
        dop.Symbol(wayIn, symbol);

    }

}