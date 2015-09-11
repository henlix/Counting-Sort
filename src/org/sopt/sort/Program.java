package org.sopt.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Program {

    static ArrayList<ICompare> sample = new ArrayList<>();

    static {

        sample.add(new Data("Lorem ipsum dolor sit amet", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        sample.add(new Data("In eget lacus rhoncus", "In eget lacus rhoncus, facilisis justo ac, venenatis turpis."));
        sample.add(new Data("Vestibulum aliquet", "Vestibulum aliquet leo sed tellus faucibus, quis feugiat felis lobortis."));
        sample.add(new Data("Nunc ut augue sit", "Nunc ut augue sit amet leo consectetur volutpat."));
        sample.add(new Data("Praesent fermentum", "Praesent fermentum ex quis nunc porta, sit amet ultricies justo ultricies."));
        sample.add(new Data("Morbi vehicula justo", "Morbi vehicula justo aliquam velit lacinia tristique."));
        sample.add(new Data("Suspendisse varius", "Suspendisse varius orci ullamcorper, porta tellus sed, dignissim diam."));
        sample.add(new Data("Nunc fermentum arcu", "Nunc fermentum arcu viverra, porta nibh eget, luctus quam."));
        sample.add(new Data("Nam finibus felis non", "Nam finibus felis non magna scelerisque, eget fringilla nulla scelerisque."));
        sample.add(new Data("Donec sagittis eros", "Donec sagittis eros quis dui auctor porta."));
    }

    public static void main(String[] args) {

        print(sample);
        sort(sample);
    }

    public static void print(ArrayList<ICompare> source) {

        for (ICompare item : source) {

            System.out.println(item);
        }

        System.out.println("================================");
    }

    public static void sort(ArrayList<ICompare> source) {

        HashMap<Integer, ArrayList<ICompare>> map = new HashMap<>();

        for (ICompare item : source) {

            if (map.containsKey(item.identifier())) {

                map.get(item.identifier()).add(item);
            }
            else {

                ArrayList<ICompare> line = new ArrayList<>();
                line.add(item);

                map.put(item.identifier(), line);
            }
        }

        for (int key : map.keySet())
            for (ICompare item : map.get(key))
                System.out.println(item);
    }
}
