// Exercise 2
void main(){
    final String[][] STUDENTS = {
            {"1", "2", "3", "4"},
            {"Kasun", "Nuwan", "Ruwan", "Supun"},
            {"077-1234567", "078-1234567", "071-12345678", "041-12345678"},
            {"011-12345678","-",null,"033-12345678"}
    };

    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-"
            .repeat(13)}+\{"-".repeat(13)}+";

    final String HEADER = "|%-5s|%-8s|%-13s|%-13s|"
            .formatted("ID", "NAME", "CONTACT 1", "CONTACT 2");

    final String ROW = "|%-5s|%-8s|%-13s|%-13s|\n";

    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);

    for (int i = 0; i < STUDENTS.length; i++) {
        String id = STUDENTS[0][i];
        String name = STUDENTS[1][i];
        String contact1 = STUDENTS[2][i];
        String contact2 = STUDENTS[3][i];

        System.out.printf(ROW,getId(id),getName(name),getContact1(contact1),getContact2(contact2));
    }
    System.out.println(LINE);
}

String getId(String id){
    return "C-%03d".formatted(Integer.parseInt(id));
}

String getName(String name){
    return STR."\{name}";
}

String getContact1(String contact1){
    return STR."\{contact1}";
}

String getContact2(String contact2){
    return contact2 == null ? "-" : contact2;
}