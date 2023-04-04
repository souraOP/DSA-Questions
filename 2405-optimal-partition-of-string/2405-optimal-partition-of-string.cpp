class Solution {
public:
    int partitionString(string s) {
        unordered_set<char>souraString;
        int count = 1, i;
        for(i = 0; i < s.size(); i++){
            if(souraString.find(s[i]) != souraString.end()){ //if Character s[i] has already occured then place a new partition.
                count++;
                souraString.clear();   //Clear the set i.e, place a partition
            }
            souraString.insert(s[i]);   //upcoming character will add to this hashset
        }
        return count;
    }
};