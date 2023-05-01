class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int totalElements = salary.length;
        double sum = 0, avg;
        for(int i = 0; i < totalElements; i++){
            sum += salary[i];
        }
        double totalSum = sum - (salary[0] + salary[totalElements - 1]);
        avg = totalSum / (totalElements - 2);
        return avg;
        
    }
}