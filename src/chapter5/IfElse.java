package chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4; //Ապրիլ
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "ձմռան";
        else if (month == 3 || month == 4 || month == 5)
            season = "գարնան";
        else if (month == 6 || month == 7 || month == 8)
            season = "ամռան";
        else if (month == 9 || month == 10 || month == 11)
            season = "աշնան";
        else
            season = "հորինված ամիս";
        System.out.println(
                "ապրիլը " + season + " ամիս է");

    }
}
