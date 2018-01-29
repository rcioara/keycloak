package com.infonova.paybox.securerestapi.model;

public class Customer {
    private String name;
    private String addres;

    public Customer(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return addres != null ? addres.equals(customer.addres) : customer.addres == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (addres != null ? addres.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }
}
