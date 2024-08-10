
import java.util.*;

class node {
	double[] data;
	node left, right;

	public node(double[] points) {
		this.data = points;
		this.left = this.right = null;

	}
}

public class KDtree {

	node root;
	int k = 2;

	public KDtree() {
		root = null;
	}

	// Build tree
	void buildTree(double[][] points) {
		root = buildTreeRecursive(points, 0, points.length - 1, 0);
	}

	node buildTreeRecursive(double[][] points, int start, int end, int depth) {
		if (start > end)
			return null;
		int axis = depth % k;
		Arrays.sort(points, start, end + 1, new Comparator<double[]>() {
			@Override
			public int compare(double[] a, double[] b) {
				return Double.compare((a[axis]), b[axis]);
			}
		});

		int mid = start + (end - start) / 2;
		node nnode = new node(points[mid]);
		nnode.left = buildTreeRecursive(points, start, mid - 1, depth + 1);
		nnode.right = buildTreeRecursive(points, mid + 1, end, depth + 1);
		return nnode;
	}

	// Nearest Neighbor

	node nearestNeighbour(node root, double[] target, int depth) {
		if (root == null) {
			return null;
		}
		node nextBranch;
		node otherBranch;
		if (target[depth % k] < root.data[depth % k]) {
			nextBranch = root.left;
			otherBranch = root.right;

		} else {
			nextBranch = root.right;
			otherBranch = root.left;
		}
		node temp = nearestNeighbour(nextBranch, target, depth + 1);
		node best = closest(target, temp, root);

		double radiusSquared = distSquared(target, best.data);
		double dist = target[depth % k] - root.data[depth % k];
		if (radiusSquared >= dist * dist) {
			temp = nearestNeighbour(otherBranch, target, depth + 1);
			best = closest(target, temp, best);
		}
		return best;
	}

	node closest(double[] target, node n1, node n2) {
		if (n1 == null) {
			return n2;
		}
		if (n2 == null) {
			return n1;
		}
		double d1 = dist(n1.data, target);
		double d2 = dist(n2.data, target);

		if (d1 < d2) {
			return n1;

		} else {
			return n2;
		}
	}

	double dist(double[] data, double[] target) {

		double dlon = data[0] - target[0];
		double rlat1 = Math.toRadians(data[1]);
		double rlat2 = Math.toRadians(target[1]);
		double rdLong = Math.toRadians(dlon);

		double a = Math.cos(rdLong) * Math.cos(rlat1) * Math.cos(rlat2) + Math.sin(rlat1) * Math.sin(rlat2);

		return 6371000 * Math.acos(a);
	}

	double distSquared(double[] p1, double[] data) {
		double total = 0;
		for (int i = 0; i < k; i++) {
			double diff = Math.abs(p1[i] - data[i]);
			total += Math.pow(diff, 2);
		}
		return total;
	}
}