package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.security.Key
import kotlin.random.Random

const val TAG = "PoetryLog"
const val KEY = "SavedIndex"

class MainActivity : AppCompatActivity() {

    private val poetry = listOf(
        "Я всегда твердил, что судьба — игра." +
                "\nЧто зачем нам рыба, раз есть икра.",
        "Что готический стиль победит, как школа," +
                "\nкак способность торчать, избежав укола.",
        "Я сижу у окна. За окном осина." +
                "\nЯ любил немногих. Однако — сильно.",
        "Я считал, что лес — только часть полена." +
                "\nЧто зачем вся дева, раз есть колено.",
        "Что, устав от поднятой веком пыли," +
                "\nрусский глаз отдохнет на эстонском шпиле.",
        "Я сижу у окна. Я помыл посуду." +
                "\nЯ был счастлив здесь, и уже не буду.",
        "Я писал, что в лампочке — ужас пола." +
                "\nЧто любовь, как акт, лишена глагола.",
        "Что не знал Эвклид, что, сходя на конус," +
                "\nвещь обретает не ноль, но Хронос.",
        "Я сижу у окна. Вспоминаю юность." +
                "\nУлыбнусь порою, порой отплюнусь.",
        "Я сказал, что лист разрушает почку." +
                "\nИ что семя, упавши в дурную почву,",
        "не дает побега; что луг с поляной" +
                "\nесть пример рукоблудья, в Природе данный.",
        "Я сижу у окна, обхватив колени," +
                "\nв обществе собственной грузной тени.",
        "Моя песня была лишена мотива," +
                "\nно зато ее хором не спеть. Не диво,",
        "что в награду мне за такие речи" +
                "\nсвоих ног никто не кладет на плечи.",
        "Я сижу у окна в темноте; как скорый," +
                "\nморе гремит за волнистой шторой.",
        "Гражданин второсортной эпохи, гордо" +
                "\nпризнаю я товаром второго сорта",
        "свои лучшие мысли и дням грядущим" +
                "\nя дарю их как опыт борьбы с удушьем.",
        "Я сижу в темноте. И она не хуже" +
                "\nв комнате, чем темнота снаружи.",
        ""
    )

    private var index: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            index = savedInstanceState.getInt(KEY)
        }

        Log.d(TAG, "${poetry[index]}")
        if (index < poetry.lastIndex) index++
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${poetry[index]}")
        if (index < poetry.lastIndex) index++
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${poetry[index]}")
        if (index < poetry.lastIndex) index++
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${poetry[index]}")
        if (index < poetry.lastIndex) index++
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${poetry[index]}")
        if (index < poetry.lastIndex) index++
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${poetry[index]}")
        if (index < poetry.lastIndex) index++
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${poetry[index]}")
        if (index < poetry.lastIndex) index++
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY, index + 1)
    }
}