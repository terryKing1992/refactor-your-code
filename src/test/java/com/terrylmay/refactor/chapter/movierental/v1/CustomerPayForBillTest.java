package com.terrylmay.refactor.chapter.movierental.v1;

import com.terrylmay.refactor.chapter.movierenter.v1.Customer;
import com.terrylmay.refactor.chapter.movierenter.v1.Movie;
import com.terrylmay.refactor.chapter.movierenter.v1.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class CustomerPayForBillTest {

    @Test
    public void rentalBillDetail() {
        final Movie childrenMovie = new Movie("children", "哈利波特", 10);
        final Movie regularMovie = new Movie("regular", "指环王", 20);
        final Movie newReleaseMovie = new Movie("new_release", "盗墓笔记", 30);

        Customer customer = new Customer();
        customer.setName("王超");
        customer.setRentals(new ArrayList<Order>(){{
            add(new Order(childrenMovie, 3));
            add(new Order(regularMovie, 2));
            add(new Order(newReleaseMovie, 4));
        }});

        System.out.println(customer.printRentalsBill());
    }
}
