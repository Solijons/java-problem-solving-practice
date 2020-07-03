public boolean isPowerNumber(int number, int power) {

  if (number == 0) {
    return false;
  }

  while(number % power == 0) {
    number = number / 2;
  }

  return number == 1;

}
