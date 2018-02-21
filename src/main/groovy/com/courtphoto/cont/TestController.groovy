package com.courtphoto.cont

import com.courtphoto.domain.Member

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.EntityTransaction
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by jihoonOh on 2018. 2. 20..
 */
@Controller
class TestController {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object saveConfig() {
        EntityManager em = entityManagerFactory.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Member m = new Member();
        m.setAge(10);
        m.setId('ojh9134');
        m.setUserName('jihoonOh');
        em.persist(m);
        tx.commit();

        em.close();

        return 'test';
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
