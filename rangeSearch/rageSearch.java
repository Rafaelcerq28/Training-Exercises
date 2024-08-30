import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class rageSearch {


    public static void main(String[] args) {
        //valores de latitude e longitude
        double lon = 53.35804;
        double lat = -6.24800;

        //calcula as novas lat e long de acordo com a porcentagem
        double newLonPlus = ((lon/100) * 0.003) + lon;
        double newLonMinus = ((lon/100) * 0.003);
        newLonMinus = lon - newLonMinus;

        //a porcentagem deve ser diferente aqui, pois a latitude é muito menor
        double newLatMinus = ((lat/100) * 0.04) + lat;
        double newLatPlus = ((lat/100) * 0.04);
        newLatPlus = lat - newLatPlus;

        //BigDecimal armazena os lats e longs 
        BigDecimal bdLonPlus = new BigDecimal(newLonPlus).setScale(5, RoundingMode.HALF_UP);
        BigDecimal bdLonMinus = new BigDecimal(newLonMinus).setScale(5, RoundingMode.HALF_UP);

        BigDecimal bdLatMinus = new BigDecimal(newLatMinus).setScale(5, RoundingMode.HALF_UP);
        BigDecimal bdLatPlus = new BigDecimal(newLatPlus).setScale(5, RoundingMode.HALF_UP);

        //converte o bigDecimal pra double e salva nas variaveis
        newLonPlus = bdLonPlus.doubleValue();
        newLonMinus = bdLonMinus.doubleValue();

        newLatMinus = bdLatMinus.doubleValue();
        newLatPlus = bdLatPlus.doubleValue();

        //imprime os valores
        System.out.println("Old: [" + lon + ", " + lat+"]");
        System.out.println("New Lon+:  [" + newLonPlus + ", " + lat+"]");
        System.out.println("New Lat-: [" + lon + ", " + newLatMinus+"]");
        System.out.println("New Lat+: [" + lon + ", " + newLatPlus+"]");
        System.out.println("New Lon-: [" + newLonMinus + ", " + lat+"]");
        System.out.println("New Lon+ lat+: [" + newLonPlus + ", " + newLatMinus+"]");

        System.out.println("cruz montada");

        //teste com kms
        double lonKm = 111.32;


        lon = 53.35683;
        double teste = lon/5000;
        System.out.println("lonkm " + lonKm / 50000);
        System.out.println("teste " + teste);
        System.out.println("lon+teste " + (lon + teste));
        teste = lonKm / 50000;
        System.out.println("lon+lonkm " + (lon + teste));
        System.out.println(Math.hypot(5, 5));
        //fim teste com kms
    }
}
