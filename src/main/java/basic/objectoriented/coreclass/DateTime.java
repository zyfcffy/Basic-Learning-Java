package basic.objectoriented.coreclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime {
  public static void main(String[] args) throws ParseException {

//    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
//    sdf.setLenient(false);
//    System.out.println(sdf.parse("2021101211203"));

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    System.out.println(LocalDate.parse("2021101211203"));
//    System.out.println(LocalDate.parse("2021101211203", formatter));


//    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyyMMdd");
//    System.out.println(LocalDate.parse("20211018", pattern).atStartOfDay().atZone(ZoneId.of("UTC")).toInstant().toString());
  }
}
