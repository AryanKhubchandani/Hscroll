package com.example.hscroll

class version(val url: String, val name: String) {

    companion object {

        fun getList(): List<version> {
            val versionList = ArrayList<version>()
            versionList.clear()
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/one.jpg?raw=true", "Football"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/two.jpg?raw=true", "Basketball"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/three.jpg?raw=true", "Cricket"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/four.jpg?raw=true", "Lawn Tennis"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/five.jpg?raw=true", "Boxing"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/six.jpg?raw=true", "Golf"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/seven.jpg?raw=true", "Badminton"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/eight.jpg?raw=true", "Table Tennis"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/nine.jpg?raw=true", "Baseball"))
            versionList.add(version("https://github.com/AryanKhubchandani/Hscroll/blob/master/images/ten.jpg?raw=true", "Hockey"))
            return versionList
        }
    }
}
