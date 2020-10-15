/*
CSE 17
Ryan McGuiness
rcm421@lehigh.edu
841369121
Homework #2   DEADLINE: May 31, 2019
Program: Team Class
*/
import java.text.DecimalFormat;
public class Team {
    //Data Fields
    String locationName = "N/A";
    String teamName = "N/A";
    int[] weeksPlayed = new int[17];
    String[] dateList = new String[17];

    //Constructors

    /**
     * Constructor that creates a team
     */
    public Team(String city, String name, String[] dates) {
        locationName = city;
        teamName = name;
        dateList = dates;
        weekPlayed(dates);
    }

    /**
     * Constructor that creates a team
     */
    public Team(String city, String[] dates) {
        locationName = city;
        dateList = dates;
        teamName = "N/A";
        weekPlayed(dates);
    }

    /**
     * Constructor that creates a team
     */
    public Team(String[] dates) {
        dateList = dates;
        teamName = "N/A";
        locationName = "N/A";
        weekPlayed(dates);
    }

    //Methods

    /**
     * Method that converts date list into a list that
     * tells the user which weeks the team plays.
     */
    public void weekPlayed(String[] date) {
        for (int i = 0; i < dateList.length; i++) {
            if (dateList[i].equals("00/00")) {
                weeksPlayed[i] = 0;
            } else {
                weeksPlayed[i] = 1;
            }
        }
    }

    /**
     * Method that returns the week that the team has a by
     */
    public int byWeek() {
        int byWeek = 0;
        for (int i = 0; i < dateList.length; i++) {
            if (weeksPlayed[i] == 0) {
                byWeek = i + 1;
            }
        }
        return byWeek;
    }

    /**
     * Method that fills out the eastimated sales of a team
     */
    public static double estimateSales(int week, Team team, double ticketPrice, int seats, double percentSold) {
        double sales = 0.0;

        if (team.weeksPlayed[week - 1] == 1) {
            sales = ticketPrice * (percentSold * seats);
        }

        return sales;
    }

    /**
     * This method checks whether two teams play on a date.
     * by checking if the date matches you can tell if the teams play on the exact same day.
     */
    public static boolean checkSchedule(Team[] teams, String datePlayed) {
        String[] team1DateList = teams[0].dateList;
        String[] team2DateList = teams[1].dateList;

        boolean team1Played = false;
        boolean team2Played = false;


        for (int i = 0; i < team1DateList.length; i++) {
            if (team1DateList[i].equals(datePlayed)) {
                team1Played = true;
            }
        }

        for (int j = 0; j < team2DateList.length; j++) {
            if (team2DateList[j].equals(datePlayed)) {
                team2Played = true;
            }
        }


        return team1Played && team2Played;
    }

    /**
     * This method should print a table that displays the sales the stadium will earn that week.
    */
    
