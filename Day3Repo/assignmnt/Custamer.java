package com.grayMatter.assignmnt;

class Customer extends User {
    private String membershipLevel;

    public Customer(String name, int id, String membershipLevel) {
        super(name, id);
        this.membershipLevel = membershipLevel;
    }

    public String getCustomerLevel() {
        return membershipLevel;
    }

    public void setCustomerLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
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

