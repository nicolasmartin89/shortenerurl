package com.nicom.shortenerurl.repository;

import com.nicom.shortenerurl.models.ClickEvent;
import com.nicom.shortenerurl.models.UrlMapping;
import com.nicom.shortenerurl.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ClickEventRepository extends JpaRepository<ClickEvent, Long> {
    List<ClickEvent> findByUrlMappingAndClickDateBetween(UrlMapping mapping, LocalDateTime startDate,
                                                         LocalDateTime endDate);

    List<ClickEvent> findByUrlMappingInAndClickDateBetween(List<UrlMapping> listMapping, LocalDateTime startDate,
                                                         LocalDateTime endDate);

}
