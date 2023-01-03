package com.portfolio.portfolio_project.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Table(name = "project")
@Getter
@Entity
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long project_id;

    @Column(nullable = false)
    private String project_name;

    @Column(nullable = false)
    private String contents;
}
