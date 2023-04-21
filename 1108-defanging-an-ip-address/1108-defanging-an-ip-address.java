class Solution {
    public String defangIPaddr(String address) {
        String newIP = address.replace(".", "[.]");
        return newIP;
    }
}