package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

public class DateTimeDemo {

    public static void main(String[] args) {

        /*ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
        Instant i=Instant.now();*/

        //LocalDateTime date = LocalDateTime.parse("20210317134350");

        String str = "20210317134350";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate dateTime = LocalDate.parse(str, formatter);
        System.out.println(dateTime.format(formatter));
        LinkedHashMap linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("","");


    }
}
