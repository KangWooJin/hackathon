package me.hackathon.root.model.response;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserOrderSellsView {
    List<UserOrderSell> userOrderSells;
}
