package io.kodlama.Entites.Mapper;


import io.kodlama.Entites.Concretes.JobSeekerEntity;
import io.kodlama.Entites.Concretes.UserEntity;
import io.kodlama.Entites.dto.AccountDto;
import io.kodlama.Entites.dto.JobSeekerDto;
import io.kodlama.Entites.dto.JobSeekerExperienceDto;
import io.kodlama.Entites.dto.JobSeekerSchoolDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface JobSeekerDtoConverter {

    JobSeekerEntity jobSeekerDtoConverter(JobSeekerDto jobSeekerDto);


    UserEntity jobSeekerToUserDtoConverter(JobSeekerDto jobSeekerDto);

    JobSeekerEntity jobSeekerExperienceDtoConverter(JobSeekerExperienceDto jobSeekerExperienceDto);

    JobSeekerEntity jobSeekerSchoolDtoConverter(JobSeekerSchoolDto jobSeekerSchoolDto);

    AccountDto jobSeekerDtoConverterToEntity(JobSeekerEntity jobSeekerEntity);

    List<JobSeekerDto> getAllJobSeekerDtoConverter(List<JobSeekerEntity> jobSeekerEntityList);
}
