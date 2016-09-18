package lt.graph;

import java.util.List;

public class TestCycles {

	/**
	 * @param args
	 */

	private static final int count = 10;

	public static void main(String[] args) {
		String nodes[] = new String[count];
		boolean adjMatrix[][] = new boolean[count][count];

		for (int i = 0; i < count; i++) {
			nodes[i] = "Node " + i;
		}

		/*adjMatrix[0][1] = true;
		adjMatrix[1][0] = true;*/


		adjMatrix[0][1] = true;
		adjMatrix[1][2] = true;
		adjMatrix[2][0] = true;

		adjMatrix[2][4] = true;
		adjMatrix[1][3] = true;
		adjMatrix[3][6] = true;

		adjMatrix[6][5] = true;
		adjMatrix[5][3] = true;
		adjMatrix[6][7] = true;

		adjMatrix[7][8] = true;
		adjMatrix[7][9] = true;
		adjMatrix[9][6] = true;
		
        /*adjMatrix[0][1] = true;
        adjMatrix[1][2] = true;
        adjMatrix[2][0] = true; adjMatrix[2][6] = true;
        adjMatrix[3][4] = true;
        adjMatrix[4][5] = true; adjMatrix[4][6] = true;
        adjMatrix[5][3] = true;
        adjMatrix[6][7] = true;
        adjMatrix[7][8] = true;
        adjMatrix[8][6] = true;
        
        adjMatrix[6][1] = true;*/

		ElementaryCyclesSearch ecs = new ElementaryCyclesSearch(adjMatrix, nodes);
		List cycles = ecs.getElementaryCycles();
		for (int i = 0; i < cycles.size(); i++) {
			List cycle = (List) cycles.get(i);
			for (int j = 0; j < cycle.size(); j++) {
				String node = (String) cycle.get(j);
				if (j < cycle.size() - 1) {
					System.out.print(node + " -> ");
				} else {
					System.out.print(node);
				}
			}
			System.out.print("\n");
		}
	}

}