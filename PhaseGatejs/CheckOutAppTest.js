
const CheckOutApp = require('./checkoutApp');

beforeEach(() => {
  CheckOutApp.clearCart();
});

test('CheckOutApp exists and printHeader works', () => {
  const customerName = 'Justice';
  const cashierName = 'Helen';


  console.log = jest.fn();

  CheckOutApp.printHeader(customerName, cashierName);

  expect(console.log).toHaveBeenCalledWith('Customer: Justice, Cashier: Helen');
});
