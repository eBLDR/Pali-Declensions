package com.palideclensions

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import android.widget.ExpandableListView
import androidx.appcompat.app.AppCompatActivity
import com.palideclensions.ExpandableListData.data
import com.palideclensions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var expandableListView: ExpandableListView? = null
    private var adapter: CustomExpandableListAdapter? = null
    private var titleList: List<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        expandableListView = findViewById(R.id.expandableList)
        if (expandableListView != null) {
            val listData = data
            titleList = ArrayList(listData.keys)
            adapter = CustomExpandableListAdapter(this, titleList as ArrayList<String>, listData)
            expandableListView!!.setAdapter(adapter)
            expandableListView!!.setOnChildClickListener { _, _, groupPosition, childPosition, _ ->
                val clicked =
                    listData[(titleList as ArrayList<String>)[groupPosition]]!![childPosition]
                val context = applicationContext
                val intent = Intent(context, BaseDeclensionActivity::class.java)
                intent.addFlags(FLAG_ACTIVITY_NEW_TASK)
                intent.putExtra(BaseDeclensionActivity.declensionToLoad, clicked)
                context.startActivity(intent)
                false
            }
        }
    }
}