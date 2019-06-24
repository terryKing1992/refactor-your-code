package com.terrylmay.refactor.chapter.movierenter.v1;

public class Order {
    private String orderId;
    private Movie movie;
    private int dayRented;

    public Order(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }
}
