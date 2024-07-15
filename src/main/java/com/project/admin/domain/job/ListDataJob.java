package com.project.admin.domain.job;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListDataJob {

    LocalDate eventDate;
    String description;

    public ListDataJob(Job job) {

        this.eventDate = job.getEventDate();
        this.description = job.getDescription();

    }
}
