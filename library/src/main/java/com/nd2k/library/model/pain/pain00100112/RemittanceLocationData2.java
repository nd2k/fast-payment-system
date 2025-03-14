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
@XmlType(name = "RemittanceLocationData2", propOrder = {
        "mtd",
        "elctrncAdr",
        "pstlAdr"
})
public class RemittanceLocationData2 {

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected RemittanceLocationMethod2Code mtd;
    @XmlElement(name = "ElctrncAdr")
    protected String elctrncAdr;
    @XmlElement(name = "PstlAdr")
    protected NameAndAddress18 pstlAdr;
}
