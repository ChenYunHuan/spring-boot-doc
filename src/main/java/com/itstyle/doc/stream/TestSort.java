package com.itstyle.doc.stream;

import com.itstyle.doc.model.Offer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSort {

    public static void main(String[] args) {

        List<Offer> offers = new ArrayList();

        Offer offer = new Offer();
        offer.setId("1");
        offer.setName("developing");

        Offer offer1 = new Offer();
        offer1.setId("2");
        offer1.setName("testing");

        Offer offer2 = new Offer();
        offer2.setId("3");
        offer2.setName("");

        Offer offer3 = new Offer();
        offer3.setId("4");
        offer3.setName("");

        offers.add(offer);
        offers.add(offer1);
        offers.add(offer2);
        offers.add(offer3);


        System.out.println(offers);
        Comparator<Offer> netTypeComparator = new Comparator<Offer>() {
            @Override
            public int compare(Offer o1, Offer o2) {
                int v1 = "developing".equals(o1.getName()) ? 3 : "".equals(o1.getName()) ? 2 : "testing".equals(o1.getName()) ? 1 : 0;
                int v2 = "developing".equals(o2.getName()) ? 3 : "".equals(o2.getName()) ? 2 : "testing".equals(o2.getName()) ? 1 : 0;
                return  v2 - v1;
            }
        };

        Collections.sort(offers, netTypeComparator);
        System.out.println(offers);

    }


    @Test
    public void test() {
        List<String> list  = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<String> list1 = list.subList(1, 2);
        list.add("4");
        for (String s : list1) {
            System.out.println(s);
        }

    }
}
