package com.example.springtest.domain.converter;

import com.example.springtest.domain.model.DetailedListDto;
import com.example.springtest.domain.model.ShortListDto;
import com.example.springtest.entity.ListEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ListConverter {

    ListEntity convert(ShortListDto dto);

    DetailedListDto convert(ListEntity dto);

    ShortListDto convertToShort(ListEntity dto);
}
