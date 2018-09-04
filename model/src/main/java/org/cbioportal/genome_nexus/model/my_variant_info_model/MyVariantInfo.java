package org.cbioportal.genome_nexus.model.my_variant_info_model;

import org.springframework.data.mongodb.core.mapping.Field;

public class MyVariantInfo
{

    @Field(value = "hgvs")
    private String hgvs;

    @Field(value = "version")
    private Integer version;

    @Field(value = "snpeff")
    private Snpeff snpeff;

    @Field(value = "vcf")
    private Vcf vcf;

    @Field(value = "dbsnp")
    private Dbsnp dbsnp;

    @Field(value = "cosmic")
    private Cosmic cosmic;

    @Field(value = "clin_var")
    private ClinVar clinVar;

    @Field(value = "mutdb")
    private Mutdb mutdb;


    public String getHgvs()
    {
        return hgvs;
    }

    public void setHgvs(String hgvs)
    {
        this.hgvs = hgvs;
    }
    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }
    public Snpeff getSnpeff()
    {
        return snpeff;
    }

    public void setSnpeff(Snpeff snpeff)
    {
        this.snpeff = snpeff;
    }
    public Vcf getVcf()
    {
        return vcf;
    }

    public void setVcf(Vcf vcf)
    {
        this.vcf = vcf;
    }
    public Dbsnp getDbsnp()
    {
        return dbsnp;
    }

    public void setDbsnp(Dbsnp dbsnp)
    {
        this.dbsnp = dbsnp;
    }
    public Cosmic getCosmic()
    {
        return cosmic;
    }

    public void setCosmic(Cosmic cosmic)
    {
        this.cosmic = cosmic;
    }
    public ClinVar getClinVar()
    {
        return clinVar;
    }

    public void setClinVar(ClinVar clinVar)
    {
        this.clinVar = clinVar;
    }
    public Mutdb getMutdb()
    {
        return mutdb;
    }

    public void setMutdb(Mutdb mutdb)
    {
        this.mutdb = mutdb;
    }

}
