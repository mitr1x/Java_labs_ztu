
import java.util.Formatter;
public class Main3 {


    public static void main(String[] args) {

        Formatter f1 = new Formatter();
        Formatter f2 = new Formatter();
        Formatter f3 = new Formatter();
        Formatter f4= new Formatter();
        Formatter sumall = new Formatter();
        Double Price1 = 1500.78;
        Double Price2 = 1000.56;
        Double Price3 = 500.78;
        Double Price4 = 550.78;
        f1.format("|%10.2f|",  Price1  );
        f2.format("|%10.2f|",  Price2 );
        f3.format("|%10.2f|",  Price3);
        f4.format("|%10.2f|",  Price4);

        Double sum = Price1+ Price2 + Price3+ Price4;
        sumall.format("|%10.2f|",  sum);
        System.out.println("\nДата та час покупки: \t\t28.03.2019 13:25:12"
                + "\n=============================================="
                + "\n№\tТовар\t\tКатегорія \t\t\tЦіна"
                + "\n=============================================="
                + "\n1.\tДжинси\t\tЖіночий одяг \t" + f1+" ₴"
                + "\n2.\tСпідниця\tЖіночий одяг \t" + f2+" ₴"
                + "\n3.\tКраватка\tЧоловічий одяг \t" + f3+" ₴"
                + "\n4.\tКраватка2\tЧоловічий одяг \t" + f4+" ₴"
                + "\n============================================="
                + "\nРазом: \t\t\t\t\t\t\t" + sumall+" ₴");


    }

}

