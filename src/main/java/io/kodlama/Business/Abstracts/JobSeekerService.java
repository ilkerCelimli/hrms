package io.kodlama.Business.Abstracts;

import io.kodlama.Core.utilities.results.Result;
import io.kodlama.Entites.Concretes.BusinessSectorsEntity;
import io.kodlama.Entites.Concretes.JobSeekerEntity;
import io.kodlama.Entites.Concretes.UserEntity;
import io.kodlama.Entites.dto.JobSeekerDto;

import java.util.List;

public interface JobSeekerService {

    Result insert(JobSeekerDto jobSeekerdto);
    List<JobSeekerEntity> getAll();



}
