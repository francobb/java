package com.example.demo.stats;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatsRepository extends JpaRepository<Stats, UUID> {
}
