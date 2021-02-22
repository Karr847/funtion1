package fun;

import java.util.function.Consumer;

public class Funtion {
    public static void main(String...args) {
      String consumer;}
        private static  void consumer() {
            Consumer<String> printResult = s -> System.out.println("Result" + s);
            printResult.accept("10.0");
            printWithPrefixAndPostfix("Result", "Great!").accept("10");


             class Person {
                private int age;
                private String firstName, lastName, record;

                public Person(int age, String firstName, String lastName) {
                    this.age = age;
                    this.firstName = firstName;
                    this.lastName = lastName;
                }

                public int getAge() {
                    return age;
                }

                public String getFirstName() {
                    return firstName;
                }

                public String getLastName() {
                    return lastName;
                }

                public String getRecord() {
                    return record;

                }

                public void setRecord(String fullId) {
                    this.record = record;
                }

                public void seFullId(String s) {
                    this.record=record;
                }
            }



            String externalData = "external data";
            Consumer<Person> setRecord =
                    p -> {
                        String var100001 = p.getFirstName();
                        p.seFullId(p.getFirstName() + " " + "," +
                                var100001 + p.getLastName() + "," + p.getAge() + "," + externalData);
                    };
            Consumer<Person> printRecord = p -> {
                System.out.println(p.getRecord());

            };
            Consumer<Person> setRecordAndThenPrint = setRecord.andThen(printRecord);
            setRecordAndThenPrint.accept(new Person(52, "Ahmed", "Ali"));

        }
    public static Consumer<String>printWithPrefixAndPostfix(String prefix,String postfix) {
        return (s) -> {
            System.out.println(prefix + s + postfix);

        };
    }


    }








