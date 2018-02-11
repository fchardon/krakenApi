package com.ptrader.connector.kraken.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ptrader.connector.kraken.result.common.OrderDirection;
import com.ptrader.connector.kraken.result.common.OrderType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Map;

public class TradesInformationResult extends Result<Map<String, TradesInformationResult.TradeInformation>> {

    public static class TradeInformation {

        @JsonProperty("ordertxid")
        public String orderTransactionId;

        @JsonProperty("pair")
        public String assetPair;

        @JsonProperty("time")
        public Long tradeTimestamp;

        @JsonProperty("type")
        public OrderDirection orderDirection;

        @JsonProperty("ordertype")
        public OrderType orderType;

        public BigDecimal price;

        public BigDecimal cost;

        public BigDecimal fee;

        @JsonProperty("vol")
        public BigDecimal volume;

        public BigDecimal margin;

        @JsonProperty("misc")
        public String miscellaneous;

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("orderTransactionId", orderTransactionId)
                    .append("assetPair", assetPair)
                    .append("tradeTimestamp", tradeTimestamp)
                    .append("orderDirection", orderDirection)
                    .append("orderType", orderType)
                    .append("price", price)
                    .append("cost", cost)
                    .append("fee", fee)
                    .append("volume", volume)
                    .append("margin", margin)
                    .append("miscellaneous", miscellaneous)
                    .toString();
        }
    }
}