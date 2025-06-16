class CheckOutApp {
  static cartItems = [];

  static printHeader(cashierName, customerName) {
    const todayDate = new Date();
    const dateString = todayDate.toLocaleDateString(); 
    const timeString = todayDate.toLocaleTimeString(); 

    const message = `
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 08088406240
Date: ${dateString}   ${timeString}
Cashier: ${cashierName}
Customer Name: ${customerName}

========================================================
	ITEMS	QTY	PRICE	TOTAL(NGN)
--------------------------------------------------------
    `;
    return message;
  }

  static addItems(item, quantity, price) {
    const itemList = [item, quantity, price];
    this.cartItems.push(itemList);
    return this.cartItems;
  }

  static clearCart() {
    this.cartItems = [];
  }
}


