/* You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as 
 * query. For each query, print the phone number of that person.
Input Format
The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the 
corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.

Output Format
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See 
sample output for the exact format.
To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your 
own.
*/

package LabPractical;
import java.util.*;
public class Exp28 {

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many records do you want to enter: ");
		int n = scanner.nextInt();

		Map<String, String> phoneBook = new HashMap<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter entry number " + (i+1) + ": ");
			
			String name = scanner.next();
			String phoneNumber = scanner.next();
			
			phoneBook.put(name, phoneNumber);
		}

		System.out.println("To search phone number, enter name... ");
		while (scanner.hasNext()) {
			String query = scanner.next();
			
			if (phoneBook.containsKey(query)) {
				System.out.println(query + " = " + phoneBook.get(query));
			} else {
				System.out.println("Not found");
			}
		}
		scanner.close();
	}
}
