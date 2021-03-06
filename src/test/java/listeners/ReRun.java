package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import common.Retry;

public class ReRun implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation iTestAnnotation, Class aclass, Constructor constructor,
			Method method) {
		IRetryAnalyzer iRetryAnalyzer = iTestAnnotation.getRetryAnalyzer();
		if(iRetryAnalyzer == null){
			iTestAnnotation.setRetryAnalyzer(Retry.class);
		}
	}

}
