package Mathematics

object FindMax {

	/**
	    * Method returns Max Element from the list
	    *
	    * @param elements
    	    * @return
    	*/
	def findMax(elements : List[Int]): Int = elements.foldLeft(elements.head){(acc, i) => if (acc > i) acc else i}
}
