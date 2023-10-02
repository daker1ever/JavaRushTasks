package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c": {
                if (args[2].equals("м")) {
                    try {
                        Date date = sdf2.parse(args[3]);
                        allPeople.add(Person.createMale(args[1], date));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                } else if (args[2].equals("ж")) {
                    try {
                        Date date = sdf2.parse(args[3]);
                        allPeople.add(Person.createFemale(args[1], date));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(allPeople.size() - 1);
                break;
            }
            case "-r": {
                Person p = allPeople.get(Integer.parseInt(args[1]));
                if (p.getSex() == Sex.MALE) {
                    System.out.printf("%s м %s", p.getName(), sdf.format(p.getBirthDate()));
                } else if (p.getSex() == Sex.FEMALE) {
                    System.out.printf("%s ж %s", p.getName(), sdf.format(p.getBirthDate()));
                }
                break;
            }
            case "-u": {
                Person p = allPeople.get(Integer.parseInt(args[1]));
                p.setName(args[2]);
                try {
                    p.setBirthDate(sdf2.parse(args[4]));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                if (args[3].equals("м")) {
                    p.setSex(Sex.MALE);
                } else if (args[3].equals("ж")) {
                    p.setSex(Sex.FEMALE);
                }
                if (p.getSex() == Sex.MALE) {
                    System.out.printf("%s м %s", p.getName(), sdf.format(p.getBirthDate()));
                } else if (p.getSex() == Sex.FEMALE) {
                    System.out.printf("%s ж %s", p.getName(), sdf.format(p.getBirthDate()));
                }
                break;
            }
            case "-d": {
                Person p = allPeople.get(Integer.parseInt(args[1]));
                p.setSex(null);
                p.setName(null);
                p.setBirthDate(null);
            }

        }
        /*if (args[0].equals("-c")) {
            if (args[2].equals("м")){
                allPeople.add(Person.createMale(args[1], new Date(args[3])));
            } else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], new Date(args[3])));
            }
        }
        if (args[0].equals("-r")) {
            Person p = allPeople.get(Integer.parseInt(args[1]));
            if (p.getSex() == Sex.MALE) {
                System.out.printf("%s м %s",p.getName(), sdf.format(p.getBirthDate()));
            } else if (p.getSex() == Sex.FEMALE) {
                System.out.printf("%s ж %s",p.getName(), sdf.format(p.getBirthDate()));
            }

        }
        if (args[0].equals("-u")) {
            Person p = allPeople.get(Integer.parseInt(args[1]));
            p.setName(args[2]);
            p.setBirthDate(new Date(args[4]));
            if (args[3].equals("м")){
                p.setSex(Sex.MALE);
            } else if (args[3].equals("ж")) {
                p.setSex(Sex.FEMALE);
            }
        }
        if (args[0].equals("-d")) {
            allPeople.remove(args[1]);
        }*/
    }
}
