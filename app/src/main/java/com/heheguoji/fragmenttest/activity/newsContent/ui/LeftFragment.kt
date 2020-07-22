import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.heheguoji.fragmenttest.R
import com.heheguoji.fragmenttest.activity.newsContent.adapter.LeftAdapter
import com.heheguoji.fragmenttest.activity.newsContent.bean.News
import kotlinx.android.synthetic.main.left_fragment.*

class LeftFragment : Fragment() {
    private lateinit var  list:ArrayList<News>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initNews()
        val view:View=inflater.inflate(R.layout.left_fragment, container, false)
        val layoutManager= LinearLayoutManager(activity)
        left_recyclerview?.layoutManager=layoutManager
        val adapter=LeftAdapter(list)
        left_recyclerview?.adapter=adapter
        return view
    }

    private fun initNews() {
        list=ArrayList<News>()
        repeat(10){
            list.add(News("1","11111"))
            list.add(News("2","1112211"))
            list.add(News("3","11133311"))
            list.add(News("4","4444"))
            list.add(News("5","555"))
        }
    }
}