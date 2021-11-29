package Week6;

public class DataTypeConverter {
	
	/*
	 * Converting String into integer
	 */
	public static int StrToInt(String value) {
		StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(c > 47 && c < 58){
                builder.append(c);
            }    
        }
        String s = builder.toString();
       int x = Integer.parseInt(s);
       return x;
		
	 }
	
	/*
	 * Converting String into integer
	 */
	public static double StrTodouble(String value) {
		StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
                builder.append(c);
            }
        String s = builder.toString();
        double d = Double.parseDouble(s);
        return d;
   }

}
