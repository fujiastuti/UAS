package com.fuji.tauasfuji.ui.activity

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.fuji.tauasfuji.BuildConfig
import com.fuji.tauasfuji.R
import com.fuji.tauasfuji.ui.fragment.JadwalKuliahFragment
import com.fuji.tauasfuji.ui.fragment.ProfilFragment
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.activity_main.*

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //tvNameAplikationID.text = BuildConfig.APPLICATION_ID//

        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add("Jadwal Kuliah", JadwalKuliahFragment::class.java)
                .add("Profil", ProfilFragment::class.java)
//                .add("Bulan Hijriah", SecondFragment::class.java)
//                .add("Profil", FourFragment::class.java)
                .create()
        )

        val viewPager = findViewById(R.id.viewpager) as ViewPager
        viewPager.adapter = adapter

        val viewPagerTab = findViewById(R.id.viewpagertab) as SmartTabLayout
        viewPagerTab.setViewPager(viewPager)
    }
}