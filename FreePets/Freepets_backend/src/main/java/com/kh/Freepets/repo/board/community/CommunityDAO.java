package com.kh.Freepets.repo.board.community;

import com.kh.Freepets.domain.board.community.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityDAO extends JpaRepository<Community, Integer> {
}
