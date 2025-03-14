package com.nd2k.library.model.pain.pain00100112;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdviceType1Choice", propOrder = {
        "cd",
        "prtry"
})
public class AdviceType1Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected AdviceType1Code cd;
    @XmlElement(name = "Prtry")
    protected String prtry;
}
