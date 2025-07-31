import pytest

# Create fixture
@pytest.fixture
def num_list():

   def num_list():
    return list(range(11))
   
# Write test method
def test_sum(num_list):

    # Initialize sum
    sum = 0

    # Add number in the list
    for n in num_list:
        sum += n

    # Assertion
    assert sum == 55