package org.sopt.sort;


import java.util.Random;

public class Data implements ICompare<Data> {

    private static Random random = new Random();

    public int id;
    public String name;
    public String association;

    public Data(String name, String association) {

        this.name = name;
        this.association = association;

        this.id = random.nextInt(10);
    }

    @Override
    public int identifier() { return id; }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Data))
            return false;

        return obj == this || this.id == ((Data) obj).id;
    }

    @Override
    public String toString() { return "id : " + id + " / " + name + " / " + association; }
}
