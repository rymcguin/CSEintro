import java.util.*;

public class TeamTest{
  public static void main(String[] args){ 
     
    //Test one: four teams, same days, different byweeks, different constructors*/
    // Build one team
    String[] team1Schedule = {"01/01","01/08","01/15","00/00","02/01","02/08","02/15","02/22",
      "03/01","03/08","03/15","03/22","04/01","04/08","04/15","04/22","05/01"};
    Team team1 = new Team("New York","Jets", team1Schedule);   
    System.out.println("Weeks played by team 1: " + Arrays.toString(team1.weeksPlayed));
    
    
    // Build a second team
    String[] team2Schedule = {"00/00","01/08","01/15","01/22","02/01","02/08","02/15","02/22",
      "03/01","03/08","03/15","03/22","04/01","04/08","04/15","04/22","05/01"};
    Team team2 = new Team("Buffalo", team2Schedule);   
    System.out.println("Weeks played by team 2: " + Arrays.toString(team2.weeksPlayed));
    
    
    // Build a third team
    String[] team3Schedule = {"01/01","01/08","01/15","01/22","02/01","02/08","02/15","02/22",
      "03/01","03/08","03/15","03/322","04/01","04/08","00/00","04/22","05/01"};
    Team team3 = new Team(team3Schedule);   
    System.out.println("Weeks played by team 3: " + Arrays.toString(team3.weeksPlayed));
    
    // Build a fourth team
    String[] team4Schedule = {"01/01","01/08","01/15","01/22","02/01","02/08","02/15","02/22",
      "03/01","03/08","03/15","03/22","04/01","04/08","04/15","04/22","00/00"};
    Team team4 = new Team("New England","Patriots", team4Schedule);   
    System.out.println("Weeks played by team 4: " + Arrays.toString(team4.weeksPlayed));
    
    // Find byweeks for all
    System.out.println("Team 1 byweek: " + team1.byWeek());
    System.out.println("Team 2 byweek: " + team2.byWeek());
    System.out.println("Team 3 byweek: " + team3.byWeek());
    System.out.println("Team 4 byweek: " + team4.byWeek());
    
    
    // Estimate sales for all
    System.out.println("Team 1 Week 1 Sales: " + Team.estimateSales(1, team1, 50.99, 100, 0.60));
    System.out.println("Team 2 Week 1 Sales: " + Team.estimateSales(1, team2, 50.99, 100, 0.80));
    System.out.println("Team 3 Week 1 Sales: " + Team.estimateSales(1, team3, 50.99, 100, 0.7));
    System.out.println("Team 4 Week 1 Sales: " + Team.estimateSales(1, team4, 50.99, 100, 0.99));
    
    // Print Sales for various combinations of the teams
    Team[] matchup1 = {team1,team2,team3,team4};
    System.out.println("Teams 1, 2, 3, 4 Total Sales During Week 1:");
    Team.printSales(matchup1, 50.99, 100, 1);
    System.out.println();
    System.out.println();
    
    System.out.println("Teams 1, 2, 3 Total Sales During Week 1:");
    Team[] matchup2 = {team1,team2,team3};
    Team.printSales(matchup2, 50.99, 100, 1);
    System.out.println();
    System.out.println();
    
    System.out.println("Teams 1 and 4 Total Sales During Week 1:");
    Team[] matchup3 = {team1,team4};
    Team.printSales(matchup3, 50.99, 100, 1);
    System.out.println();
    System.out.println();
    
    System.out.println("Team 3 Total Sales During Week 1:");
    Team[] matchup4 = {team3};
    Team.printSales(matchup4, 50.99, 100, 1);
    
    /* Beyond this, I will test the following test cases. However, I will not code these
     * up compeltely for you.  You should create these test cases on your own
     * in order to evaluate your class
     1) 4 teams that play on different days each week
           1a) Print sales for the weeks that these teams all play
           1b) Print sales for the weeks that at least one team has a byweek
     2) 4 teams such that two share at least one common day or days 
        and the others all play different days 
           2a) Print sales for the weeks that these teams all play, but some play each other
     3) Repeat all cases above for 3 teams, 2 teams, and 1 team
     4) Repeat cases above for different weeks (I use week 1 throughout my cases above, try 
        different weeks)*/
    
    /* !!!!!WARNING!!!!!! While I provide a text file that shows the output of the above code, 
     * all of your output should go to the console (i.e., do not print to a file) */
    
    
  }
  
 
}