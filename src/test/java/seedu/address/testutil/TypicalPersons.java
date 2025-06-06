package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HOUSING_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HOUSING_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_LINK_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_LINK_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MAJOR_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MAJOR_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_YEAR_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_YEAR_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder()
            .withName("Alice Pauline")
            .withHousing("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
            .withYear("1")
            .withMajor("Computer Science")
            .withLink("https://nusmods.com/timetable/sem-2/share?CS2103T=LEC:G12")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder()
            .withName("Benson Meier")
            .withHousing("UTown Residence North Tower")
            .withEmail("johnd@example.com")
            .withPhone("98765432")
            .withYear("3")
            .withMajor("Computer Engineering")
            .withLink("https://nusmods.com/timetable/sem-2/share?CS2103T=LEC:G12")
            .withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder()
            .withName("Carl Kurz")
            .withPhone("95352563")
            .withEmail("heinz@example.com")
            .withYear("4")
            .withMajor("Mathematics")
            .withHousing("Lives in CLB")
            .withLink("https://nusmods.com/timetable/sem-2/share?CS2103T=LEC:G12").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withHousing("PGPR R1").withYear("1").withMajor("Law")
            .withLink("https://nusmods.com/timetable/sem-1/share?CS2103T=LEC:G20&CS2107=TUT:13,LEC:1&ta=CS2107(TUT:13)")
            .withTags("friends").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("94882224")
            .withEmail("werner@example.com").withHousing("Tembusu College").withYear("4").withMajor("Physics")
            .withLink("https://nusmods.com/timetable/sem-2/share?CS2103T=LEC:G12").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("94882427")
            .withEmail("lydia@example.com").withYear("1").withMajor("Political Science")
            .withHousing("Temasek Hall")
            .withLink("https://nusmods.com/timetable/sem-2/share?CS3230=LEC:1,TUT:06").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("94882442")
            .withEmail("anna@example.com").withYear("2").withMajor("Computer Science")
            .withHousing("Lighthouse").withLink("https://nusmods.com/timetable/sem-2/share?CS2103T=LEC:G12").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("84882424")
            .withEmail("stefan@example.com").withYear("2").withMajor("Quantitative Finance")
            .withHousing("little india").withLink("https://nusmods.com/timetable/sem-2/share?CS2103T=LEC:G12").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("84882131")
            .withEmail("hans@example.com").withYear("5").withMajor("Computer Science")
            .withHousing("chicago ave").withLink("https://nusmods.com/timetable/sem-2/share?CS2103T=LEC:G12").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withYear(VALID_YEAR_AMY).withMajor(VALID_MAJOR_AMY)
            .withHousing(VALID_HOUSING_AMY).withLink(VALID_LINK_AMY)
            .withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withYear(VALID_YEAR_BOB).withMajor(VALID_MAJOR_BOB)
            .withHousing(VALID_HOUSING_BOB).withLink(VALID_LINK_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
