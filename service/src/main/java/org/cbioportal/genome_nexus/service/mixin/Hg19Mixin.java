package org.cbioportal.genome_nexus.service.mixin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Hg19Mixin
{
    @JsonProperty(value = "start", required = false)
    private Integer start;

    @JsonProperty(value = "end", required = false)
    private Integer end;
}