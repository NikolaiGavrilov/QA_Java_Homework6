import javax.sound.sampled.SourceDataLine;

public class Main {
    // Задание

    // Реализуйте структуру телефонной книги с помощью HashMap.
    // Программа также должна учитывать, что в во входной структуре будут
    // повторяющиеся
    // имена с разными телефонами, их необходимо считать, как одного человека с
    // разными
    // телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addContact("Mama", 1111);
        myPhoneBook.addContact("Ivan", 12345);
        myPhoneBook.addContact("Alisa", 33);
        myPhoneBook.addContact("Ivan", 123456);
        myPhoneBook.addContact("Ivan", 1234567);
        myPhoneBook.addContact("Dyadya Vova", 54321);
        myPhoneBook.addContact("Dyadya Vova", 654321);
        myPhoneBook.addContact("Dedushka", 444);
        myPhoneBook.addContact("Dedushka", 4444);
        myPhoneBook.addContact("Dyadya Vova", 7654321);
        myPhoneBook.addContact("Dyadya Vova", 87654321);
        myPhoneBook.addContact("Alisa", 333);
        myPhoneBook.addContact("Alisa", 3333);
        myPhoneBook.addContact("Alisa", 333333);
        PhoneBook.sortContacts(PhoneBook.getPhoneBook());
    }

}
