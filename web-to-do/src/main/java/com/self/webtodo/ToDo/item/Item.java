package com.self.webtodo.ToDo.item;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String work;

    @Column
    private boolean click;

    @Builder
    public Item(Long id, String work, boolean click) {
        this.id = id;
        this.work = work;
        this.click = click;
    }
}
