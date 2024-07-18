package com.grayMatter.assignmnt;

class Customer extends User {
    private String membershipLevel;

    public Customer(String name, int id, String customerLevel) {
        super(name, id);
        this.membershipLevel = customerLevel;
    }

    public String getCustomerLevel() {
        return membershipLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.membershipLevel = customerLevel;
    }

    @Override
    public void getDetails() {
        System.out.println("Customer Name: " + getName() + ", ID: " + getId() + ", Level: " + membershipLevel);
    }

    @Override
    public void setDetails(String name, int id) {
        setName(name);
        setId(id);
    }
}

