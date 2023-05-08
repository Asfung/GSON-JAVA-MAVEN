package com.paung.gson;

import com.google.gson.Gson;

import java.util.List;

class Person{
    String nama;
    int umur;
    String negara;

    Person(String nama, int umur, String negara){
        this.nama = nama;
        this.umur = umur;
        this.negara = negara;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
}

public class Main {
    public static void main(String[] args) {

        var person1 = new Person("paung", 15, "indonesia");
        var person2 = new Person("aji", 16, "Indonesia");
        var person3 = new Person("Jack", 17, "England");

        System.out.println(person1.getNama());

        Gson gson = new Gson();
        List allOfPerson = List.of(person1,person2,person3);

        var json = gson.toJson(allOfPerson);

        System.out.println(json);

        // another examples
        var jsonString = """
                
                {   
                    "nama" : "kurniawan",
                    "umur" : 13,
                    "negara" : "perancis"
                }
                
                """;

        var gson2 = new Gson();
        var person = gson2.fromJson(jsonString, Person.class);
        System.out.println(person.getNama());

    }
}
