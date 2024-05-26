package org.example.jpa;

import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.example.jpa.domain.Address;
import org.example.jpa.domain.Member;
import org.example.jpa.domain.Order;
import org.example.jpa.domain.OrderStatus;
import org.example.jpa.domain.item.Book;
import org.example.jpa.repository.OrderRepository;
import org.example.jpa.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class OrderServiceTest {

    @Autowired
    EntityManager em;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderRepository orderRepository;

    @Test
    public void orderTest() throws Exception{

        Member member = new Member();
        member.setName("member1");

        member.setAddress(new Address("asdf", "seoul", "123=123"));
        em.persist(member);

        Book book = new Book();
        book.setName("jpa");
        book.setPrice(10000);
        book.setStockQuantity(10);

        em.persist(book);

        Long orderId = orderService.order(member.getId(), book.getId(), 2);

        Order getOrder = orderRepository.findById(orderId);

        Assertions.assertThat(OrderStatus.ORDER).isEqualTo(getOrder.getStatus());
        Assertions.assertThat(1).isEqualTo(getOrder.getOrderItems().size());
        Assertions.assertThat(8).isEqualTo(book.getStockQuantity());
    }

    @Test
    public void cancelOrderTest()throws Exception{

    }

    @Test
    public void remainStockOver() throws Exception{

    }
}