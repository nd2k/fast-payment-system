package com.nd2k.library.model.pain.pain00100112;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdviceType1", propOrder = {
        "cdtAdvc",
        "dbtAdvc"
})
public class AdviceType1 {

    @XmlElement(name = "CdtAdvc")
    protected AdviceType1Choice cdtAdvc;
    @XmlElement(name = "DbtAdvc")
    protected AdviceType1Choice dbtAdvc;
}
