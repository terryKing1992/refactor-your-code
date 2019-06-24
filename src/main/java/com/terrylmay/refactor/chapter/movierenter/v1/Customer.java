package com.terrylmay.refactor.chapter.movierenter.v1;

import java.util.List;

public class Customer {
    private String name;

    private List<Order> rentals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getRentals() {
        return rentals;
    }

    public void setRentals(List<Order> rentals) {
        this.rentals = rentals;
    }

    public String printRentalsBill() {
        double totalAccount = 0;
        int frequentRenterPoints = 0;
        String result = "rental record for " + getName() + "\n";

        for (Order order : this.rentals) {
            double currentOrderCost = 0;
            switch (order.getMovie().getType()) {
                case "children":
                    currentOrderCost += 2;
                    if (order.getDayRented() > 2) {
                        currentOrderCost += (order.getDayRented() - 2) * 1.5;
                    }
                case "regular":
                    currentOrderCost += order.getDayRented() * 3;
                    break;
                case "new_release":
                    currentOrderCost += 1.5;
                    if (order.getDayRented() > 3) {
                        currentOrderCost += (order.getDayRented() - 3) * 1.5;
                    }
                    break;
            }

            frequentRenterPoints++;

            if (order.getMovie().getType().equals("new_release") && order.getDayRented() > 1) {
                frequentRenterPoints++;
            }

            result += "\t" + order.getMovie().getName() + "\t" + currentOrderCost + "\n";
            totalAccount += currentOrderCost;
        }
        result += "Amount owed is " + totalAccount + "\n";
        result += "You earned " + frequentRenterPoints + " points for this rental\n";
        return result;
    }
}
