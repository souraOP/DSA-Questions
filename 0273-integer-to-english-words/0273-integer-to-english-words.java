class Solution {
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private String bhenchod(int n){
        StringBuilder laure = new StringBuilder();
        if(n>= 1000000000){
            laure.append(bhenchod(n / 1000000000)).append(" Billion ").append(bhenchod(n % 1000000000));
        } else if(n >= 1000000){
            laure.append(bhenchod(n / 1000000)).append(" Million ").append(bhenchod(n % 1000000));
        } else if(n >= 1000){
            laure.append(bhenchod(n / 1000)).append(" Thousand ").append(bhenchod(n % 1000));
        } else if(n >= 100){
            laure.append(bhenchod(n / 100)).append(" Hundred ").append(bhenchod(n % 100));   
        } else if(n >= 20){
            laure.append(tens[n / 10]).append(" ").append(bhenchod(n % 10));
        } else {
            laure.append(ones[n]);
        }
        return laure.toString().trim();
    }
    
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return bhenchod(num);
    }
    
    
}