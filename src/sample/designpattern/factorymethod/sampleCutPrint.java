package sample.designpattern.factorymethod;

public class sampleCutPrint extends CutPrint {

	@Override
	protected void draw(Cuttable hanzai) {
		System.out.println("書く");
	}

	@Override
	protected void cut(Cuttable hanzai) {
		System.out.println("切る");
	}

	@Override
	protected void print(Cuttable hanzai) {
		System.out.println("プリントする");
	}
	
	protected Cuttable cuttable() {
		return new Potato();
	}

}
