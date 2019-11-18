package com.poorak.pie.tree;

import java.util.*;

public class BaconNumber {
    class ActorNode {
        private String name;
        private int baconNumber = -1;
        private final Set<ActorNode> linkedActors = new HashSet<>();
        public String getName() { return name; }
        public int getBaconNumber() { return baconNumber; }
        public void setBaconNumber(int baconNumber) { this.baconNumber = baconNumber; }
        public Set<ActorNode> getLinkedActors() { return linkedActors; }

        public void addActor(ActorNode actor) {
            linkedActors.add(actor);
            actor.getLinkedActors().add(this);
        }
    }

    public int find(List<ActorNode> actors) {
        if (actors == null) return -1;
        Queue<ActorNode> q = new LinkedList<>();
        q.add(actors.get(0));
        ActorNode current = null;
        while (!q.isEmpty()) {
            current = q.poll();
            for (ActorNode node :
                    current.getLinkedActors()) {
                if (node.getBaconNumber() != -1) continue; // visited
                if (node.getName().equals("Kevin Bacon")) return current.getBaconNumber() + 1;
                else node.setBaconNumber(current.getBaconNumber() + 1);
            }
        }
        return -1;
    }
}
