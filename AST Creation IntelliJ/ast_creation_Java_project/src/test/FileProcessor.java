package test;

import ast_maker.MethodAST;
import file_hadling.LoadJson;
import file_hadling.LoadJsonArray;

public class FileProcessor {
	String dir="";
	public FileProcessor(String dir)
	{
		this.dir=dir;
	}
	public void loadAndSave(String filename) {
		LoadJsonArray loadJson = new LoadJsonArray(dir+filename);
		
		MethodAST methodAST = new MethodAST();
		methodAST.prepareASTs(loadJson.getMethods());
		loadJson.addAST(methodAST.getASTList());

		loadJson.saveJson(dir+"ast_"+filename);
		
		System.out.println(filename+" ... done!!");
	}
}