package org.example.jpa.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

@Getter
@Entity
public class Member1 {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member1")
    private List<Order> orders = new ArrayList<>();

}
