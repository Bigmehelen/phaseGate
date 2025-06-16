from unittest import TestCase 
from console_based_atm import atm_system

class test_console_based_atm(TestCase):

	def test_create_account_exist(self):
		atm_system.create_account("wande" , 50_000)
		