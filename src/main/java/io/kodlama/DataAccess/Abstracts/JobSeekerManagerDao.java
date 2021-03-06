package io.kodlama.DataAccess.Abstracts;

import io.kodlama.Entites.Concretes.JobSeekerEntity;
import io.kodlama.Entites.Concretes.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
import java.util.List;

public interface JobSeekerManagerDao extends JpaRepository<JobSeekerEntity , Long> {

    JobSeekerEntity getAllByUser_UserId(long id);



}
