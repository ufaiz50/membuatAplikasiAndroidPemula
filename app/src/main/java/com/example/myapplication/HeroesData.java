package com.example.myapplication;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Umar Faiz Ubaidillah",
            "Mika Navieri A",
            "Dimas Bayu Wardana",
            "Raka Lintang Aditya",
            "Didik Alfianto",
            "Feni Arum Melati",
            "Silfa Khoirun Nisa",
            "Rudi Hartono",
            "Dito Rizka Ariyanto",
            "Roy Abdul Aziz"
    };

    private static String[] heroNims = {
            "17.01.55.0074",
            "17.01.55.0030",
            "17.01.55.0029",
            "17.01.55.0028",
            "17.01.55.0063",
            "17.01.55.0001",
            "17.01.55.0039",
            "17.01.55.0041",
            "17.01.55.0042",
            "17.01.55.0068"
    };

    private static String[] heroesProgdis = {
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi"
    };

    private static int[] heroesAngkatans = {
            2017,
            2017,
            2017,
            2017,
            2017,
            2017,
            2017,
            2017,
            2017,
            2017
    };

    private static String[] heroDetails = {
            "Nama saya Umar Faiz sering di panggil Umar, saya mahasiswa Unisbank dengan program Studi Sistem Informasi. Sekarang saya Fokus belajar Android Developer menggunakan bahasa kotlin dan flutter (dart). saya juga memiliki kemampuan dasar pada front end web development, saya juga belajar bahasa python dan php",
            "Gatau aku masih TK",
            "Penebar kebencian, pembuat keributan dan pecinta konflik",
            "I want to be a fuckboiii",
            "Suka mengganggu orang adalah jalan ninjaku, wan to be a good daddy",
            "Pokoknya paling kurus",
            "Saya orang yang apa adanya",
            "Stand here Alone!",
            "Saya jomblo pengen nikah",
            "Saya suka otak-atik barang, seorang analisis suka mencari masalah"

    };

    private static int[] heroesImages = {
            R.drawable.faiz,
            R.drawable.mika,
            R.drawable.bayu,
            R.drawable.raka,
            R.drawable.didik,
            R.drawable.feni,
            R.drawable.silfa,
            R.drawable.rudi,
            R.drawable.dito,
            R.drawable.roy
    };

    private static  String[] heroesnumber = {
            "081238838345",
            "081234567890",
            "081234567890",
            "081234567890",
            "081234567890",
            "081234567890",
            "081234567890",
            "081234567890",
            "081234567890",
            "081234567890"

    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setNim(heroNims[position]);
            hero.setProgdi(heroesProgdis[position]);
            hero.setAngkatan(heroesAngkatans[position]);
            hero.setPhoto(heroesImages[position]);
            hero.setNumber(heroesnumber[position]);
            list.add(hero);
        }
        return list;
    }
}
