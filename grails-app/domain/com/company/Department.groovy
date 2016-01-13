package com.company

class Department {

    String title

    static hasMany = [employees : Employee]

    static constraints = {
    }


    @Override
    public String toString() {
        title
    }
}
