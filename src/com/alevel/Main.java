package com.alevel;

public class Main {

    public static void main(String[] args) {

        Report.ReportBuilder reportTest = Report.builder().body("Sample text").header("Header").footer("footer");
        Report.ReportBuilder reportTestTwo = Report.builder().header("Header").footer("footer");

        System.out.println(reportTest.hashCode());
        System.out.println(reportTest.hashCode() == reportTest.hashCode());
        System.out.println(reportTestTwo.hashCode() == reportTest.hashCode());


        Pow powTest;
        int numberTest = 3;
        int powNumberTest = 3;
        powTest = (x, y) -> {
            int num = numberTest;
            for (int i = 0; i < powNumberTest - 1; i++) {
                num = numberTest * num;
            }
            return num;
        };

        int resultTest = powTest.pow(numberTest, numberTest);
        System.out.println(resultTest);
        System.out.println(reportTest.equals(reportTestTwo));

    }
}
