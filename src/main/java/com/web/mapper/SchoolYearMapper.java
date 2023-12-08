package com.web.mapper;

import com.web.entity.SchoolYear;
import com.web.dto.request.SchoolYearRequest;
import com.web.dto.response.SchoolYearResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SchoolYearMapper {

    SchoolYearResponse toResponse(SchoolYear schoolYear);

    List<SchoolYearResponse> toSchoolYearListDTO(List<SchoolYear> schoolYears);

    SchoolYear toEntity(SchoolYearRequest schoolYearRequest);
}
