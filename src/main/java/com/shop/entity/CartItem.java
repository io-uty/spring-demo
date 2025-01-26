package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="cart_item")
public class CartItem {

    @Id
    @GeneratedValue
    @Column(name="cart_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)//다대일 - 장바구니에 여러 상품
    @JoinColumn(name="cart_id") //이게 columnid로 추가된다
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY) //다대일 - 하나의 상품이 여러 장바구니에
    @JoinColumn(name="item_id")
    private Item item;

    private int count;
}
