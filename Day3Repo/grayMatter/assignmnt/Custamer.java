package com.grayMatter.assignmnt;

class Customer extends User {
    private String customerLevel;

    public Customer(String name, int id, String customerLevel) {
        super(name, id);
        this.customerLevel = customerLevel;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    @Override
    public void getDetails() {
        System.out.println("Customer Name: " + getName() + ", ID: " + getId() + ", Level: " + customerLevel);
    }

    @Override
    public void setDetails(String name, int id) {
        setName(name);
        setId(id);
    }
}

