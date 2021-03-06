package org.cbioportal.genome_nexus.service.annotation;

import org.cbioportal.genome_nexus.model.TranscriptConsequence;
import org.cbioportal.genome_nexus.model.VariantAnnotation;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ExonResolver
{
    private final CanonicalTranscriptResolver canonicalTranscriptResolver;

    public ExonResolver(CanonicalTranscriptResolver canonicalTranscriptResolver)
    {
        this.canonicalTranscriptResolver = canonicalTranscriptResolver;
    }

    @Nullable
    public String resolve(TranscriptConsequence transcriptConsequence)
    {
        String exon = null;

        if (transcriptConsequence != null) {
            exon = transcriptConsequence.getExon();
        }

        return exon;
    }

    @Nullable
    public String resolve(VariantAnnotation variantAnnotation)
    {
        return this.resolve(this.canonicalTranscriptResolver.resolve(variantAnnotation));
    }
}
