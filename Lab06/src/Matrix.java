import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Matrix {
	private int height, width;
	private double[][] data;
	
	public Matrix(double[][] data) {
		this.height = data.length;
		this.width = data[0].length;
		
		this.data = data;
		
	}
	
	public Matrix(File csv) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(csv));
		ArrayList<String> rows = new ArrayList<String>();
		
		while(br.ready()) rows.add(br.readLine());
		this.data = new double[rows.size()][rows.get(0).split(",").length];
		
		this.height = this.data.length;
		this.width = this.data[0].length;
	}
	
	public void printMatrix() {
		for(int i=0;i<this.height;i++) {
			for(int j=0;j<this.width;j++) {
				System.out.print(this.data[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double[][] getData() {
		return data;
	}

	public void setData(double[][] data) {
		this.data = data;
	}
	
	
	
}
