package io.kodlama.Business.Abstracts;

import io.kodlama.Core.utilities.results.Result;
import io.kodlama.Entites.dto.ActiveJobAdverstisementDto;
import io.kodlama.Entites.dto.AddJobAdvertDto;
import io.kodlama.Entites.dto.BusinessSectorToEmployerDto;

import java.util.List;

public interface JobAdverstisementServices {

    List<ActiveJobAdverstisementDto> getAllActiveSectors();
    List<BusinessSectorToEmployerDto> getAllActiveSectorsDate();
    Result addJobAdvert(Long userId ,AddJobAdvertDto addJobAdvertDto);

}
