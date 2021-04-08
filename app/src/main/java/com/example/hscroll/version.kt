package com.example.hscroll

class version(val url: String, val name: String) {

    companion object {

        fun getList(): List<version> {
            val versionList = ArrayList<version>()
            versionList.clear()
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/one.jpg", "Football"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/two.jpg", "Basketball"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/three.jpg", "Cricket"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/four.jpg", "Lawn Tennis"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/five.jpg", "Boxing"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/six.jpg", "Golf"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/seven.jpg", "Badminton"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/eight.jpg", "Table Tennis"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/nine.jpg", "Baseball"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/images/ten.jpg", "Hockey"))
            return versionList
        }
    }
}