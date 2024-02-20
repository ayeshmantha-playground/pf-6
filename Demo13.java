void main() {
    final String[][][] STUDENTS = {
            {{"1"},{"Kasun","Sampath"},{"30","80","65"}},
            {{"2"},{"Nuwan"},{"40","70","-1"}},
            {{"3"},{"Ruwan",null},{"-1","65","80"}}
    };

    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-"
            .repeat(8)}+\{"-".repeat(3)}+\{"-".repeat(5)}+\{"-".repeat(5)}+";
    final String HEADER = "\033[43;1m|%-5s|%-8s|%-8s|%3s|%5s|%5s|\033[0m"
            .formatted("ID", "F.NAME", "L.NAME", "", "TOTAL", "AVG.");
    final String ROW = "|%-5s|%-8s|%-8s|%3s|%5s|%5s|\n";

    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);

    for (String[][] student : STUDENTS) {
        String id = student[0][0];
        String[] name = student[1];
        String[] subjects = student[2];
        System.out.printf(ROW,getId(id),getFistName(name),getLastName(name),getSubjects(subjects),getTotal(subjects),getAverage(subjects));
    }
    System.out.println(LINE);

}

String getId(String id){
    return "S%03d".formatted(Integer.parseInt(id));
}

String getFistName(String [] name){
    return name[0];
}

String getLastName(String[] name){
    return name.length != 2 || name[1] == null ? "-" : name[1];
}

String getSubjects(String [] subjects){
    int i = 0;
    for (String subjectMarks : subjects) {
        if(Integer.parseInt(subjectMarks) == -1)continue;
        i++;
    }
    return STR."\{i}";
}
String getTotal(String [] subjects){
    int total = 0;
    for (String marks : subjects) {
        total += Integer.parseInt(marks);
    }
    return STR."\{total}";
}

String getAverage(String [] subjects){
    int total = 0;
    int numberOfSubjects = Integer.parseInt(getSubjects(subjects));
    for (String marks : subjects) {
        total += Integer.parseInt(marks);
    }

    return STR."\{total / (double) numberOfSubjects}";


}


