import java.util.HashSet;

class Solution {

    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqeMails = new HashSet<>();
        for (String mail : emails) {
            String rMail = getTrueForm(mail);
            uniqeMails.add(rMail);
        }
        return uniqeMails.size();
    }

    private String getTrueForm(String mail) {
        String[] array = mail.split("@");
        String localName = array[0];
        String domainName = array[1];

        String[] tLocalName = localName.split("\\+");
        localName = tLocalName[0];
        localName = localName.replace(".", "");

        return localName + "@" + domainName;
    }
}