public class expandedStringForm {

    public static String expandedForm(int num){

        String[] str = Integer.toString(num).split("");
        String result = "";
    
        for(int i = 0; i < str.length; i++){
            if(Integer.valueOf(str[i]) > 0){
                result += str[i];
                for(int j = i; j < str.length - 1; j++){
                    result += '0';
                }
                result += " + ";
            }
        }
        result = result.substring(0, result.length() - 3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }
}