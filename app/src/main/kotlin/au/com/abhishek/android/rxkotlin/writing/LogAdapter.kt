package au.com.abhishek.android.rxkotlin.writing

import android.content.Context
import android.widget.ArrayAdapter
import au.com.abhishek.android.rxkotlin.R

/**
 * Created by Abhishek Pathak on 19/04/2020.
 */

class LogAdapter(context: Context, logs: List<String>) :
        ArrayAdapter<String>(context, R.layout.item_log, R.id.item_log, logs)