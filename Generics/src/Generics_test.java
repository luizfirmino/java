import java.util.ArrayList;

public class Generics_test {

    public static void main(String[] args){

        Triple<String, Integer, Integer> oT1 = new Triple<>("Team 1", 10, 10);
        Triple<String, Integer, Integer> oT2 = new Triple<>("Team 2", 15, 5);
        Triple<String, Integer, Integer> oT3 = new Triple<>("Team 3", 13, 7);
        Triple<String, Integer, Integer> oT4 = new Triple<>("Team 4", 19, 1);
        Triple<String, Integer, Integer> oT5 = new Triple<>("Team 5", 8, 12);

        Triple<String,Integer,Integer>[] aoTriple = new Triple[5];
        aoTriple[0] = oT1;
        aoTriple[1] = oT2;
        aoTriple[2] = oT3;
        aoTriple[3] = oT4;
        aoTriple[4] = oT5;

        Pair<String,Double>[] aoPair = new Pair[5];

        for(int i=0; i < aoTriple.length; i++){

            String team =   aoTriple[i].getFirst();
            double wins =  aoTriple[i].getSecond();
            double loses = aoTriple[i].getThird();
            double perWin = (wins / (wins + loses));

            Pair<String,Double> oTempPair = new Pair<>(team, perWin);
            aoPair[i] = oTempPair;
            oTempPair = null;

        }

        int teamWin = 0;
        double highestWinPerc = 0;
        for(int i=0; i < aoPair.length; i++){
            if (highestWinPerc < aoPair[i].getSecond()){
                highestWinPerc = aoPair[i].getSecond();
                teamWin = i;
            }
            System.out.println(aoPair[i].getFirst() + ": " + (aoPair[i].getSecond() * 100) + "%");
        }
        System.out.println("The team: " + aoPair[teamWin].getFirst() + " has the highest win percentage!");

    }

}
