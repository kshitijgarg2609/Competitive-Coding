class Solution
{
    public String validIPAddress(String queryIP)
    {
        String ipv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])){3}";
        String ipv6 = "([0-9A-Fa-f]{1,4})((\\:([0-9 A-F a-f]){1,4})){7}";
        if(queryIP.matches(ipv4))
        {
            return "IPv4";
        }
        if(queryIP.matches(ipv6))
        {
            return "IPv6";
        }
        return "Neither";
    }
}
