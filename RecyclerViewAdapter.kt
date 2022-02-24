class /*<Class name>*/Adapter(
    private val context: Context,
    var dataset: /*Provide data set type*/ = /*Initial data set value*/

) : RecyclerView.Adapter</*<Class name>*/Adapter./*<ViewHolder name>*/>() {

    /**
     * Inner class used to store data about each element in the RecyclerView. It inherits from
     * RecyclerView.ViewHolder so it can be used by the RecyclerView.
     */
    class /*<ViewHolder name>*/(private val view: View) : RecyclerView.ViewHolder(view) {
        // We create references to elements in list_item.xml so we can modify them.  
        /* TODO: Provide constants that will link to elements in the item list xml. For example:
        
        val intersectionItemName: TextView = view.findViewById(R.id.intersectionItemName) // intersectionItemName is the name of a TextView element
        val position: TextView = view.findViewById(R.id.position) // position is the name of a TextView element
        */
    }

    /**
     * Creates a View to visualize one element in the RecyclerView. We pass in a reference to the
     * [parent] object, in this case MainActivity.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): /*<ViewHolder name>*/ {
        /**
         * We use an inflater based on the parent (MainActivity) to create the view in the correct
         * position. We then inflate the layout from list_item.xml into that position.
         */
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout./*<Name of your item list xml, for example list_item>*/, parent, false)

        // We create and return an ItemViewHolder object using the layout we inflated.
        return  /*<ViewHolder name>*/(adapterLayout)
    }

    /**
     * The function is called whenever the RecyclerView displays a specific element. It provides
     * access to [holder], which is the ItemView holder created to store layout information and
     * a [position] that indicates where the element is in the RecyclerView.
     */
    override fun onBindViewHolder(holder:  /*<ViewHolder name>*/, position: Int) {
        /**
         * We retrieve the corresponding intersection name from our dataset so it is displayed in
         * the correct position of the RecyclerView
         */

        /* TODO: Provide code to retrieve the corresponding element at a given position. For example:
        val item = dataset[position]
        */

        /**
         *  We change the values of the elements in the layout according to the data values. We use
         *  the position parameter to show numbering.
         */

        /* TODO: Provide code that changes the values of elements in the item view. For example: 
        holder.position.text = (position + 1).toString() + "."
        holder.intersectionItemName.text = item
        */
    }

    // Retrieves the amount of data inside our data set.
    override fun getItemCount(): Int = dataset.size
}
