package com.cipher.matching.engine.bean;

import com.cipher.matching.engine.enums.Side;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderBook implements Serializable {

    private String instrument;
    private BigDecimal qty;
    private BigDecimal price;
    private Side side;
}
