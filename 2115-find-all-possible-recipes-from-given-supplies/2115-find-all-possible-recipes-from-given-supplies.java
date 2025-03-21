class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        // List<String> ans = Arrays.asList(recipes);
        // return ans;
        HashSet<String> recipeSet = new HashSet<>(Arrays.asList(recipes));
        HashMap<String, Boolean> dp = new HashMap<>();
        for(String s: supplies){
            dp.put(s, true);
        }
        List<String> res = new ArrayList<>();
        for(String rec: recipes){
            if(createKarSakteHai(rec, recipeSet, ingredients, dp, new HashSet<>(), recipes)){
                res.add(rec);
            }
        }
        return res;
        
    }

    static boolean createKarSakteHai(String rec, HashSet<String> recipeSet, List<List<String>> ingredients, Map<String, Boolean> dp, HashSet<String> visited, String[] recipes){
        if(dp.containsKey(rec)){
            return dp.get(rec);
        }
        if(!recipeSet.contains(rec)){
            return false;
        }
        if(visited.contains(rec)){
            return false;
        }
        visited.add(rec);
        int i = Arrays.asList(recipes).indexOf(rec);
        for(String j: ingredients.get(i)){
            if(!createKarSakteHai(j, recipeSet, ingredients, dp, visited, recipes)){
                dp.put(rec, false);
                return false;
            }
        }
        visited.remove(rec);
        dp.put(rec, true);
        return true;
    }
}