package org.cbioportal.genome_nexus.web.mixin;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.cbioportal.genome_nexus.model.Dbsnp;
import org.cbioportal.genome_nexus.model.Snpeff;
import org.cbioportal.genome_nexus.model.Vcf;

import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyVariantInfoMixin
{
    @ApiModelProperty(value = "hgvs", required = false)
    private String hgvs;

    @ApiModelProperty(value = "version", required = false)
    private Integer version;

    @ApiModelProperty(value = "snpeff", required = false)
    private Snpeff snpeff;

    @ApiModelProperty(value = "vcf", required = false)
    private Vcf vcf;

    @ApiModelProperty(value = "dbsnp", required = false)
    private Dbsnp dbsnp;

    // @ApiModelProperty(value = "cosmic", required = false)
    // private Cosmic cosmic;

    // @ApiModelProperty(value = "clinvar", required = false)
    // private Clinvar clinvar;
}
