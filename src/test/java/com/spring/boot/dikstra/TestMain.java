package com.spring.boot.dikstra;

import org.assertj.core.util.Lists;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.internal.matchers.Matches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * <p>Title: TestMain </p>
 * <p>Description: TestMain </p>
 * Date: 2018年06月13日 下午10:40 PM
 *
 * @author gaosheng@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2018年06月13日       SGao        创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public class TestMain {
    @Test
    public void testMethod() {
        Node nodeA = new Node("A");  //set nodeA as default origin
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        nodeA.addDestination(nodeB, 2);
        nodeA.addDestination(nodeC, 2);
        nodeB.addDestination(nodeC, 2);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);

        // set node A as start path
        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
        ArrayList<Node> nodes = new ArrayList<>(graph.getNodes());
        Collections.sort(nodes, Comparator.comparing(Node::getDistance));
        Node retNode = nodes.get(nodes.size() - 1);

        System.out.print(retNode.getDistance() + nodeA.getDistance());
        System.out.print("最优路径是");
//        retNode.
        Assert.assertThat(0, Matchers.not(graph.getNodes().size()));
    }
}
