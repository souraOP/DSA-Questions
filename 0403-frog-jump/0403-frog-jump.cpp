class Solution {
public:
    bool dp(vector<int> &stones, int previndex, int prevjump, int end,unordered_map<int, int> &mp,vector<vector<int>> &cache) {
        if(previndex == end) {
            return true;
        }
        if(cache[prevjump][previndex] != -1) return cache[prevjump][previndex];
        bool ans = false;
        for(int iter = prevjump - 1; iter <= (prevjump + 1); iter++) {
            if(iter > 0 && mp.find(stones[previndex] + iter) != mp.end()) {
                ans |= dp(stones,mp[stones[previndex] + iter],iter,end,mp,cache);    
            }    
                 
        }
        
        return cache[prevjump][previndex] = ans;
    }
    bool canCross(vector<int>& stones) {
        int n = stones.size();
        unordered_map<int ,int> mp;
        for(int i = 0 ; i < n; i++) {
            mp[stones[i]] = i;
        }
        vector<vector<int>> cache(n + 1, vector<int>(n + 1, -1));
        bool ans = dp(stones,0,0,n - 1,mp,cache);
        return ans;
    }
};