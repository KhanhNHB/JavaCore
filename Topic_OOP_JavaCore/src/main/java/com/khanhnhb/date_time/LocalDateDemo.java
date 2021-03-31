package com.khanhnhb.date_time;

import com.khanhnhb.exception.PrintAllYearException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class LocalDateDemo {

    public List<Integer> printAllYear(String from, String to) throws PrintAllYearException {

        List<Integer> listYear = new ArrayList<Integer>();

        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .appendPattern("yyyy")
                .parseDefaulting(ChronoField.MONTH_OF_YEAR, 3)
                .parseDefaulting(ChronoField.DAY_OF_MONTH, 31)
                .toFormatter();

        LocalDate fromDate = LocalDate.parse(from, dateTimeFormatter);
        LocalDate toDate = LocalDate.parse(to, dateTimeFormatter);

        if (fromDate.isAfter(toDate)) {
            throw new PrintAllYearException("From date must be less than to date");
        }

        LocalDate current = fromDate;
        while (current.isBefore(toDate) || current.isEqual(toDate)) {
            System.out.println(current.getYear());

            current = current.plusYears(1);
        }

        return listYear;
    }
}
