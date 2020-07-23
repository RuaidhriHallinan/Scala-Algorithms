package Mathematics

object Abs {

	/**
	    * Method returns absolute value of the number
	    *
	    * @param number
    	    * @return
    	*/

	def abs(number : Int): Int = {
	    if (number < 0)
		return number * -1
	    return number;
	}
}
