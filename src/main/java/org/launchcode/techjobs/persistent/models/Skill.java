package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public Skill(){

    }
    @NotBlank @Size(max = 2000)
    private String description;
    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

//    @Override
//    public int getId() {
//        return super.getId();
//    }
//    @Override
//    public String getName() {
//        return super.getName();
//    }

//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}