package Enum;

enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00"), WHITE("#FFFFF");
    private final String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}
