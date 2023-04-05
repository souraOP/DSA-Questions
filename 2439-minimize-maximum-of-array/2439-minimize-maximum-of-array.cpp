class Solution {
public:
    int minimizeArrayValue(vector<int>& nums) {
        long Sum = 0, Result = 0;
        for(int i = 0; i<nums.size(); ++i){
            Sum += nums[i];
            Result = max(Result, (Sum + i)/(i + 1));
        }
        return Result;
    }
};