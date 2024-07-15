package com.project.admin.domain.job;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Job")
@Table(name = "jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idJob")

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_job")
    private Long idJob;
    @Column(name = "event_date")
    private LocalDate eventDate;
    private String description;

}
