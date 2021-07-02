package io.kodlama.Business.Concretes;

import com.cloudinary.utils.ObjectUtils;
import io.kodlama.Business.Abstracts.JobSeekerCvService;
import io.kodlama.Core.utilities.results.Result;
import io.kodlama.Core.utilities.results.SuccessResult;
import io.kodlama.DataAccess.Abstracts.JobSeekerCvDao;

import io.kodlama.Entites.Mapper.CvDtoConverter;
import io.kodlama.Entites.dto.CvDto;
import io.kodlama.adapters.CloudinaryAdapter;

import io.kodlama.adapters.UploadImageServices;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class JobSeekerCvManager implements JobSeekerCvService {
    private final  JobSeekerCvDao jobSeekerCvDao;
  private final CvDtoConverter cvDtoConverter;
    private final UploadImageServices uploadImageServices;


    public JobSeekerCvManager(JobSeekerCvDao jobSeekerCvDao, CvDtoConverter cvDtoConverter,
                              UploadImageServices cloudinaryAdapter) {
        this.jobSeekerCvDao = jobSeekerCvDao;
        this.cvDtoConverter = cvDtoConverter;

        this.uploadImageServices= cloudinaryAdapter;
    }

    @Override
    public Result addCv(CvDto cvDto) throws IOException {


        uploadImageServices.CloudinaryAdapter().uploader().upload(cvDto.getImageUrl(), ObjectUtils.emptyMap());
            jobSeekerCvDao.save(cvDtoConverter.cvDtoConverter(cvDto));

        return new SuccessResult(true,"Kaydedildi");
    }
}
