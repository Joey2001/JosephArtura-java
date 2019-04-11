class CardMaker{

    static String[][] constructCard(){
        String topBot = " ------- ";
        String E = "|       |";

        String[] one   = {"|   ♥   |", "|   ♣   |", "|   ♦   |", "|   ♠   |"};
        String[] two   = {"| ♥   ♥ |", "| ♣   ♣ |", "| ♦   ♦ |", "| ♠   ♠ |"};
        String[] three = {"| ♥ ♥ ♥ |", "| ♣ ♣ ♣ |", "| ♦ ♦ ♦ |", "| ♠ ♠ ♠ |"};
        String[] four  = {"|♥ ♥ ♥ ♥|", "|♣ ♣ ♣ ♣|", "|♦ ♦ ♦ ♦|", "|♠ ♠ ♠ ♠|"};

        String[] right = {"| J     |", "| Q     |", "| K     |"};
        String[] left  = {"|     J |", "|     Q |", "|     K |"};

        String[][] parts = {{"|       |"}, one, two, three, four, right, left};
        String[][] e = new String[52][5];

        int notCount = 0;
        int count = 0;
        int falseLoop;
        int JQK = 0;
        int JQK2 = 0;
        for(int i = 0; i < e.length; i++){
            if(i % 13 == 0 && i != 0){
                count++;
                notCount = 0;
            }
            for(int j = 0; j < e[i].length; j++){
                falseLoop = (i - (count * 13));

                if(j == 0 || j == 4){
                    e[i][j] = topBot;
                }else if(j == 2){
                    if((falseLoop % 2 == 0 && falseLoop != 5 && (falseLoop < 10)) || (falseLoop == 0 && i !=0)){
                        notCount++;
                        if(notCount == 0){
                            e[i][j] = parts[notCount][0];
                        }else{
                            e[i][j] = parts[notCount][count];
                        }
                    }else if(falseLoop == 5 || falseLoop == 9){
                        notCount++;
                        e[i][j] = parts[notCount][count];
                    }else if(falseLoop > 9){
                        notCount = 1;
                        e[i][j] = parts[1][count];
                    }else{
                        notCount--;
                        if(notCount == 0){
                            e[i][j] = parts[notCount][0];
                        }else{
                            e[i][j] = parts[notCount][count];
                        }
                    }
                }else{
                    if(falseLoop == 0){
                        e[i][j] = E;
                    }else if(falseLoop < 3){
                        e[i][j] = parts[1][count];
                    }else if(falseLoop < 7){
                        e[i][j] = parts[2][count];
                    }else if(falseLoop < 10){
                        e[i][j] = parts[3][count];
                    }else{
                        if(j == 1) {
                            e[i][j] = parts[5][JQK];
                            JQK++;
                            if (JQK == 3) {
                                JQK = 0;
                            }
                        }else{
                            e[i][j] = parts[6][JQK2];
                            JQK2++;
                            if (JQK2 == 3) {
                                JQK2 = 0;
                            }
                        }
                    }
                }
            }
        }
        return e;
    }

    static void printCard(String[][] card){
        for(int i = 0; i < card[0].length; i++){
            for (String[] aCard : card)
                System.out.print(aCard[i]);
            System.out.println();
        }
    }
}
