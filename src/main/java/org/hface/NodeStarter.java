package org.hface;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Queue;

public final class NodeStarter {

    public static void main(String[] args) {

        HazelcastInstance instance = Hazelcast.newHazelcastInstance( new Config() );

        Map<Integer, String> mapCustomers = instance.getMap( "planets" );
        mapCustomers.put( 1, "Mercury" );
        mapCustomers.put( 2, "Venus" );
        mapCustomers.put( 3, "Earth" );

        Queue<String> queueCustomers = instance.getQueue( "classical-elements" );
        queueCustomers.offer( "earth" );
        queueCustomers.offer( "aether" );
        queueCustomers.offer( "water" );
        queueCustomers.offer( "fire" );
        queueCustomers.offer( "air" );
    }
}
