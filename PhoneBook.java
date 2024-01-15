import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void addContact(String name, Integer phoneNum) {
        ArrayList<Integer> phoneList = new ArrayList<Integer>();
        if (phoneBook.containsKey(name)) {
            phoneList = phoneBook.get(name);
        }
        phoneList.add(phoneNum);
        phoneBook.put(name, phoneList);
    }

    public ArrayList<Integer> findPhoneNum(String nameOfNumOwnew) {
        ArrayList<Integer> phoneList = new ArrayList<Integer>();
        if (phoneBook.containsKey(nameOfNumOwnew)) {
            phoneList = phoneBook.get(nameOfNumOwnew);
        }
        return phoneList;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static void sortContacts(HashMap<String, ArrayList<Integer>> contactsToSort) {
        Integer[] size = new Integer[contactsToSort.values().size()];
        String[] names = new String[contactsToSort.keySet().size()];
        int i = 0;
        for (ArrayList<Integer> element : contactsToSort.values()) {
            size[i] = element.size();
            i++;
        }
        int j = 0;
        for (String element : contactsToSort.keySet()) {
            names[j] = element;
            j++;
        }
        Arrays.sort(size, Collections.reverseOrder());
        int maxLen = size[0];
        // System.out.println(Arrays.toString(size));
        for (int k = maxLen; k > 0; k--) {
            for (ArrayList<Integer> element : contactsToSort.values()) {
                if (element.size() == k) {
                    for (String str : phoneBook.keySet()) {
                        if (phoneBook.get(str).equals(element)) {
                            System.out.println("Абонент: " + str);
                            System.out.println("Телефонные номера: " + element + "\n");
                            continue;
                        }
                    }

                }
            }
        }
    }

}