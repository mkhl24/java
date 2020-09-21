package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Aelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("this won't work");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawtorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");

        hawthorn.matchResult(freemantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(freemantle,2,1);
//        adelaideCrows.matchResult(baseballTeam,1,1);

//        System.out.println(adelaideCrows.numPlayers());


        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
        System.out.println(freemantle.getName() + " : " + freemantle.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(freemantle));








//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
    }

//    public static void printDoubled(ArrayList<Integer> n) {
//        for(int i : n) {
//            System.out.println(i * 2);
//        }
//    }
}
