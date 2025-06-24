public class OverloadingMethod {
    private String formatNumber(int value){
        return String.format("%d", value);
    }

    private String formatNumber(double value){
        return String.format("%.3f",  value);
    }

    private String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }

    public void showOverLoadingMethod(){
        System.out.println("formate o numero 500 " + formatNumber(500));
        System.out.println("formate a string 200 " + formatNumber("200"));
        System.out.println("formate o numero com virgula 50.2 = " + formatNumber(50.2));
    }
}
