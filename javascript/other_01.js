function strictDivision(number, divisor) {
  if (divisor == 0) {
    throw new Error("Dividing by zero is not allowed");
  } else {
    return number / divisor;
  }
}

try {
  const result = strictDivision(42, 0);
} catch (error) {
  console.log(`Error: ${error.message}`);
}
