/* eslint-disable */
import Constants from './constants';

const USER_ORDER_URL_PATH = '/api/userOrder';

// Mapping Class with UserOrderController
class UserOrderApi {

  static insertUserOrder(userOrderVO) {
    console.log(JSON.stringify(userOrderVO));
    return $.post({
      url: `${USER_ORDER_URL_PATH}/insertUserOrder`,
      data: JSON.stringify(userOrderVO),
      headers: Constants.JSON_HEADERS
    });
  }

  static getUserOrderList() {
    return $.get({
      url: `${USER_ORDER_URL_PATH}/getUserOrderList`,
    });
  }

}

export default UserOrderApi;
