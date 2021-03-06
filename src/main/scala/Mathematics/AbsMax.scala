package Mathematics

object AbsMax {

	/**
	    * Method returns absolute Maximum Element from the list
	    *
	    * @param elements
    	    * @return
    	*/
	def absMax(elements : List[Int]): Int = Abs.abs(elements.maxBy(x => Abs.abs(x)))

}
