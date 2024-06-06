package com.example.Payroll;
// Orders must go through a certain series of state transitions from the time a customer submits an order and it is either fulfilled or cancelled.
// Store these status as enums
enum Status {

  IN_PROGRESS, //
  COMPLETED, //
  CANCELLED
}