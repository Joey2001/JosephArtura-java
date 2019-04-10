class CardMaker{

    static String[][] constructCard(){
        String topBot = " ------- ";
        String E = "|       |";
        String[] m1 = {"|   ♥   |", "|   ♣   |", "|   ♦   |", "|   ♠   |"};
        String[] m2 = {"| ♥   ♥ |", "| ♣   ♣ |", "| ♦   ♦ |", "| ♠   ♠ |"};
        String[] m3 = {"| ♥ ♥ ♥ |", "| ♣ ♣ ♣ |", "| ♦ ♦ ♦ |", "| ♠ ♠ ♠ |"};
        String[] m4 = {"|♥ ♥ ♥ ♥|", "|♣ ♣ ♣ ♣|", "|♦ ♦ ♦ ♦|", "|♠ ♠ ♠ ♠|"};

        String[] rL = {"| J     |", "| Q     |", "| K     |"};
        String[] lL = {"|     J |", "|     Q |", "|     K |"};

        String[][] Ace = {{topBot, E, m1[0], E, topBot}, {topBot, E, m1[1], E, topBot}, {topBot, E, m1[2], E, topBot}, {topBot, E, m1[3], E, topBot}};
        String[][] Two = {{topBot, m1[0], E, m1[0], topBot}, {topBot, m1[1], E, m1[1], topBot}, {topBot, m1[2], E, m1[2], topBot}, {topBot, m1[3], E, m1[3], topBot}};
        String[][] Three = {{topBot, m1[0], m1[0], m1[0], topBot}, {topBot, m1[1], m1[1], m1[1], topBot}, {topBot, m1[2], m1[2], m1[2], topBot}, {topBot, m1[3], m1[3], m1[3], topBot}};
        String[][] Four = {{topBot, m2[0], E, m2[0], topBot}, {topBot, m2[1], E, m2[1], topBot}, {topBot, m2[2], E, m2[2], topBot}, {topBot, m2[3], E, m2[3], topBot}};
        String[][] Five = {{topBot, m2[0], m1[0], m2[0], topBot}, {topBot, m2[1], m1[1], m2[1], topBot}, {topBot, m2[2], m1[2], m2[2], topBot}, {topBot, m2[3], m1[3], m2[3], topBot}};
        String[][] Six = {{topBot, m2[0], m2[0], m2[0], topBot}, {topBot, m2[1], m2[1], m2[1], topBot}, {topBot, m2[2], m2[2], m2[2], topBot}, {topBot, m2[3], m2[3], m2[3], topBot}};
        String[][] Seven = {{topBot, m2[0], m3[0], m2[0], topBot}, {topBot, m2[1], m3[1], m2[1], topBot}, {topBot, m2[2], m3[2], m2[2], topBot}, {topBot, m2[3], m3[3], m2[3], topBot}};
        String[][] Eight = {{topBot, m3[0], m2[0], m3[0], topBot}, {topBot, m3[1], m2[1], m3[1], topBot}, {topBot, m3[2], m2[2], m3[2], topBot}, {topBot, m3[3], m2[3], m3[3], topBot}};
        String[][] Nine = {{topBot, m3[0], m3[0], m3[0], topBot}, {topBot, m3[1], m3[1], m3[1], topBot}, {topBot, m3[2], m3[2], m3[2], topBot}, {topBot, m3[3], m3[3], m3[3], topBot}};
        String[][] Ten = {{topBot, m3[0], m4[0], m3[0], topBot}, {topBot, m3[1], m4[1], m3[1], topBot}, {topBot, m3[2], m4[2], m3[2], topBot}, {topBot, m3[3], m4[3], m3[3], topBot}};
        String[][] Jack = {{topBot, rL[0], m1[0], lL[0], topBot}, {topBot, rL[0], m1[1], lL[0], topBot}, {topBot, rL[0], m1[2], lL[0], topBot}, {topBot, rL[0], m1[3], lL[0], topBot}};
        String[][] Queen = {{topBot, rL[1], m1[0], lL[1], topBot}, {topBot, rL[1], m1[1], lL[1], topBot}, {topBot, rL[1], m1[2], lL[1], topBot}, {topBot, rL[1], m1[3], lL[1], topBot}};
        String[][] King = {{topBot, rL[2], m1[0], lL[2], topBot}, {topBot, rL[2], m1[1], lL[2], topBot}, {topBot, rL[2], m1[2], lL[2], topBot}, {topBot, rL[2], m1[3], lL[2], topBot}};

        return new String[][]{Ace[0], Two[0], Three[0], Four[0], Five[0], Six[0], Seven[0], Eight[0], Nine[0], Ten[0], Jack[0], Queen[0], King[0], Ace[1], Two[1], Three[1], Four[1], Five[1], Six[1], Seven[1], Eight[1], Nine[1], Ten[1], Jack[1], Queen[1], King[1], Ace[2], Two[2], Three[2], Four[2], Five[2], Six[2], Seven[2], Eight[2], Nine[2], Ten[2], Jack[2], Queen[2], King[2], Ace[3], Two[3], Three[3], Four[3], Five[3], Six[3], Seven[3], Eight[3], Nine[3], Ten[3], Jack[3], Queen[3], King[3]};
    }

    static void printCard(String[][] card){
        for(int i = 0; i < card[0].length; i++){
            for (String[] aCard : card)
                System.out.print(aCard[i]);
            System.out.println();
        }
    }
}