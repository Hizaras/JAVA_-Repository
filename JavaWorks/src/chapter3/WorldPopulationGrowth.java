package chapter3;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        long population = 200_000_000;
        final double percentageIncrease = 0.15;
        long newPopulation = 0;
        long populationIncrease = 0;
        int year = 1;

       System.out.printf("%s %20s %20s%n" , "Year " , " Current Year Population " , " Population Increase ");

       while (year <= 75){
       newPopulation = (long) (population * percentageIncrease) + population;
       populationIncrease = newPopulation - population;

           System.out.printf("%d%20d%20d%n" , year , newPopulation , populationIncrease);
           population = newPopulation;
           year++;
           }
    }
}