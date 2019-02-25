package cn.itsource.aigou.domain;

import javax.xml.bind.PrintConversionEvent;

public class Employee {
    private Long id;
    private Boolean success;
    private String name;
    private String password;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", success=" + success +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
