package com.smsrn.composepractice.repository

import com.smsrn.composepractice.model.Person

/**
 * Created by Sibtain Raza
 * sibtain.raza@10pearls.com
 */
class PersonRepository {
    fun getAllData():List<Person>{
        return listOf(
            Person(0,"AF","AZ",20),
            Person(1,"BF","BZ",21),
            Person(3,"CF","CZ",23),
            Person(4,"DF","DZ",24),
            Person(5,"EF","EZ",25),
            Person(6,"FF","FZ",26),
            Person(7,"GF","GZ",27),
            Person(8,"HF","HZ",28),
            Person(9,"IF","IZ",29),
        )
    }

}