class Solution {
    public int romanToInt(String s) {
        int current = 0, previous = 0, total = 0;

        //converting the string to uppercase to avoid case exceptions and removing any leading and trailing spaces if there is any
        String upperCaseS = s.toUpperCase().trim();

        for(int i = upperCaseS.length()-1; i >=0; i--){
            current = getValue(upperCaseS.charAt(i));

            if(current < previous) {
                total -= current;
            } else {
                total += current;
            }
            previous = current;
        }
        return total;
    }

    //this is a helper method to identify corresponding number of roman number
    //this support consistency throughout the code and makes method more manageable
    public int getValue(char c){
        //converting c in case it is in lowercase to avoid case exceptions
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid roman number " + c);
        }
    }
}
