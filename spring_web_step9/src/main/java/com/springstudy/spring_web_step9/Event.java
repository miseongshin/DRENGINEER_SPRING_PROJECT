package com.springstudy.spring_web_step9;

import javax.validation.constraints.*;

public class Event {

    Integer id;

    @NotEmpty
    String title;

    @NotNull @Min(0) //  컬렉션 사용@Size(min=0)
    Integer limit;

    @Email
    String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", limit=" + limit +
                ", email='" + email + '\'' +
                '}';
    }
}
