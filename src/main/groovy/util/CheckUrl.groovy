package util

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class CheckUrl {

	static main(args) {
		println  c("http://www.baidu.com","x.select('form').size() ==2")
	}


	static boolean c(String url,String eval){
		def t=url.toURL().getText("utf-8");
		Document doc =Jsoup.parse(t);
		return Eval.x(doc,eval);
	}
}
