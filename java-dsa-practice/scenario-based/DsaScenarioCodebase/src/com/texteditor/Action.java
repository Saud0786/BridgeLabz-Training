package com.texteditor;

class Action {
	
	// INSERT or DELETE
    String type;    
    String text;

    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}
