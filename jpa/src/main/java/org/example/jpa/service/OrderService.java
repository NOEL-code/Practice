package org.example.jpa.service;

import lombok.RequiredArgsConstructor;
import org.example.jpa.domain.Delivery;
import org.example.jpa.domain.Member;
import org.example.jpa.domain.Order;
import org.example.jpa.domain.OrderItem;
import org.example.jpa.domain.item.Item;
import org.example.jpa.repository.ItemRepository;
import org.example.jpa.repository.MemberRepository;
import org.example.jpa.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;

    @Transactional
    public Long order(Long memberId, Long itemId, int count){
        Member member = memberRepository.findById(memberId);
        Item item = itemRepository.findById(itemId);

        Delivery delivery = new Delivery();
        delivery.setAddress(member.getAddress());

        OrderItem orderItem = OrderItem.createOrderItem(item, item.getPrice(), count);

        Order order = Order.createOrder(member, delivery, orderItem);

        orderRepository.save(order);

        return order.getId();
    }

    @Transactional
    public void cancelOrder(Long orderId){
        Order order = orderRepository.findById(orderId);
        order.cancelOrder();
    }

//    public List<Order> findOrder(OrderSearch orderSearch){
//
//    }
}
