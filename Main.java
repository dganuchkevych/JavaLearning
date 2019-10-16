package com.company;

public class Main {

    public static void main(String[] args)
    {
        Cat lol = new Cat();
        lol.voice();

        Pets pep = new Pets("pep", 10);
        pep.voice();
        pep.display();

        Dogs mops = new Dogs("mops", 1, "home");
        mops.voice();
        mops.display();
        mops.from();

    }
}
