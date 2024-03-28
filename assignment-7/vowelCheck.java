
/* Check whether there is vowel inside a string
 * Count the no of Vowels insode a string
 * Display the count and the values of vowels that are present
 */

public class vowelCheck {
    public static void main(String[] args) {
        String s1 = "Consonant";
        int count = 0;
        for(int i = 0 ; i<s1.length() ; i++) {
            String s2 = s1.toLowerCase();
            char temp = s2.charAt(i);
            if(temp == 'a') {
                count += 1;
            } else if(temp == 'e') {
                count +=1;
            } else if(temp == 'i') {
                count +=1;
            }else if(temp == 'o') {
                count += 1;
            }else if(temp == 'u') {
                count += 1;
            }
        }

        if(count > 0) {
            System.out.println("Vowel(s) is/are Present in the Given String.");
        }
        System.out.println("Total no of vowels present" + " " + count);
    }
}
