package io.kodlama.Api.Controller;

import io.kodlama.Business.Abstracts.JobAdverstisementServices;
import io.kodlama.Core.utilities.results.Result;
import io.kodlama.Entites.dto.ActiveJobAdverstisementDto;
import io.kodlama.Entites.dto.AddJobAdvertDto;
import io.kodlama.Entites.dto.BusinessSectorToEmployerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobAdvertController {

    JobAdverstisementServices jobAdverstisementServices;

    @Autowired
    private JobAdvertController(JobAdverstisementServices jobAdverstisementServices) {
        this.jobAdverstisementServices = jobAdverstisementServices;
    }

    @GetMapping("/getallactivesectors")

    public List<ActiveJobAdverstisementDto> getAllActiveSectors(){
        return jobAdverstisementServices.getAllActiveSectors();
    }

    @GetMapping("/gettallactivesectordate")
    public List<BusinessSectorToEmployerDto> getAllActiveSectorsDate() {
        return jobAdverstisementServices.getAllActiveSectorsDate();
    }

    @PostMapping("/addjobadvert")
    public Result addJobAdvert(@RequestBody AddJobAdvertDto addJobAdvertDto) {

        return jobAdverstisementServices.addJobAdvert(addJobAdvertDto);
    }
}
