package com.leadersofdigital.ecocontrol.api.controller.dto.request;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.Penalty;
import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
public class OrganizationDtoCreateRequest {

    @NotNull
    private Long inn;

    @NotEmpty
    private String name;

    @NotNull
    private Location location;

    @NotNull
    private OrganizationType organizationType;

    private String okved;

    private String workType;

    private String address;
}
