package com.colagom.infiniterv

import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dummyList = listOf(
        OfficialDish(
            R.drawable.img_image_4,
            R.drawable.img_image_4,
            R.drawable.img_image_4,
            R.string.title_official_dish,
            R.string.title_official_dish,
            R.string.title_official_dish,
            R.string.cost_official_dish,
            R.string.cost_official_dish,
            R.string.cost_official_dish,
            R.string.category
        ),
        OfficialDish(
            R.drawable.img_image_4,
            R.drawable.img_image_4,
            R.drawable.img_image_4,
            R.string.title_official_dish,
            R.string.title_official_dish,
            R.string.title_official_dish,
            R.string.cost_official_dish,
            R.string.cost_official_dish,
            R.string.cost_official_dish,
            R.string.category
        ),
        OfficialDish(
            R.drawable.img_image_4,
            R.drawable.img_image_4,
            R.drawable.img_image_4,
            R.string.title_official_dish,
            R.string.title_official_dish,
            R.string.title_official_dish,
            R.string.cost_official_dish,
            R.string.cost_official_dish,
            R.string.cost_official_dish,
            R.string.category
        ),
    )

    private val carouselAdapter by lazy {
        CarouselAdapterCustomer(this.baseContext, dummyList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_cat.run {
            PagerSnapHelper().attachToRecyclerView(this)
            adapter = carouselAdapter.apply {
                addItemDecoration(CircularIndicatorDecoration(this@MainActivity))
            }
            resumeAutoScroll()
        }

    }

}



data class OfficialDish (
    @DrawableRes val img1: Int,
    @DrawableRes val img2: Int,
    @DrawableRes val img3: Int,
    @StringRes val title1: Int,
    @StringRes val title2: Int,
    @StringRes val title3: Int,
    @StringRes val cost1: Int,
    @StringRes val cost2: Int,
    @StringRes val cost3: Int,
    @StringRes val category: Int,
)