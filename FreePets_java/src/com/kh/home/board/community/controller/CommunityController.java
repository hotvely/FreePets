package com.kh.home.board.community.controller;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

import com.kh.home.board.community.model.Community;

	public class CommunityController {
	    private List<Community> communities = new ArrayList<>();

	    public List<Community> getAll() {
	        return communities;
	    }

	    public Community[] getHotCommunity() {
	        Community[] hotCommunity = (Community[]) communities.toArray();
	        for (int i = 0; i < hotCommunity.length; i++) {
	            for (int j = i + 1; j < hotCommunity.length; j++) {
	                if (hotCommunity[i].like < hotCommunity[j].like) {
	                    Community temp = hotCommunity[i];
	                    hotCommunity[i] = hotCommunity[j];
	                    hotCommunity[j] = temp;
	                }
	            }
	        }
	        return Arrays.copyOfRange(hotCommunity, 0, 5);
	    }

	    public void like(String id) {
	        Community community = null;
	        for (int i = 0; i < communities.size(); i++) {
	            if (communities.get(i).id.equals(id)) {
	                community = communities.get(i);
	            }
	        }
	        community.setLike(community.getLike() + 1);
	    }

	}
	