    public static void printSales(Team[] teams, double ticketPrice, int seats, int week) {
        System.out.println("          Seats           Sold        Revenue");
        System.out.println("          _____           ____        _______");
        System.out.println();
        double totalSales = 0.0;
        int multiplier = 0;
        DecimalFormat f = new DecimalFormat("##.00");
//Team length of 4
        if(teams.length == 4){
        int[] team1WeeksPlayed = teams[0].weeksPlayed;
        int[] team2WeeksPlayed = teams[1].weeksPlayed;
        int[] team3WeeksPlayed = teams[2].weeksPlayed;
        int[] team4WeeksPlayed = teams[3].weeksPlayed;
        String[] team1DateList = teams[0].dateList;
        String[] team2DateList = teams[1].dateList;
        String[] team3DateList = teams[2].dateList;
        String[] team4DateList = teams[3].dateList;
        Team[] matchUp12 = {teams[0], teams[1]};
        Team[] matchUp13 = {teams[0], teams[2]};
        Team[] matchUp14 = {teams[0], teams[3]};
        Team[] matchUp23 = {teams[1], teams[2]};
        Team[] matchUp24 = {teams[1], teams[3]};
        Team[] matchUp34 = {teams[2], teams[3]};

        boolean one2 = false;
        boolean one3 = false;
        boolean one4 = false;
        boolean two3 = false;
        boolean two4 = false;
        boolean three4 = false;

        if (checkSchedule(matchUp12, team1DateList[week - 1])) {
            one2 = true;
        }
        if (checkSchedule(matchUp13, team1DateList[week - 1])) {
            one3 = true;
        }
        if (checkSchedule(matchUp14, team1DateList[week - 1])) {
            one4 = true;
        }
        if (checkSchedule(matchUp23, team3DateList[week - 1])) {
            two3 = true;
        }
        if (checkSchedule(matchUp24, team4DateList[week - 1])) {
            two4 = true;
        }
        if (checkSchedule(matchUp34, team3DateList[week - 1])) {
            three4 = true;
        }
        if (one2 && one3 && one4) {
            multiplier = 1;
        }
        if (one2 && one3 && !one4) {
            if(team4WeeksPlayed[week-1] == 1){  
          multiplier = 2;
          }else{
            multiplier = 1;
          }
        }
        if (one2 && !one3 && one4) {
            if(team3WeeksPlayed[week-1] == 1){  
          multiplier = 2;
          }else{
            multiplier = 1;
          }
        }
        if (!one2 && one3 && one4) {
          if(team2WeeksPlayed[week-1] == 1){  
          multiplier = 2;
          }else{
            multiplier = 1;
          }
        }
        if (one2 && !one3 && !one4 && three4) {
            multiplier = 2;
        }
        if (!one2 && !one3 && one4 && two3) {
            multiplier = 2;
        }
        if (!one2 && one3 && !one4 && two4) {
            multiplier = 2;
        }
        if (one2 && !one3 && !one4 && !three4) {
            multiplier = 3;
        }
        if (!one2 && !one3 && one4 && !two3) {
            multiplier = 3;
        }
        if (!one2 && one3 && !one4 && !two4) {
            multiplier = 3;
        }
        if (!one2 && !one3 && !one4 && !two3 && !two4 && !three4) {
          if(team2WeeksPlayed[week-1] == 0){
            multiplier = 3;
          }else{
          multiplier = 4;
          }
        }
        
        }

        
 //Team length of 3   
    if(teams.length == 3){
      int[] team1WeeksPlayed = teams[0].weeksPlayed;
        int[] team2WeeksPlayed = teams[1].weeksPlayed;
        int[] team3WeeksPlayed = teams[2].weeksPlayed;
            String[] team1DateList = teams[0].dateList;
            String[] team2DateList = teams[1].dateList;
            String[] team3DateList = teams[2].dateList;
            Team[] matchUp12 = {teams[0], teams[1]};
            Team[] matchUp13 = {teams[0], teams[2]};
            Team[] matchUp23 = {teams[1], teams[2]};
            boolean one2 = false;
            boolean one3 = false;
            boolean two3 = false;
            
        if (checkSchedule(matchUp12, team1DateList[week - 1])) {
            one2 = true;
        }
        if (checkSchedule(matchUp13, team1DateList[week - 1])) {
            one3 = true;
        }
        if (checkSchedule(matchUp23, team2DateList[week - 1])) {
            two3 = true;
        }
        if(one2 && one3){
          multiplier = 1;
        }
        if(one2 && !one3){
          if(team3WeeksPlayed[week-1] == 1){
              multiplier =2;
            }else{
              multiplier = 1;
            }
        }
        if(!one2 && one3){
          if(team2WeeksPlayed[week-1] == 1){
              multiplier =2;
            }else{
              multiplier = 1;
            }
        }
        if(!one2 && !one3){
          if((team1WeeksPlayed[week-1] == 1) && (team2WeeksPlayed[week-1] == 1) && (team3WeeksPlayed[week-1] == 1)){
              multiplier = 3;
            }else if((team1WeeksPlayed[week-1] != 1) && (team2WeeksPlayed[week-1] == 1) && (team3WeeksPlayed[week-1] == 1)){
              multiplier = 2;
            }else if((team1WeeksPlayed[week-1] == 1) && (team2WeeksPlayed[week-1] != 1) && (team3WeeksPlayed[week-1] == 1)){
              multiplier = 2;
            }else if((team1WeeksPlayed[week-1] == 1) && (team2WeeksPlayed[week-1] == 1) && (team3WeeksPlayed[week-1] != 1)){
              multiplier = 2;
            }else if((team1WeeksPlayed[week-1] != 1) && (team2WeeksPlayed[week-1] != 1) && (team3WeeksPlayed[week-1] == 1)){
              multiplier = 1;
            }else if((team1WeeksPlayed[week-1] == 1) && (team2WeeksPlayed[week-1] != 1) && (team3WeeksPlayed[week-1] != 1)){
              multiplier = 1;
            }else if((team1WeeksPlayed[week-1] != 1) && (team2WeeksPlayed[week-1] == 1) && (team3WeeksPlayed[week-1] != 1)){
              multiplier = 1;
            }else if((team1WeeksPlayed[week-1] != 1) && (team2WeeksPlayed[week-1] != 1) && (team3WeeksPlayed[week-1] != 1)){
              multiplier = 0;
            }
        }
        }
//Team Length of 2
    if(teams.length == 2){
      int[] team1WeeksPlayed = teams[0].weeksPlayed;
        int[] team2WeeksPlayed = teams[1].weeksPlayed;
            String[] team1DateList = teams[0].dateList;
            String[] team2DateList = teams[1].dateList;
            Team[] matchUp12 = {teams[0], teams[1]};
            boolean one2 = false;
        if (checkSchedule(matchUp12, team1DateList[week - 1])) {
            one2 = true;
        }
        if(one2){
          multiplier =1;
        }
        if(!one2){
          if(team1WeeksPlayed[week-1] == 1 && team2WeeksPlayed[week-1] == 1){
            multiplier = 2;
          }else if(team1WeeksPlayed[week-1] == 0 && team2WeeksPlayed[week-1] == 1){
            multiplier = 1;
          }else if(team1WeeksPlayed[week-1] == 1 && team2WeeksPlayed[week-1] == 0){
            multiplier = 1;
          }else{
            multiplier = 0;
          }
          
        }
        }
    
//Team length of 1
    if(teams.length == 1){
      int[] team1WeeksPlayed = teams[0].weeksPlayed;
        
            String[] team1DateList = teams[0].dateList;
            if(team1WeeksPlayed[week-1] == 1){
              multiplier =1;
            }else{
              multiplier = 0;
            }
    }
          
//Print Statement
        for (double i = .70; i <= 1.01; i += .05) {
            //
          totalSales = estimateSales(week, teams[0], ticketPrice, seats, i);
          totalSales = totalSales * multiplier;
            System.out.println("           " + seats + "           " + f.format(i * 100) + "%       " + f.format(totalSales));
        }
    }

}