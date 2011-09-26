package controllers;

import play.*;
import play.mvc.*;
import play.data.validation.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

		public static void sayHello(@Required String myName) {
				if (validation.hasErrors()) {
						flash.error("Ooops, please enter your real name!");
						index();
				}
				render(myName);
		}

}
