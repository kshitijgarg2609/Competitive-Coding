class Solution
{
    public int numUniqueEmails(String[] emails)
    {
        return Arrays.stream(emails).map(email->
        {
            String email_components[] = email.split("\\@");
            String local_domain[] = email_components[0].split("\\+");
            return (local_domain[0].replaceAll("\\.","")+"@"+email_components[1]);
        }).distinct().toArray().length;
    }
}
