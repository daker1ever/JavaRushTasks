package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            try {
                                Date date = sdf2.parse(args[i + 2]);
                                allPeople.add(Person.createMale(args[i], date));
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                        } else if (args[i + 1].equals("ж")) {
                            try {
                                Date date = sdf2.parse(args[i + 2]);
                                allPeople.add(Person.createFemale(args[i], date));
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            }
            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        p.setName(args[i + 1]);
                        try {
                            p.setBirthDate(sdf2.parse(args[i + 3]));
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                        if (args[i + 2].equals("м")) {
                            p.setSex(Sex.MALE);
                        } else if (args[i + 2].equals("ж")) {
                            p.setSex(Sex.FEMALE);
                        }
                        if (p.getSex() == Sex.MALE) {
                            System.out.printf("%s м %s\n", p.getName(), sdf.format(p.getBirthDate()));
                        } else if (p.getSex() == Sex.FEMALE) {
                            System.out.printf("%s ж %s\n", p.getName(), sdf.format(p.getBirthDate()));
                        }
                    }
                    break;
                }
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        p.setSex(null);
                        p.setName(null);
                        p.setBirthDate(null);
                    }
                    break;
                }
            }
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        if (p.getSex() == Sex.MALE) {
                            System.out.printf("%s м %s\n", p.getName(), sdf.format(p.getBirthDate()));
                        } else if (p.getSex() == Sex.FEMALE) {
                            System.out.printf("%s ж %s\n", p.getName(), sdf.format(p.getBirthDate()));
                        }
                    }
                    break;
                }
            }

        }
    }
}
