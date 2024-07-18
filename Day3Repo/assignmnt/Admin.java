package com.grayMatter.assignmnt;

class Admin extends User {
    private String adminRole;

    public Admin(String name, int id, String adminRole) {
        super(name, id);
        this.adminRole = adminRole;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    @Override
    public void getDetails() {
        System.out.println("Admin Name: " + getName() + ", ID: " + getId() + ", Role: " + adminRole);
    }

    @Override
    public void setDetails(String name, int id) {
        setName(name);
        setId(id);
    }
}

