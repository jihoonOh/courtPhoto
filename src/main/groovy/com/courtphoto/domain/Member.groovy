package com.courtphoto.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jihoonOh on 2018. 2. 20..
 */
@Entity
@Table(name='MEMBER')
class Member{

    @Id
    @Column(name = 'ID')
    String id;

    @Column(name = 'NAME')
    String userName;

    int age;

}
