package J29_studenci;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    public StudentController() {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> listaStudentow = new ArrayList<>();

        while (true) {
            System.out.println("d - Dodaj studenta | w - Wyświetl listę studentów | u - usuń studenta | z - zmień dane | l - liczba stodentów | s- szukaj | <enter> wyjście");
            String dec = input.nextLine();

            if (dec.equals("d")) {
                System.out.println("Podaj imię:");
                String imie = input.nextLine();

                System.out.println("Podaj nazwisko:");
                String nazwisko = input.nextLine();

                System.out.println("Podaj nr indexu:");
                int index = input.nextInt();
                input.nextLine();

                Student stu = new Student(imie, nazwisko, index);
                listaStudentow.add(stu);
                Student.cout++;

            } else if (dec.equals("w")) {
                System.out.println("Lista studentów:");
                for (Student val : listaStudentow) {
                    System.out.println(val);
                }
            } else if (dec.equals("u")) {
                System.out.println("Podaj nr indexu:");
                int inx = input.nextInt();
                input.nextLine();
                for (Student ob : listaStudentow) {
                    if (ob.getIndex() == inx) {
                        listaStudentow.remove(ob);
                        System.out.println("Pomyślnie usunięto");
                        Student.cout--;
                        break;
                    }
                }
            } else if (dec.equals("z")) {
                System.out.println("Podaj nr indexu:");
                int inx = input.nextInt();
                input.nextLine();
                System.out.println("Podaj imię:");
                String imie = input.nextLine();

                System.out.println("Podaj nazwisko:");
                String nazwisko = input.nextLine();

                for (Student ob : listaStudentow)
                    if (ob.getIndex() == inx) {
                        if (!imie.equals(""))
                            ob.setImie(imie);
                        if (!nazwisko.equals(""))
                            ob.setNazwisko(nazwisko);
                        System.out.println("Pomyślnie zmieniono");
                        break;
                    }
            } else
                if (dec.equals("l")) {
                System.out.println("Liczba studentów: "+Student.cout);

            } else {
                if (dec.equals("s")) {
                    System.out.println("Podaj imię szukanego studenta:");
                    String inx = input.nextLine();
                    for (Student ob : listaStudentow) {
                        if (ob.getImie().indexOf(inx)>-1 ) {
                            System.out.println(ob);

                            System.out.println("Nie znaleziono studenta:");

                        }
                    }

                } else if (dec.equals("")) {
                    break;
                }
            }
        }

    }
}
