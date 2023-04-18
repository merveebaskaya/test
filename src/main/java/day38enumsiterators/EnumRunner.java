package day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {

        String capitalOfIlinois = UsStateEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIlinois);

        String abbreviationOfFlorida = UsStateEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        UsStateEnum state = UsStateEnum.ALASKA;
        System.out.println(state);

        String stateName = UsStateEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);

        String abbreviationOfAlaska = UsStateEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);
    }

}
