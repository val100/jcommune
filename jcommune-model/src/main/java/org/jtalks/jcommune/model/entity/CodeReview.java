/**
 * Copyright (C) 2011  JTalks.org Team
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.jtalks.jcommune.model.entity;

import org.jtalks.common.model.entity.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Represents the code review for the topic. Contains the list of {@link CodeReviewComment}
 * for each commented line of code and configuration parameters for review.
 *
 * @author Vyacheslav Mishcheryakov
 */
public class CodeReview extends Entity implements SubscriptionAwareEntity {

    private Topic topic;
    private List<CodeReviewComment> comments = new ArrayList<CodeReviewComment>();


    /**
     * {@inheritDoc}
     */
    public Set<JCUser> getSubscribers() {
        return topic.getSubscribers();
    }

    /**
     * {@inheritDoc}
     */
    public void setSubscribers(Set<JCUser> subscribers) {
        topic.setSubscribers(subscribers);
    }

    /**
     * Check if user subscribed to {@link CodeReview}.
     *
     * @param user {@link JCUser} to check.
     * @return {@code true} if user subscribed to {@link CodeReview} otherwise {@code false}.
     */
    public boolean isUserSubscribed(JCUser user) {
        return topic.userSubscribed(user);
    }

    /**
     * @return the topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    /**
     * @return the comments
     */
    public List<CodeReviewComment> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<CodeReviewComment> comments) {
        this.comments = comments;
    }
    
    /**
     * Add comment to this review
     * @param comment comment to add
     */
    public void addComment(CodeReviewComment comment) {
        comments.add(comment);
    }
    
}
