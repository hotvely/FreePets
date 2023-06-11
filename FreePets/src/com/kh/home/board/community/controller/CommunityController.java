package com.kh.home.board.community.controller;

import com.kh.home.board.community.model.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommunityController 
{
    private List<Community> communities = new ArrayList<>();
    public List<Community> getAll() 
    {
        return communities;
    }
    
    
    //여기에는 community 관련된 코드 들.
    //예를 들면 게시글 검색 이라던지.?
    
    
    //아래 코드 친구들은 PostController쪽으로 빼 는 것이 좋아 보입니당 ~
//    public Community[] getHotCommunity() 
//    {
//        Community[] hotCommunity = (Community[]) communities.toArray();
//        for (int i = 0; i < hotCommunity.length; i++) 
//        {
//            for (int j = i + 1; j < hotCommunity.length; j++) 
//            {
//                if (hotCommunity[i].like < hotCommunity[j].like) 
//                {
//                    Community temp = hotCommunity[i];
//                    hotCommunity[i] = hotCommunity[j];
//                    hotCommunity[j] = temp;
//                }
//            }
//        }
//        return Arrays.copyOfRange(hotCommunity, 0, 5);
//    }
//    
//    public void like(String id) {
//        Community community = null;
//        for (int i = 0; i < communities.size(); i++)
//        {
//            if (communities.get(i).id.equals(id)) 
//            {
//                community = communities.get(i);
//            }
//        }
//        community.setLike(community.getLike() + 1);
//    }
}