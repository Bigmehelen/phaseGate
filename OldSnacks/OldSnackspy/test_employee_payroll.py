import employee_payroll
from employee_payroll import *
from unittest import TestCase

class Test_employee_payroll(TestCase):

	def test_that_employee_payroll_exist(self):
		list = []
		employee_payroll.add_employee_payroll(list, "ada", 8, 7.5, 2.0, 3.1)

	